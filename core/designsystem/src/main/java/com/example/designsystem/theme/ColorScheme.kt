package com.example.designsystem.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

/**
 * Created by Shaheer cs on 20/07/2024.
 */
data class ColorScheme(
    val primary: Color = Color.Unspecified,
    val secondary: Color = Color.Unspecified,
    val tertiary: Color = Color.Unspecified,
    val selectedText: Color = Color.Unspecified,
    val unSelectedText: Color = Color.Unspecified
)

val LocalColorScheme = staticCompositionLocalOf { ColorScheme() }
