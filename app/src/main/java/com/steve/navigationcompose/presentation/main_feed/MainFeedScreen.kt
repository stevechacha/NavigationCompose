package com.steve.navigationcompose.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.steve.navigationcompose.presentation.main_feed.BottomScreen
import com.steve.navigationcompose.presentation.main_feed.bottom_screens.Home
import com.steve.navigationcompose.presentation.main_feed.bottom_screens.Profile
import com.steve.navigationcompose.presentation.main_feed.bottom_screens.Search
import com.steve.navigationcompose.presentation.main_feed.bottom_screens.Settings

@Composable

fun MainFeedScreen(navController: NavController) {

    val items = listOf(
        BottomScreen.Home,
        BottomScreen.Search,
        BottomScreen.Settings,
        BottomScreen.Profile)

    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomNavigation {

                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination
                items.forEach { screen ->
                    BottomNavigationItem(
                        icon = { Icon(screen.icon, contentDescription = null) },
                        label = { Text(stringResource(screen.resourceId)) },
                        selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                        onClick = {
                            navController.navigate(screen.route) {
                                // Pop up to the start destination of the graph to
                                // avoid building up a large stack of destinations
                                // on the back stack as users select items
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                // Avoid multiple copies of the same destination when
                                // reselecting the same item
                                launchSingleTop = true
                                // Restore state when reselecting a previously selected item
                                restoreState = true
                            }
                        }
                    )
                }

            }

        }
    ) { innerPadding ->
        NavHost(navController, startDestination = BottomScreen.Home.route, Modifier.padding(innerPadding)) {
            composable(BottomScreen.Home.route) { Home(navController) }
            composable(BottomScreen.Search.route) { Search(navController) }
            composable(BottomScreen.Settings.route) {Settings(navController) }
            composable(BottomScreen.Profile.route) { Profile(navController) }
        }
    }
}
