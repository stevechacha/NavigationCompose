package com.steve.navigationcompose.presentation.register

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.steve.navigationcompose.presentation.Screen


@Composable
fun  RegistrationScreen(navController: NavController) {
    Button(onClick = {
        navController.navigate(Screen.MainFeedScreen.route)
    }) {
        Text(text = "Mainscreen")

    }

    Button(onClick = {
        navController.navigate(Screen.LoginScreen.route)
    }) {
        Text(text = "Login")

    }
    
}