package com.example.demogitapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.demogitapp.presentation.Dashboard
import com.example.demogitapp.ui.theme.DemoGitAppTheme

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
