package com.steve.navigationcompose.presentation.main_feed.bottom_screens

import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.steve.navigationcompose.presentation.main_feed.BottomScreen


@Composable
fun Profile(navController: NavController){

    Text(text = "Profiile", modifier = Modifier.clickable {
        navController.navigate(BottomScreen.Home.route)

    })

}
