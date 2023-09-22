package com.example.mydemogitapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.mydemogitapp.presentation.Dashboard
import com.example.mydemogitapp.ui.theme.DemoGitAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoGitAppTheme {
                Dashboard()
            }
        }
    }
}
