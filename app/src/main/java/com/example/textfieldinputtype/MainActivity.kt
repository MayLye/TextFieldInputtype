package com.example.textfieldinputtype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent()
        }
    }

    @Composable
    fun MainContent(){
        Column(
            Modifier
                .background(Color(0xFFEDEAE0))
                .fillMaxSize()
                .padding(32.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            var textState1 by remember { mutableStateOf(TextFieldValue()) }
            TextField(
                value = textState1,
                onValueChange = { textState1 = it },
                label = { Text(text = "Keyboard Type Text") },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text
                )
            )

            var textState2 by remember { mutableStateOf(TextFieldValue()) }
            TextField(
                value = textState2,
                onValueChange = { textState2 = it },
                label = { Text(text = "Keyboard Type Password") },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                ),
                visualTransformation = PasswordVisualTransformation()
            )

            var textState3 by remember { mutableStateOf(TextFieldValue()) }
            OutlinedTextField(
                value = textState3,
                onValueChange = { textState3 = it },
                label = { Text(text = "Keyboard Type Email") },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email
                )
            )

            var textState4 by remember { mutableStateOf(TextFieldValue()) }
            OutlinedTextField(
                value = textState4,
                onValueChange = { textState4 = it },
                label = { Text(text = "Keyboard Type Number") },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(
                    // more types are Ascii, NumberPassword, Phone, Uri
                    keyboardType = KeyboardType.Number
                )
            )
        }
    }

    @Preview
    @Composable
    fun ComposablePreview(){
        MainContent()
    }
}