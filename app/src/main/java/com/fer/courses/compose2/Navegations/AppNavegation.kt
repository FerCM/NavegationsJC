package com.fer.courses.compose2.Navegations

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.fer.courses.compose2.screens.FirstScreen
import com.fer.courses.compose2.screens.SecondScreen

/*
    Elemento que se va a encargar de orquestar la navegacion, va a conocer las pantallas y gestionar el paso entre ellas
*/
@Composable
fun AppNavegation() {
    var navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreen.FirstScreen.route){
        //Para enviar parametros se mandan tipo url
        composable(route = AppScreen.FirstScreen.route ){
            FirstScreen(navController)
        }
        composable(route = AppScreen.SecondScreen.route + "/{text}",
            arguments = listOf( navArgument(name = "text"){
                type = NavType.StringType
            })){
            SecondScreen(navController, it.arguments?.getString("text")) //Aqui esta la navegacion con data
        }
    }
}