package com.example.dictionary_page
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Dictionary_UI() {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp).background(Color.LightGray)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().background(Color(0xFF2196F3)).height(24.dp)
        ) {

        }

        Spacer(modifier = Modifier.height(16.dp))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(12.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Card(
                    modifier = Modifier.weight(8f),
                    elevation = CardDefaults.cardElevation(4.dp),
                    colors = CardColors(
                        containerColor = Color(0xFF2196F3), contentColor = Color.White,
                        disabledContentColor = Color.Blue, disabledContainerColor = Color.Blue
                    )
                ) {
                    Image(
                        modifier = Modifier
                            .height(48.dp)
                            .width(48.dp)
                            .align(Alignment.CenterHorizontally
                            ),
                        imageVector = Icons.Filled.AccountCircle,
                        contentDescription = ""
                    )
                    Text(text = "Dictionary",
                    modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold)
                }
                Spacer(modifier = Modifier.weight(0.5f))
                Card(
                    modifier = Modifier.weight(8f),
                    elevation = CardDefaults.cardElevation(8.dp),
                    colors = CardColors(
                        containerColor = Color.White, contentColor = Color.Black,
                        disabledContentColor = Color.Blue, disabledContainerColor = Color.Blue
                    )
                ) {
                    Image(
                        modifier = Modifier
                            .height(48.dp)
                            .width(48.dp)
                            .align(Alignment.CenterHorizontally),
                        imageVector = Icons.Filled.AccountCircle,
                        contentDescription = ""
                    )
                    Text(text = "Start Test",
                        modifier = Modifier,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center)
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Row(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Card(
                    modifier = Modifier.weight(8f),
                    elevation = CardDefaults.cardElevation(8.dp),
                    colors = CardColors(
                        containerColor = Color.White, contentColor = Color.Black,
                        disabledContentColor = Color.Blue, disabledContainerColor = Color.Blue
                    )
                ) {
                    Image(
                        modifier = Modifier
                            .height(48.dp)
                            .width(48.dp)
                            .align(Alignment.CenterHorizontally),
                        imageVector = Icons.Filled.AccountCircle,
                        contentDescription = ""
                    )
                    Text("Games",
                        modifier = Modifier,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center)

                }
                Spacer(modifier = Modifier.weight(0.5f))
                Card(
                    modifier = Modifier.weight(8f),
                    elevation = CardDefaults.cardElevation(8.dp),
                    colors = CardColors(
                        containerColor = Color.White, contentColor = Color.Black,
                        disabledContentColor = Color.Blue, disabledContainerColor = Color.Blue
                    )
                ) {
                    Image(
                        modifier = Modifier
                            .height(48.dp)
                            .width(48.dp)
                            .align(Alignment.CenterHorizontally),
                        imageVector = Icons.Filled.AccountCircle,
                        contentDescription = ""
                    )
                    Text(text = "Speaker",
                        modifier = Modifier,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center)
                }
            }
        }
    }

    Spacer(modifier = Modifier.height(16.dp))

    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp)
            .background(Color(0xFF2196F3),
                )
    ){
        Text(text = "Word of the Day")
        Text(text = "March 11, 2024")
    }
}