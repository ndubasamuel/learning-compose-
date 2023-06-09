package com.example.jtpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jtpackcompose.ui.theme.ComposeTestTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Greeting()

                }
            }
        }
    }
}


@Composable
fun Greeting() {
    Box(
        modifier = Modifier.fillMaxSize(),
    contentAlignment = Alignment.TopCenter
        ){
        Box(modifier = Modifier

            .background(Color.Blue),
            contentAlignment = Alignment.Center


        ){
            Box(modifier = Modifier.height(50.dp).width(50.dp).background(Color.Green))
            Text(text = "I love Android", fontSize = 40.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTestTheme {
       Greeting()


        }
    }



