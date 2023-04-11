package com.fer.courses.compose2.Navegations
/*  Esto es una clase sellada
    * Para navegar entre pantallas en Jetpack necesitamos algo llamado "ruta"
    * Conocer que pantallas conforman nuesta app
    * Se necesita la Ruta, un identificador para saber a que pantalla vamos a ir
* */
sealed class AppScreen( val route: String){
    object FirstScreen: AppScreen("first_screen")
    object SecondScreen: AppScreen("second_screen")
}
/* Esto indica que solo podemos navegar entre las pantallas definidas en la clase
* */
