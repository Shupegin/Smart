package sm.sm.smart.activityandbottombar

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import sm.sm.smart.screen.HomeScreen
import sm.sm.smart.screen.ProfileScreen
import sm.sm.smart.screen.SettingScreen

@Composable
fun BottomNavGraph(navController: NavHostController, context: Context){
    NavHost(navController = navController, startDestination = BottomBarScreen.Home.route){
        composable(route = BottomBarScreen.Home.route){
            HomeScreen(context = context)
        }
        composable(route = BottomBarScreen.Icon.route){
            ProfileScreen()
        }
        composable(route = BottomBarScreen.Setting.route){
            SettingScreen()
        }
    }
}