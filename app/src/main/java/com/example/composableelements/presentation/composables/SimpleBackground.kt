package com.example.composableelements.presentation.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composableelements.ui.theme.BaseBlue
import com.example.composableelements.ui.theme.ComposableElementsTheme

@Composable
fun SampleBackground(modifier: Modifier = Modifier) {
    Column(Modifier.fillMaxSize().background(BaseBlue)) {
        Column(Modifier.padding(top = 150.dp).fillMaxSize().background(Color.White, RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp))) {  }
    }
}

@Preview
@Composable
private fun prev() {
    ComposableElementsTheme { SampleBackground() }
}