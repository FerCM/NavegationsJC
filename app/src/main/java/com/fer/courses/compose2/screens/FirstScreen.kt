package com.fer.courses.compose2.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.fer.courses.compose2.Navegations.AppScreen


@Composable
fun  FirstScreen(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar() {
            Text(text = "FirstScreen")
        }
    }) { //Elemento grafico que ayuda para estructurar los elemententos tipicos de Material Design
        bodyContent(navController)
        
    }
}
@Composable
fun bodyContent(navController: NavController){
    Column( modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Primera pantalla")
        Button(onClick = { /*TODO*/
                navController.navigate(route = AppScreen.SecondScreen.route + "/Este es un parametro que envio")
            }) {
            Text(text = "Navega")
            
        }
        
    }
}
/*@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    FirstScreen()

}*/