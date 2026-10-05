package com.example.akmobileapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFFAAC7FF),
    onPrimary = Color(0xFF0A305F),

    secondary = Color(0xFFDFB9F5),
    onSecondary = Color(0xFF412256),

    background = Color(0xFF111318),
    onBackground = Color(0xFFE2E2E9),

    surface = Color(0xFF111318),
    onSurface = Color(0xFFE2E2E9),

    surfaceVariant = Color(0xFF44474F),
    onSurfaceVariant = Color(0xFFC4C6D0)
)

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF415F91),
    onPrimary = Color.White,

    secondary = Color(0xFF725188),
    onSecondary = Color.White,

    background = Color(0xFFF9F9FF),
    onBackground = Color(0xFF191C20),

    surface = Color(0xFFF9F9FF),
    onSurface = Color(0xFF191C20),

    surfaceVariant = Color(0xFFE0E2EC),
    onSurfaceVariant = Color(0xFF44474F)
)


    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */


@Composable
fun AkMobileAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

