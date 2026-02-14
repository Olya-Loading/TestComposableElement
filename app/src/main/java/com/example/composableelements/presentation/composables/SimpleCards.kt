package com.example.composableelements.presentation.composables

import android.annotation.SuppressLint
import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composableelements.R
import com.example.composableelements.ui.theme.ComposableElementsTheme
import com.example.composableelements.ui.theme.LightViolet


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CardOfPoint(image: Int, name: String, point: String) {
    Row(
        modifier = Modifier

            .padding(start = 21.dp, end = 9.dp)
            .fillMaxWidth()
            .height(67.dp)
            .background(Color.White, RoundedCornerShape(9.dp))
            .border(width = 1.dp, Color.Blue, RoundedCornerShape(9.dp))

    ) {
        Box(
            Modifier
                .padding(start = 15.dp, top = 8.dp, bottom = 10.dp)
                .width(57.dp)
                .height(48.dp)
                .background(Color.LightGray, shape = RoundedCornerShape(10.dp)),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.card1),
                contentDescription = "",
                modifier = Modifier.size(38.dp)
            )
        }
        Column(
            modifier = Modifier
                .padding(start = 5.dp, top = 8.dp)
                .fillMaxWidth()
        ) {
            Text(text = name)
            Text(text = point, color = Color.Gray)
        }
    }
}


@Composable
fun CardGame(image:Int, title:String) {
    Box(modifier = Modifier.width(157.dp).height(131.dp).background(LightViolet, RoundedCornerShape(11.dp))){
        Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(image), contentDescription = "", modifier = Modifier.width(92.dp).height(75.dp) )
            Text(text = title, color = Color.Gray, style = MaterialTheme.typography.bodyMedium)
        }
    }
}

@Preview
@Composable
private fun p() {
    ComposableElementsTheme { TextFieldWithVerification("")}
}