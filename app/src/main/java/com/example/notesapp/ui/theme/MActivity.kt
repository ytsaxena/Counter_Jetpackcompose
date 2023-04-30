package com.example.notesapp.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.notesapp.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotesAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    // Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Hello $name!",
            color = Color.Red,
            fontSize = 30.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
        )

        Text(
            text = "Hey $name", color = Color.Black, fontSize = 35.sp
        )

    }


}


@Composable
fun Anotherfun(name: String) {

    Row(
        horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Top
    ) {

        Text(
            text = "Hello $name",
            fontSize = 20.sp,
            textDecoration = TextDecoration.Underline,
            color = Color.Green,
            modifier = Modifier.background(Color.Blue)

        )

        Text(
            text = "How are you ",
            fontSize = 35.sp,
            fontStyle = FontStyle.Italic,
            color = Color.Red,
            modifier = Modifier.background(Color.Yellow)

        )

    }

}


@Composable
fun NewFun(name: String) {

    Box(contentAlignment = Alignment.TopCenter) {

        Text(
            text = "Hello $name",
            fontSize = 20.sp,
            textDecoration = TextDecoration.Underline,
            color = Color.Green,
            modifier = Modifier.background(Color.Blue)

        )

        Text(
            text = "How are you ",
            fontSize = 35.sp,
            fontStyle = FontStyle.Italic,
            color = Color.Red,
            modifier = Modifier.align(alignment = Alignment.BottomCenter)

        )


        Image(
            painter = painterResource(id = R.drawable.ic),
            contentDescription = "",
            modifier = Modifier
                .background(Color.Blue)
                .align(alignment = Alignment.TopEnd)
        )

        if (name.length > 5) {

            Icon(imageVector = Icons.Sharp.Add, contentDescription = "")
        }

        Column(modifier = Modifier.align(alignment = Alignment.Center)) {
            for (i in 1..10) {
                Text("Sachin Saxena", color = Color.Red, fontSize = 13.sp)
            }


        }

    }
}


@Composable
fun list() {
    LazyColumn(modifier =Modifier.fillMaxSize())
    {

        items(25) { image ->
            Image(painter = painterResource(id = R.drawable.ic), contentDescription = "",
            modifier = Modifier.size(40.dp))

        }

    }

}

@Composable
fun listrow() {
    LazyRow(modifier =Modifier.fillMaxSize())
    {

        items(25) { image ->
            Image(painter = painterResource(id = R.drawable.ic), contentDescription = "",
                modifier = Modifier.size(40.dp))

        }

    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    NotesAppTheme {
        //  Greeting("Sachin Saxena ")
        // NewFun(name = "Saxena Sachin")

        list()
    }
}