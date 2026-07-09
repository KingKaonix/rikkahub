package me.rerere.rikkahub.ui.theme.presets

import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import me.rerere.rikkahub.R
import me.rerere.rikkahub.ui.theme.PresetTheme

val CyberpunkThemePreset by lazy {
    PresetTheme(
        id = "cyberpunk",
        name = {
            Text(stringResource(id = R.string.theme_name_cyberpunk))
        },
        standardLight = lightScheme,
        standardDark = darkScheme,
    )
}

private val primaryLight = Color(0xFFFF00FF) // Neon Magenta
private val onPrimaryLight = Color(0xFF000000)
private val primaryContainerLight = Color(0xFFFF00FF)
private val onPrimaryContainerLight = Color(0xFF000000)
private val secondaryLight = Color(0xFF00FFFF) // Neon Cyan
private val onSecondaryLight = Color(0xFF000000)
private val secondaryContainerLight = Color(0xFF00FFFF)
private val onSecondaryContainerLight = Color(0xFF000000)
private val tertiaryLight = Color(0xFFFFFF00) // Neon Yellow
private val onTertiaryLight = Color(0xFF000000)
private val tertiaryContainerLight = Color(0xFFFFFF00)
private val onTertiaryContainerLight = Color(0xFF000000)
private val errorLight = Color(0xFFFF1744)
private val onErrorLight = Color(0xFFFFFFFF)
private val errorContainerLight = Color(0xFFFFDAD6)
private val onErrorContainerLight = Color(0xFF410002)
private val backgroundLight = Color(0xFFF8FAFC)
private val onBackgroundLight = Color(0xFF1A1C1E)
private val surfaceLight = Color(0xFFF8FAFC)
private val onSurfaceLight = Color(0xFF1A1C1E)
private val surfaceVariantLight = Color(0xFFF3F0F4)
private val onSurfaceVariantLight = Color(0xFF48454A)
private val outlineLight = Color(0xFF787680)
private val outlineVariantLight = Color(0xFFC9C5D0)
private val scrimLight = Color(0xFF000000)
private val inverseSurfaceLight = Color(0xFF2E3134)
private val inverseOnSurfaceLight = Color(0xFFEFF1F2)
private val inversePrimaryLight = Color(0xFFE068FF)
private val surfaceDimLight = Color(0xFFDDE0E2)
private val surfaceBrightLight = Color(0xFFF8FAFC)
private val surfaceContainerLowestLight = Color(0xFFFFFFFF)
private val surfaceContainerLowLight = Color(0xFFF2F4F7)
private val surfaceContainerLight = Color(0xFFECEEEF)
private val surfaceContainerHighLight = Color(0xFFE6E9EB)
private val surfaceContainerHighestLight = Color(0xFFE0E3E6)

private val primaryDark = Color(0xFFFF00FF)
private val onPrimaryDark = Color(0xFF520066)
private val primaryContainerDark = Color(0xFF520066)
private val onPrimaryContainerDark = Color(0xFFFF00FF)
private val secondaryDark = Color(0xFF00FFFF)
private val onSecondaryDark = Color(0xFF003D3D)
private val secondaryContainerDark = Color(0xFF003D3D)
private val onSecondaryContainerDark = Color(0xFF00FFFF)
private val tertiaryDark = Color(0xFFFFFF00)
private val onTertiaryDark = Color(0xFF3D3B00)
private val tertiaryContainerDark = Color(0xFF3D3B00)
private val onTertiaryContainerDark = Color(0xFFFFFF00)
private val errorDark = Color(0xFFFFB4AB)
private val onErrorDark = Color(0xFF690005)
private val errorContainerDark = Color(0xFF93000A)
private val onErrorContainerDark = Color(0xFFFFDAD6)
private val backgroundDark = Color(0xFF1A1C1E)
private val onBackgroundDark = Color(0xFFE3E2E6)
private val surfaceDark = Color(0xFF1A1C1E)
private val onSurfaceDark = Color(0xFFE3E2E6)
private val surfaceVariantDark = Color(0xFF48454A)
private val onSurfaceVariantDark = Color(0xFFC9C5D0)
private val outlineDark = Color(0xFF938F99)
private val outlineVariantDark = Color(0xFF48454A)
private val scrimDark = Color(0xFF000000)
private val inverseSurfaceDark = Color(0xFFE3E2E6)
private val inverseOnSurfaceDark = Color(0xFF31F0FF)
private val inversePrimaryDark = Color(0xFF9A3CBB)
private val surfaceDimDark = Color(0xFF1A1C1E)
private val surfaceBrightDark = Color(0xFF40484D)
private val surfaceContainerLowestDark = Color(0xFF141516)
private val surfaceContainerLowDark = Color(0xFF222425)
private val surfaceContainerDark = Color(0xFF26292A)
private val surfaceContainerHighDark = Color(0xFF313334)
private val surfaceContainerHighestDark = Color(0xFF3B3D3F)

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
