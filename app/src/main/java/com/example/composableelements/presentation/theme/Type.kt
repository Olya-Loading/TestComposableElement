package com.example.composableelements.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.composableelements.R

val fredoka = FontFamily(
    Font(R.font.fredoka_semibold, FontWeight.SemiBold),
    Font(R.font.fredoka_regular, FontWeight.Normal),
    Font(R.font.fredoka_bold, FontWeight.Bold),
    Font(R.font.fredoka_medium, FontWeight.Medium)
)
val Typography = Typography(
    titleMedium = TextStyle(
        fontFamily = fredoka,
        fontWeight = FontWeight.Medium,
        fontSize = 22.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = fredoka,
        fontWeight = FontWeight.Bold,
        fontSize = 17.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = fredoka,
        fontWeight = FontWeight.SemiBold,
        fontSize = 17.sp
    ),
    bodySmall = TextStyle(
        fontFamily = fredoka,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp
    )

    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)