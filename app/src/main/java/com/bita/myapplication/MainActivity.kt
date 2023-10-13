package com.bita.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text

import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.bita.myapplication.ui.theme.MyApplicationTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secondpage) // Замените на имя вашего XML-макета

        // Дополнительный код для обработки регистрации и другой логики
    }
}

@Composable
fun Greeting(name: String, from: String,  modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,

    ) {


        Text(
            text = "Happy Birthday $name!",
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,
            fontSize = 100.sp

        )
        Text(

            text = "From $from!",
            lineHeight = 44.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End),
            fontSize = 25.sp

        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Sam","Emma")
    }
}