package com.example.dictionary_page

import android.graphics.drawable.Icon
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Dictionary_UI(){
    Box(
        modifier = Modifier.fillMaxWidth().background(Color(0xFF2196F3))
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Icons.Default.Menu
        }
    }

    Spacer(modifier = Modifier.height(24.dp))

        Column (
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Row (
                 horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ){
                Card (
                    modifier = Modifier, colors = CardDefaults.cardColors(containerColor = Color(0xFF87CEEB),)
                ){
                    Icons.Default.Menu
                    Text("Dictionary")

                }
                Card {
                    Icons.Filled.Home
                    Text("Start Test")
                }
            }

            Spacer(modifier = Modifier.height(12.dp))
            Row (
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Card (
                    modifier = Modifier, colors = CardDefaults.cardColors(containerColor = Color(0xFF87CEEB),)
                ){
                    Icons.Default.AccountBox
                    Text("Games")

                }
                Card {
                    Icons.Default.Favorite
                    Text("Speaker")
                }
            }
        }
    }