package com.example.weatherapp

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.lifecycle.*
import com.example.designsystem.theme.*
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

/**
 * Created by Shaheer cs on 18/07/2024.
 */
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    val viewModel: MainActivityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                Text(
                    text = "Hello World",
                    style = LocalTypography.current.displayLarge,
                    color = LocalColorScheme.current.primary
                )
            }
        }
        lifecycleScope.launch {
            lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.closeFlow.collect {
                    println("check this")
                }
            }
        }
    }
}