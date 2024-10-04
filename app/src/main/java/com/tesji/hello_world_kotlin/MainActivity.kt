package com.tesji.hello_world_kotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        println("Hola mundo desde Kotlin")
        //Declaracion con val
        val PI:Double= 3.1416
        println("Valor de PI=" + PI)
        //var
        var edad: Int = 20
        //var edad = 15
        //ambito y su alance donde va vivir
         if (true){
            var edad=17
            println("Edad=" + edad)
        }
        //operaciones logicos
        if (edad >=18){
            println("Eres menor de edad")
        }else if(edad >18 && edad<=40){
            println("Eres joven")
        }else if(edad > 40 && edad <=60){
            println("Ya eres adulto")
        }else{
            println("Eres adulto mayor")
        }
        var numMes:Int = 6

        var result = when(numMes){
            1->"Enero"
            2->"Febrero"
            3->"Marzo"
            4->"Abril"
            5->"Mayo"
            6->"Junio"
            7->"Julio"
            8->"Agosto"
            9->"Septiembre"
            10->"Octubre"
            11->"Noviembre"
            12->"Diciembre"
            else -> "NO COINCIDE EL MES CON NUMERO"
        }
        println("Mes de: " + result)



    }
}