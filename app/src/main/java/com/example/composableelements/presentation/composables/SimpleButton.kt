package com.example.composableelements.presentation.composables

import androidx.annotation.Size
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SimpleButton(text: String, onClick: () -> Unit, colorButton: Color, colorText: Color, isCenter: Boolean) {
    Button(
        onClick,
        shape = RoundedCornerShape(20.dp),
        colors = ButtonDefaults.buttonColors(colorButton), modifier = if (isCenter) Modifier else Modifier.fillMaxWidth()
    ) {
        Text(text, fontSize = 20.sp)
    }
}