package com.example.notesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.notesapp.ui.theme.NotesAppTheme


class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotesAppTheme {

                var input by remember {
                    mutableStateOf("")
                }

                var inputlist by remember {
                    mutableStateOf(listOf<String>())
                }
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.Transparent)
                        .padding(10.dp)
                ) {

                    Row(modifier = Modifier.fillMaxWidth()) {
                        //   Text(text = "Hello Sachin", color = Color.White)

                        OutlinedTextField(
                            value = input, singleLine = true,
                            onValueChange = { text -> input = text },
                            maxLines = 1,
                            modifier = Modifier.weight(1f)
                        )

                        Spacer(modifier = Modifier.width(10.dp))

                        Button(onClick = {
                            if (input.isNotEmpty()) {
                                inputlist = inputlist + input
                                input = ""
                            }

                        }) {
                            Text("Add")
                        }
                    }

                    LazyColumn(modifier = Modifier.padding(10.dp)) {
                        items(inputlist) { it ->
                            Text(
                                text = it,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(10.dp),
                                color = Color.Black,
                                fontSize = 20.sp
                            )
                            Divider()
                        }

                    }


                }


            }
        }
    }
}

@Composable
fun Greeting2(name: String) {
    //  Text(text = "Hello $name!")
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview2() {
    NotesAppTheme {
        //   Greeting2("Android")
    }
}