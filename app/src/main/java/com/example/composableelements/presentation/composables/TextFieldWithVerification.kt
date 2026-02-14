package com.example.composableelements.presentation.composables

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composableelements.ui.theme.ComposableElementsTheme

@Composable
fun TextFieldWithVerification(label: String = "") {
    val email = remember { mutableStateOf("") }
    OutlinedTextField(
        value = email.value,
        onValueChange = { email.value = it },
        label = { Text(text = label, style = MaterialTheme.typography.bodySmall, modifier = Modifier.padding(top=10.dp)) },
        modifier = Modifier
            .width(327.dp)
            .height(84.dp),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedContainerColor = Color.LightGray,
            focusedContainerColor = Color.LightGray,
            focusedBorderColor = Color.LightGray,
            unfocusedBorderColor = Color.LightGray
        ), shape = RoundedCornerShape(17.dp)
    )
}

@Preview
@Composable
private fun pr() {
    ComposableElementsTheme { TextFieldWithVerification("Email") }
}
