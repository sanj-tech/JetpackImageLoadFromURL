package com.example.imagefetchfromwebwithjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.imagefetchfromwebwithjetpack.ui.theme.ImageFetchFromWebWithJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImageFetchFromWebWithJetpackTheme {
                DisplayImageFromUrl()
            }
        }
    }

    @Composable
    fun DisplayImageFromUrl() {
        Image(
            painter = rememberImagePainter(
                "https://via.placeholder.com/150/810b14"
            ),
            contentDescription = "Profile Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .border(5.5.dp, Color.Red, CircleShape)
                .size(200.dp)
                .clip(CircleShape)


        )
    }




    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        DisplayImageFromUrl()

    }
}


