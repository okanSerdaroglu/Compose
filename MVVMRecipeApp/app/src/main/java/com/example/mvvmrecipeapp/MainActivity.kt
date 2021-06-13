package com.example.mvvmrecipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            showButton()
        }
    }

    @Preview("initialComposable")
    @Composable
    fun showButton() {
        LazyColumn(
            modifier = Modifier
                .background(
                    Color.White
                )
                .fillMaxSize()
        ) {
            item {
                Image(
                    painter = painterResource(id = R.drawable.happy_meal_small),
                    contentDescription = "",
                    modifier = Modifier
                        .height(300.dp)
                        .clip(shape = RoundedCornerShape(4.dp)),
                    contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .background(Color.White)
                        .fillMaxWidth(),
                ) {
                    Text(
                        text = "Happy Meal",
                        color = Color.Red,
                        style = TextStyle(
                            fontSize = 26.sp
                        )
                    )
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(text = "800 calories")
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(text = "$5.99")
                }
            }
        }
    }

    @Preview
    @Composable
    fun SetRow() {
        Column {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .border(border = BorderStroke(width = 1.dp, color = Color.Black)),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "ITEM1",
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Text(
                    text = "ITEM2",
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }
            Spacer(modifier = Modifier.padding(20.dp))
            Row(
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
                    .border(border = BorderStroke(width = 1.dp, color = Color.Black)),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "ITEM3",
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
                Text(
                    text = "ITEM4",
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }
        }
    }
}