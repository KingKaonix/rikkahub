package me.rerere.rikkahub.ui.theme.presets

import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import me.rerere.rikkahub.R
import me.rerere.rikkahub.ui.theme.PresetTheme

val DenseProThemePreset by lazy {
    PresetTheme(
        id = "densepro",
        name = {
            Text(stringResource(id = R.string.theme_name_densepro))
        },
        standardLight = lightScheme,
        standardDark = darkScheme,
    )
}

// Clean Light
private val primaryLight = Color(0xFF1A1C1E)
private val onPrimaryLight = Color(0xFFFFFFFF)
private val primaryContainerLight = Color(0xFFE1E3E5)
private val onPrimaryContainerLight = Color(0xFF1A1C1E)
private val secondaryLight = Color(0xFF505862)
private val onSecondaryLight = Color(0xFFFFFFFF)
private val secondaryContainerLight = Color(0xFFD4E2EE)
private val onSecondaryContainerLight = Color(0xFF0C1925)
private val tertiaryLight = Color(0xFF605D7E)
private val onTertiaryLight = Color(0xFFFFFFFF)
private val tertiaryContainerLight = Color(0xFFE6DEFF)
private val onTertiaryContainerLight = Color(0xFF1C1938)
private val errorLight = Color(0xFFBA1A1A)
private val onErrorLight = Color(0xFFFFFFFF)
private val errorContainerLight = Color(0xFFFFDAD6)
private val onErrorContainerLight = Color(0xFF410002)
private val backgroundLight = Color(0xFFF9F9FF)
private val onBackgroundLight = Color(0xFF1A1B21)
private val surfaceLight = Color(0xFFF9F9FF)
private val onSurfaceLight = Color(0xFF1A1B21)
private val surfaceVariantLight = Color(0xFFE0E2EC)
private val onSurfaceVariantLight = Color(0xFF44474F)
private val outlineLight = Color(0xFF74777F)
private val outlineVariantLight = Color(0xFFC4C6D0)
private val scrimLight = Color(0xFF000000)
private val inverseSurfaceLight = Color(0xFF2F3036)
private val inverseOnSurfaceLight = Color(0xFFF1F0F7)
private val inversePrimaryLight = Color(0xFFC8C6D0)
private val surfaceDimLight = Color(0xFFD9D9E0)
private val surfaceBrightLight = Color(0xFFF9F9FF)
private val surfaceContainerLowestLight = Color(0xFFFFFFFF)
private val surfaceContainerLowLight = Color(0xFFF3F3FA)
private val surfaceContainerLight = Color(0xFFEDEDFA)
private val surfaceContainerHighLight = Color(0xFFE8E7F4)
private val surfaceContainerHighestLight = Color(0xFFE2E1EF)

// High Contrast Dark
private val primaryDark = Color(0xFFC8C6D0)
private val onPrimaryDark = Color(0xFF302F38)
private val primaryContainerDark = Color(0xFF46454E)
private val onPrimaryContainerDark = Color(0xFFE4E2EC)
private val secondaryDark = Color(0xFFB8C6D3)
private val onSecondaryDark = Color(0xFF22303C)
private val secondaryContainerDark = Color(0xFF394855)
private val onSecondaryContainerDark = Color(0xFFD4E2EE)
private val tertiaryDark = Color(0xFFCAC0E7)
private val onTertiaryDark = Color(0xFF312E4E)
private val tertiaryContainerDark = Color(0xFF484566)
private val onTertiaryContainerDark = Color(0xFFE6DEFF)
private val errorDark = Color(0xFFFFB4AB)
private val onErrorDark = Color(0xFF690005)
private val errorContainerDark = Color(0xFF93000A)
private val onErrorContainerDark = Color(0xFFFFDAD6)
private val backgroundDark = Color(0xFF121318)
private val onBackgroundDark = Color(0xFFE3E1E9)
private val surfaceDark = Color(0xFF121318)
private val onSurfaceDark = Color(0xFFE3E1E9)
private val surfaceVariantDark = Color(0xFF44474F)
private val onSurfaceVariantDark = Color(0xFFC4C6D0)
private val outlineDark = Color(0xFF8E8F98)
private val outlineVariantDark = Color(0xFF44474F)
private val scrimDark = Color(0xFF000000)
private val inverseSurfaceDark = Color(0xFFE3E1E9)
private val inverseOnSurfaceDark = Color(0xFF2F3036)
private val inversePrimaryDark = Color(0xFF58565F)
private val surfaceDimDark = Color(0xFF121318)
private val surfaceBrightDark = Color(0xFF38383E)
private val surfaceContainerLowestDark = Color(0xFF0D0E13)
private val surfaceContainerLowDark = Color(0xFF1A1B21)
private val surfaceContainerDark = Color(0xFF1F1F25)
private val surfaceContainerHighDark = Color(0xFF29292F)
private val surfaceContainerHighestDark = Color(0xFF343439)


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
