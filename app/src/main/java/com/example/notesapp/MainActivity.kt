package com.example.notesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//myShape(shape = RectangleShape)

            var count by remember {
                mutableStateOf(0)
            }
            Column(
                modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = count.toString(), fontSize = 30.sp, color = Color.Blue)

                Button(onClick = {
                                 count++
                }, modifier = Modifier.padding(top = 20.dp) ) {
                    Text(text = "Click me $count")
                }

            }

        }
    }
}

@Composable
fun myShape(shape: androidx.compose.ui.graphics.Shape) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .clip(shape)
                .background(Color.Red)
        )


    }
}


@Composable
fun list() {

    LazyRow(modifier = Modifier.fillMaxSize()) {

        items(25) { image ->
            Image(
                painter = painterResource(id = R.drawable.ic),
                contentDescription = "",
                modifier = Modifier.size(40.dp)
            )

        }

    }


}


@Composable
@Preview(showSystemUi = true)
fun myview() {
  //  myShape(shape = RectangleShape)
}



