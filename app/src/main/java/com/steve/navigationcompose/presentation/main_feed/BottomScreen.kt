package com.steve.navigationcompose.presentation.main_feed

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.steve.navigationcompose.R

sealed class BottomScreen(var route: String, @StringRes val resourceId: Int, var icon: ImageVector
) {
    object Home : BottomScreen("home", R.string.home, Icons.Default.Home)
    object Search : BottomScreen("search",R.string.search, Icons.Default.Search )
    object Settings : BottomScreen("library", R.string.settings, Icons.Default.Settings)
    object Profile : BottomScreen("profile", R.string.profile, Icons.Default.Person)
}