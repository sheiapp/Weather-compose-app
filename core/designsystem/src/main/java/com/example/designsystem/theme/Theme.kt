package com.example.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

/**
 * Created by Shaheer cs on 21/07/2024.
 */

val LightDefaultColorScheme = ColorScheme(
    primary = Blue10,
    secondary = Blue20,
    tertiary = Blue30,
    selectedText = White90,
    unSelectedText = White80
)

val DarkDefaultColorScheme = ColorScheme(
    primary = DarkBlue10,
    secondary = DarkBlue20,
    tertiary = DarkBlue30,
    selectedText = White90,
    unSelectedText = White80
)

@Composable
fun WeatherAppTheme(
darkTheme: Boolean = isSystemInDarkTheme(),
content: @Composable () -> Unit
) {
    val colorScheme = when{
        darkTheme -> DarkDefaultColorScheme
        else -> LightDefaultColorScheme
    }

    CompositionLocalProvider(
        LocalColorScheme provides colorScheme,
        LocalTypography provides WeatherTypography
    ){
        content()
    }

}
