package com.example.composableelements.presentation.composables

import androidx.annotation.Size
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composableelements.ui.theme.BaseBlue
import com.example.composableelements.ui.theme.LightViolet

@Composable
fun SimpleBlueButton(text: String, onClick: () -> Unit) {
    Button(
        onClick,
        shape = RoundedCornerShape(13.dp),
        colors = ButtonDefaults.buttonColors(BaseBlue), modifier =  Modifier.padding(start = 34.dp, end = 26.dp).fillMaxWidth().height(54.dp)
    ) {
        Text(text, style = MaterialTheme.typography.titleMedium, color = Color.White)
    }

}

@Composable
fun SimpleDarkTextButton(text: String,colors: Color, onClick: () -> Unit) {
    Button(
        onClick,
        shape = RoundedCornerShape(13.dp),
        colors = ButtonDefaults.buttonColors(colors), modifier =  Modifier.padding(start = 34.dp, end = 26.dp).fillMaxWidth().height(54.dp)
    ) {
        Text(text, style = MaterialTheme.typography.titleMedium, color = Color.Black)
    }

}

@Preview
@Composable
private fun pre() {
    MaterialTheme { SimpleDarkTextButton("Next", LightViolet,{}) }
}