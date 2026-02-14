package com.example.composableelements.presentation.composables

import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composableelements.R
import com.example.composableelements.ui.theme.BaseBlue
import com.example.composableelements.ui.theme.ComposableElementsTheme
import java.nio.file.WatchEvent

@Composable
fun SampleBackgroundClassic(title: String) {
    Box(Modifier
        .fillMaxSize()
        .background(BaseBlue)) {
        Image(
            painter = painterResource(R.drawable.star_pattern),
            contentDescription = "",
            modifier = Modifier
                .padding(start = 18.dp, end = 23.dp, top = 70.dp)
                .fillMaxWidth()
                .height(63.dp)
        )
        Row(Modifier.padding(top  = 70.dp).fillMaxWidth(), verticalAlignment = Alignment.CenterVertically){
            Icon(painter = painterResource(R.drawable.ic_back), contentDescription = "", modifier = Modifier.padding(start = 31.dp).size(20.dp), tint= Color.White )
            Text(title, style = MaterialTheme.typography.titleMedium, color = Color.White, modifier =  Modifier.padding(start = 56.dp, end = 28.dp))

        }
        Column(
            Modifier
                .padding(top = 113.dp)
                .fillMaxSize()
                .background(Color.White, RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
        ) {
        }
    }
}


@Composable
fun SampleBackgroundWithImage(title: String, textButton: String, onClickButton:()->Unit ) {
    Box(Modifier
        .fillMaxSize()
        .background(BaseBlue)) {
        Image(
            painter = painterResource(R.drawable.star_pattern),
            contentDescription = "",
            modifier = Modifier
                .padding(start = 18.dp, end = 23.dp, top = 70.dp)
                .fillMaxWidth()
                .height(63.dp)
        )
        Row(Modifier.padding(top  = 70.dp).fillMaxWidth(), verticalAlignment = Alignment.CenterVertically){
            Icon(painter = painterResource(R.drawable.ic_back), contentDescription = "", modifier = Modifier.padding(start = 31.dp).size(20.dp), tint= Color.White )
            Text(title, style = MaterialTheme.typography.titleMedium, color = Color.White, modifier =  Modifier.padding(start = 56.dp, end = 28.dp))

        }
        Column(
            Modifier
                .padding(top = 113.dp)
                .fillMaxSize()
                .background(Color.White, RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
        ) {
            Spacer(Modifier.weight(1f))
            Box(modifier = Modifier.fillMaxWidth()){
                Image(painter = painterResource(R.drawable.image_with_flowers), contentDescription = "", modifier = Modifier.fillMaxWidth(), contentScale = ContentScale.FillWidth)
                SimpleBlueButton(textButton, ) {onClickButton }



            }


        }
    }
}


@Composable
fun SampleBackgroundForProfile(modifier: Modifier = Modifier) {
    Box(Modifier
        .fillMaxSize()
        .background(BaseBlue)) {
        Image(
            painter = painterResource(R.drawable.star_pattern),
            contentDescription = "",
            modifier = Modifier
                .padding(start = 18.dp, end = 23.dp, top = 74.dp)
                .fillMaxWidth()
                .height(63.dp)
        )
        Column(
            Modifier
                .padding(top = 221.dp)
                .fillMaxSize()
                .background(Color.White, RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
        ) { }
    }
}

@Preview
@Composable
private fun prev() {
    ComposableElementsTheme { SampleBackgroundWithImage("Guess the animal","Continue", {}) }
}