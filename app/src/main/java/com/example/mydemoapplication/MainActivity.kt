package com.example.mydemoapplication

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mydemoapplication.ui.theme.MyDemoApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyDemoApplicationTheme {
                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
//                    Greeting("Android")
//                }
                Scaffold (
                    topBar = {
                        TopAppBar (
                            title = {
                                Text(text = "Demo Composible")
                            },
                            navigationIcon = {
                                IconButton(onClick = {  }) {
                                    Icon(Icons.Filled.Menu, contentDescription = "menu")
                                }
                            },
                            actions = {
                                IconButton(onClick = {  }) {
                                    Icon(Icons.Filled.Notifications, contentDescription = "notification")
                                }
                                IconButton(onClick = {  }) {
                                    Icon(Icons.Filled.Search, contentDescription = "search")
                                }
                            }

                        )
                    },
                    floatingActionButton = {
                        FloatingActionButton(onClick = { }) {
                            IconButton(onClick = { }) {
                               Icon(Icons.Filled.Add,contentDescription = "add")
                            }
                        }
                    }
                ){
                    Greeting(name = "Tikeswari!!")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "hey, $name",
    color=MaterialTheme.colors.secondary,
    modifier = Modifier.size(25.dp))
}

@Preview(showBackground = true, name = "light mode")
@Preview(showBackground = true,
    name = "dark mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun DefaultPreview() {
    MyDemoApplicationTheme {
        Greeting("Android")
    }
}