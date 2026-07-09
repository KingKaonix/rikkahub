package me.rerere.rikkahub.ui.theme.presets

import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import me.rerere.rikkahub.R
import me.rerere.rikkahub.ui.theme.PresetTheme

val Spatial3DThemePreset by lazy {
    PresetTheme(
        id = "spatial3d",
        name = {
            Text(stringResource(id = R.string.theme_name_spatial3d))
        },
        standardLight = lightScheme,
        standardDark = darkScheme,
    )
}

// Light
private val primaryLight = Color(0xFF4A6074)
private val onPrimaryLight = Color(0xFFFFFFFF)
private val primaryContainerLight = Color(0xFFD3E5F9)
private val onPrimaryContainerLight = Color(0xFF051D2E)
private val secondaryLight = Color(0xFF526070)
private val onSecondaryLight = Color(0xFFFFFFFF)
private val secondaryContainerLight = Color(0xFFD5E4F7)
private val onSecondaryContainerLight = Color(0xFF0E1D2A)
private val tertiaryLight = Color(0xFF685778)
private val onTertiaryLight = Color(0xFFFFFFFF)
private val tertiaryContainerLight = Color(0xFFF1DAFF)
private val onTertiaryContainerLight = Color(0xFF231531)
private val errorLight = Color(0xFFBA1A1A)
private val onErrorLight = Color(0xFFFFFFFF)
private val errorContainerLight = Color(0xFFFFDAD6)
private val onErrorContainerLight = Color(0xFF410002)
private val backgroundLight = Color(0xFFF9F9FF)
private val onBackgroundLight = Color(0xFF1A1B1F)
private val surfaceLight = Color(0xFFF9F9FF)
private val onSurfaceLight = Color(0xFF1A1B1F)
private val surfaceVariantLight = Color(0xFFDFE2EB)
private val onSurfaceVariantLight = Color(0xFF43474E)
private val outlineLight = Color(0xFF73777F)
private val outlineVariantLight = Color(0xFFC3C6CF)
private val scrimLight = Color(0xFF000000)
private val inverseSurfaceLight = Color(0xFF2F3034)
private val inverseOnSurfaceLight = Color(0xFFF1F0F4)
private val inversePrimaryLight = Color(0xFFA6C9E4)
private val surfaceDimLight = Color(0xFFD9D9E0)
private val surfaceBrightLight = Color(0xFFF9F9FF)
private val surfaceContainerLowestLight = Color(0xFFFFFFFF)
private val surfaceContainerLowLight = Color(0xFFF3F3FA)
private val surfaceContainerLight = Color(0xFFEDEDFA)
private val surfaceContainerHighLight = Color(0xFFE7E7F4)
private val surfaceContainerHighestLight = Color(0xFFE2E2EE)

// Dark
private val primaryDark = Color(0xFFA6C9E4)
private val onPrimaryDark = Color(0xFF1B3345)
private val primaryContainerDark = Color(0xFF32485B)
private val onPrimaryContainerDark = Color(0xFFD3E5F9)
private val secondaryDark = Color(0xFFB9C8DB)
private val onSecondaryDark = Color(0xFF243241)
private val secondaryContainerDark = Color(0xFF3B4958)
private val onSecondaryContainerDark = Color(0xFFD5E4F7)
private val tertiaryDark = Color(0xFFD4BEE4)
private val onTertiaryDark = Color(0xFF382A48)
private val tertiaryContainerDark = Color(0xFF504060)
private val onTertiaryContainerDark = Color(0xFFF1DAFF)
private val errorDark = Color(0xFFFFB4AB)
private val onErrorDark = Color(0xFF690005)
private val errorContainerDark = Color(0xFF93000A)
private val onErrorContainerDark = Color(0xFFFFDAD6)
private val backgroundDark = Color(0xFF1A1B1F)
private val onBackgroundDark = Color(0xFFE3E1E6)
private val surfaceDark = Color(0xFF1A1B1F)
private val onSurfaceDark = Color(0xFFE3E1E6)
private val surfaceVariantDark = Color(0xFF43474E)
private val onSurfaceVariantDark = Color(0xFFC3C6CF)
private val outlineDark = Color(0xFF8D9199)
private val outlineVariantDark = Color(0xFF43474E)
private val scrimDark = Color(0xFF000000)
private val inverseSurfaceDark = Color(0xFFE3E1E6)
private val inverseOnSurfaceDark = Color(0xFF303034)
private val inversePrimaryDark = Color(0xFF4A6074)
private val surfaceDimDark = Color(0xFF1A1B1F)
private val surfaceBrightDark = Color(0xFF404044)
private val surfaceContainerLowestDark = Color(0xFF141418)
private val surfaceContainerLowDark = Color(0xFF222326)
private val surfaceContainerDark = Color(0xFF26262A)
private val surfaceContainerHighDark = Color(0xFF313135)
private val surfaceContainerHighestDark = Color(0xFF3B3C40)


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
