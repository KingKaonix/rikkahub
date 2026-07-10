#!/bin/bash

REPO="KingKaonix/rikkahub"

echo "--- GitHub Actions Android Keystore Secrets Setup ---"
echo "This script will help you set up the necessary secrets for signing your Android APK in GitHub Actions."
echo "You will be prompted for your keystore file path and passwords."
echo "-----------------------------------------------------"

# 1. Check if gh-cli is installed
if ! command -v gh &> /dev/null
then
    echo "Error: GitHub CLI (gh) is not installed."
    echo "Please install it from https://cli.github.com before running this script."
    exit 1
fi

# 2. Check gh-cli authentication status
echo "Checking GitHub CLI authentication status..."
if ! gh auth status &> /dev/null
then
    echo "You are not authenticated with GitHub CLI."
    echo "Please authenticate now. You will be guided through a browser-based authentication flow."
    gh auth login --web -h github.com --scopes "repo,workflow"
    if [ $? -ne 0 ]; then
        echo "Authentication failed. Exiting."
        exit 1
    fi
    echo "Authentication successful!"
fi


# Check if keytool is installed
if ! command -v keytool &> /dev/null
then
    echo "Error: 'keytool' is not found. Please ensure Java Development Kit (JDK) is installed and in your PATH."
    exit 1
fi

# 3. Get keystore file path or create a new one
KEYSTORE_FILE=""
KEYSTORE_ACTION=""

echo ""
echo "Do you have an existing Android keystore file, or would you like to create a new one?"
select ks_choice in "Use existing keystore" "Create new keystore"; do
    case $ks_choice in
        "Use existing keystore" ) KEYSTORE_ACTION="existing"; break;;
        "Create new keystore" ) KEYSTORE_ACTION="new"; break;;
        * ) echo "Invalid option $REPLY";;
    esac
done

if [ "$KEYSTORE_ACTION" == "new" ]; then
    echo ""
    echo "--- Creating New Keystore ---"
    DEFAULT_KEYSTORE_PATH="$HOME/.android/upload-keystore.jks"
    read -p "Enter the absolute path where you want to create the new keystore file (default: $DEFAULT_KEYSTORE_PATH): " NEW_KEYSTORE_PATH
    NEW_KEYSTORE_PATH=${NEW_KEYSTORE_PATH:-$DEFAULT_KEYSTORE_PATH}

    if [ -f "$NEW_KEYSTORE_PATH" ]; then
        read -p "Warning: Keystore file '$NEW_KEYSTORE_PATH' already exists. Overwrite? (y/N) " OVERWRITE_CHOICE
        if [[ ! "$OVERWRITE_CHOICE" =~ ^[yY]$ ]]; then
            echo "Operation cancelled. Please choose a different path or use an existing keystore."
            exit 1
        fi
    fi
    
    echo "Creating directory for keystore if it doesn't exist: $(dirname "$NEW_KEYSTORE_PATH")"
    mkdir -p "$(dirname "$NEW_KEYSTORE_PATH")"

    echo "Running keytool to generate new keystore..."
    KEYSTORE_ALIAS="upload" # Default alias

    keytool -genkey -v -keystore "$NEW_KEYSTORE_PATH" \
            -alias "$KEYSTORE_ALIAS" -keyalg RSA -keysize 2048 -validity 10000

    if [ $? -ne 0 ]; then
        echo "Error: Keystore creation failed. Please check the keytool output. Exiting."
        exit 1
    fi
    KEYSTORE_FILE="$NEW_KEYSTORE_PATH"
    KEY_ALIAS="$KEYSTORE_ALIAS"
    # keytool prompts for passwords, so we'll retrieve them again later
    echo "New keystore created successfully at: $KEYSTORE_FILE"
    echo "Default alias used: $KEY_ALIAS"
elif [ "$KEYSTORE_ACTION" == "existing" ]; then
    while [ -z "$KEYSTORE_FILE" ]; do
        read -p "Enter the absolute path to your existing Android keystore file (e.g., /home/user/my-release-key.jks): " KEYSTORE_FILE
        if [ ! -f "$KEYSTORE_FILE" ]; then
            echo "Error: File not found. Please enter a valid path."
            KEYSTORE_FILE=""
        fi
    done
fi

echo "Encoding keystore file to base64..."
KEYSTORE_BASE64=$(base64 -w 0 "$KEYSTORE_FILE")
if [ -z "$KEYSTORE_BASE64" ]; then
    echo "Error: Failed to base64 encode the keystore file. Exiting."
    exit 1
fi
echo "Keystore file encoded successfully."

# 4. Get keystore password (even if new, keytool prompted for it)
read -s -p "Enter your Android keystore password: " KEYSTORE_PASSWORD
echo ""
if [ -z "$KEYSTORE_PASSWORD" ]; then
    echo "Error: Keystore password cannot be empty. Exiting."
    exit 1
fi

# 5. Get key alias (if not already set from new keystore creation)
if [ -z "$KEY_ALIAS" ]; then
    read -p "Enter your Android key alias (name of the key within the keystore): " KEY_ALIAS
    if [ -z "$KEY_ALIAS" ]; then
        echo "Error: Key alias cannot be empty. Exiting."
        exit 1
    fi
fi

# 6. Get key password (even if new, keytool prompted for it)
read -s -p "Enter your Android key password (for the alias '$KEY_ALIAS'): " KEY_PASSWORD
echo ""
if [ -z "$KEY_PASSWORD" ]; then
    echo "Error: Key password cannot be empty. Exiting."
    exit 1
fi

echo "Setting GitHub secrets for repository: $REPO ..."

# Set secrets
echo "Setting ANDROID_SIGNING_KEYSTORE_BASE64..."
gh secret set ANDROID_SIGNING_KEYSTORE_BASE64 --repo "$REPO" --body "$KEYSTORE_BASE64"
if [ $? -ne 0 ]; then echo "Failed to set ANDROID_SIGNING_KEYSTORE_BASE64. Exiting."; exit 1; fi

echo "Setting ANDROID_SIGNING_KEYSTORE_PASSWORD..."
gh secret set ANDROID_SIGNING_KEYSTORE_PASSWORD --repo "$REPO" --body "$KEYSTORE_PASSWORD"
if [ $? -ne 0 ]; then echo "Failed to set ANDROID_SIGNING_KEYSTORE_PASSWORD. Exiting."; exit 1; fi

echo "Setting ANDROID_SIGNING_KEY_ALIAS..."
gh secret set ANDROID_SIGNING_KEY_ALIAS --repo "$REPO" --body "$KEY_ALIAS"
if [ $? -ne 0 ]; then echo "Failed to set ANDROID_SIGNING_KEY_ALIAS. Exiting."; exit 1; fi

echo "Setting ANDROID_SIGNING_KEY_PASSWORD..."
gh secret set ANDROID_SIGNING_KEY_PASSWORD --repo "$REPO" --body "$KEY_PASSWORD"
if [ $? -ne 0 ]; then echo "Failed to set ANDROID_SIGNING_KEY_PASSWORD. Exiting."; exit 1; fi

echo "All Android signing secrets have been successfully set on your GitHub repository '$REPO'!"
echo "You can now push your changes to trigger the GitHub Actions workflow."
