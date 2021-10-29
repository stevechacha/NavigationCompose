package com.steve.navigationcompose.presentation.main_feed.bottom_screens

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.steve.navigationcompose.presentation.main_feed.BottomScreen


@Composable
fun Home(navController: NavController){


    Button(onClick = {
        navController.navigate(BottomScreen.Search.route)
    }) {
        Text(text = "Home")
    }



}
