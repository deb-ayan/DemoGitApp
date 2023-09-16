package com.example.demogitapp.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Dashboard() {
    Column {
        Text(text = "Dashboard Screen")
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Click Me")
        }
    }
}