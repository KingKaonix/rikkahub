package me.rerere.rikkahub.ui.theme.presets

import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import me.rerere.rikkahub.R
import me.rerere.rikkahub.ui.theme.PresetTheme

val GlassmorphismThemePreset by lazy {
    PresetTheme(
        id = "glassmorphism",
        name = {
            Text(stringResource(id = R.string.theme_name_glassmorphism))
        },
        standardLight = lightScheme,
        standardDark = darkScheme,
    )
}

// Transparent/Frosted Light
private val primaryLight = Color(0xFF0062FF)
private val onPrimaryLight = Color(0xFFFFFFFF)
private val primaryContainerLight = Color(0xFFDCE1FF)
private val onPrimaryContainerLight = Color(0xFF001944)
private val secondaryLight = Color(0xFF595D71)
private val onSecondaryLight = Color(0xFFFFFFFF)
private val secondaryContainerLight = Color(0xFFDEE1F9)
private val onSecondaryContainerLight = Color(0xFF161B2C)
private val tertiaryLight = Color(0xFF735573)
private val onTertiaryLight = Color(0xFFFFFFFF)
private val tertiaryContainerLight = Color(0xFFFFD7F8)
private val onTertiaryContainerLight = Color(0xFF2B132C)
private val errorLight = Color(0xFFBA1A1A)
private val onErrorLight = Color(0xFFFFFFFF)
private val errorContainerLight = Color(0xFFFFDAD6)
private val onErrorContainerLight = Color(0xFF410002)
private val backgroundLight = Color(0x1AFFFFFF) // 10% White opacity
private val onBackgroundLight = Color(0xFF1A1C20)
private val surfaceLight = Color(0x33FFFFFF) // 20% White opacity
private val onSurfaceLight = Color(0xFF1A1C20)
private val surfaceVariantLight = Color(0x40FFFFFF) // 25% White opacity
private val onSurfaceVariantLight = Color(0xFF44474F)
private val outlineLight = Color(0xFF74777F)
private val outlineVariantLight = Color(0xFFC4C6CF)
private val scrimLight = Color(0x99FFFFFF) // 60% White
private val inverseSurfaceLight = Color(0xFF2F3035)
private val inverseOnSurfaceLight = Color(0xFFF1F0F6)
private val inversePrimaryLight = Color(0xFFB6C5FF)
private val surfaceDimLight = Color(0x99F3F0FF)
private val surfaceBrightLight = Color(0x99FFFFFF)
private val surfaceContainerLowestLight = Color(0xFFFFFFFF)
private val surfaceContainerLowLight = Color(0x1AFFFFFF)
private val surfaceContainerLight = Color(0x33FFFFFF)
private val surfaceContainerHighLight = Color(0x40FFFFFF)
private val surfaceContainerHighestLight = Color(0x52FFFFFF)

// Transparent/Frosted Dark
private val primaryDark = Color(0xFFB6C5FF)
private val onPrimaryDark = Color(0xFF2E4680)
private val primaryContainerDark = Color(0xFF455F9B)
private val onPrimaryContainerDark = Color(0xFFDCE1FF)
private val secondaryDark = Color(0xFFC2C6DE)
private val onSecondaryDark = Color(0xFF2B2F42)
private val secondaryContainerDark = Color(0xFF424659)
private val onSecondaryContainerDark = Color(0xFFDEE1F9)
private val tertiaryDark = Color(0xFFE2BBE2)
private val onTertiaryDark = Color(0xFF422942)
private val tertiaryContainerDark = Color(0xFF5A3E5A)
private val onTertiaryContainerDark = Color(0xFFFFD7F8)
private val errorDark = Color(0xFFFFB4AB)
private val onErrorDark = Color(0xFF690005)
private val errorContainerDark = Color(0xFF93000A)
private val onErrorContainerDark = Color(0xFFFFDAD6)
private val backgroundDark = Color(0x1A000000) // 10% Black opacity
private val onBackgroundDark = Color(0xFFE3E1E6)
private val surfaceDark = Color(0x33000000) // 20% Black opacity
private val onSurfaceDark = Color(0xFFE3E1E6)
private val surfaceVariantDark = Color(0x40000000) // 25% Black opacity
private val onSurfaceVariantDark = Color(0xFFC4C6CF)
private val outlineDark = Color(0xFF8E9099)
private val outlineVariantDark = Color(0xFF44474F)
private val scrimDark = Color(0x99000000) // 60% Black
private val inverseSurfaceDark = Color(0xFFE3E1E6)
private val inverseOnSurfaceDark = Color(0xFF302F35)
private val inversePrimaryDark = Color(0xFF4C4F9B)
private val surfaceDimDark = Color(0x991A0D36)
private val surfaceBrightDark = Color(0x99413560)
private val surfaceContainerLowestDark = Color(0x1A000000)
private val surfaceContainerLowDark = Color(0x33000000)
private val surfaceContainerDark = Color(0x40000000)
private val surfaceContainerHighDark = Color(0x52000000)
private val surfaceContainerHighestDark = Color(0x66000000)


private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)
