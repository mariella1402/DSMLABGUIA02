package com.example.myapplication01_lab02

import android.os.Bundle
import android.support.annotation.IntegerRes
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView



lateinit var numb1 : EditText
lateinit var numb2 : EditText
lateinit var enviar: Button
lateinit var resultado: TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numb1 = findViewById(R.id.TxtNumb1)
        numb2 = findViewById(R.id.TxtNumb2)
        enviar = findViewById(R.id.BtnEnviar)
        resultado = findViewById(R.id.LIbResultado)

        enviar.setOnClickListener{
            val numer1string = numb1.getText().toString();
             val numer2string = numb2.getText().toString();
            val numr1= Integer.parseInt(numer1string);
            val numr2= Integer.parseInt(numer2string);
            var suma = numr1+numr2;
            resultado.text = "La suma es: " + suma.toString();
        }
    }
}