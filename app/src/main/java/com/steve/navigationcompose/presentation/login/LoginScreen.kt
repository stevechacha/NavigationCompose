package com.steve.navigationcompose.presentation.login

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.steve.navigationcompose.presentation.Screen


@Composable
fun LoginScreen(navController: NavController) {
    
    Column {

        Button(onClick = {
            navController.navigate(Screen.MainFeedScreen.route)
        }) {
            Text(text = "MainScreen")

        }



        Button(onClick = {
            navController.navigate(Screen.RegistrationScreen.route)
        }) {
            Text(text = "Register")

        }

    }
    



}