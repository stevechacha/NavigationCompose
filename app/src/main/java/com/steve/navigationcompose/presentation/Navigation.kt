package com.steve.navigationcompose.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.steve.navigationcompose.presentation.login.LoginScreen
import com.steve.navigationcompose.presentation.register.RegistrationScreen
import com.steve.navigationcompose.presentation.splash.SplashScreen


@ExperimentalMaterialApi
@Composable
fun Navigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.LoginScreen.route,
        modifier = Modifier.fillMaxSize()
    ) {
        composable(Screen.SplashScreen.route) {
            SplashScreen(navController = navController)
        }
        composable(Screen.LoginScreen.route) {
            LoginScreen(navController = navController)
        }
        composable(Screen.RegistrationScreen.route) {
            RegistrationScreen(navController= navController)
        }
        composable(Screen.MainFeedScreen.route) {
            MainFeedScreen(navController = navController)
        }
//        composable(Screen.ChatScreen.route) {
//            ChatScreen(navController = navController)
//        }
//        composable(Screen.ActivityScreen.route) {
//            ActivityScreen(navController = navController)
//        }
//        composable(Screen.ProfileScreen.route) {
//            ProfileScreen(navController = navController)
//        }
//        composable(Screen.EditProfileScreen.route) {
//            EditProfileScreen(navController = navController)
//        }
//        composable(Screen.CreatePostScreen.route) {
//            CreatePostScreen(navController = navController)
//        }
//        composable(Screen.SearchScreen.route) {
//            SearchScreen(navController = navController)
//        }
    }
}
