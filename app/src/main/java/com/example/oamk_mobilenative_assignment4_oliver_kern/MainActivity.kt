package com.example.oamk_mobilenative_assignment4_oliver_kern

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.oamk_mobilenative_assignment4_oliver_kern.ui.theme.Oamk_mobileNative_assignment4_oliver_kernTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Oamk_mobileNative_assignment4_oliver_kernTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyApp()
                }
            }
        }
    }
}

@Composable
fun MyApp() {
    val appModifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)

    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "My title",
            // NOTE: h5 seems to be deprecated, used instead titleMedium
            style = MaterialTheme.typography.titleMedium,
            modifier = appModifier,
        )
        OutlinedTextField(
            value = "",
            onValueChange = { /*TODO*/ },
            modifier = appModifier,
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = appModifier,
            // NOTE: With the new API the default shape from the Theme is not applied to buttons anymore.
            // It therefore needs to be applied manually.
            shape = MaterialTheme.shapes.small,
        ) {
            Text(text = "Submit")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Oamk_mobileNative_assignment4_oliver_kernTheme {
        MyApp()
    }
}