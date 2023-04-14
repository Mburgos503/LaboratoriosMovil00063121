package com.example.laboratorio_04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name_textfield = findViewById<TextInputEditText>(R.id.name)
        val correo_textfield = findViewById<TextInputEditText>(R.id.correo)
        val numero_textfield = findViewById<TextInputEditText>(R.id.numero)
        val sendButton = findViewById<Button>(R.id.btn_send)
        var name = ""
        var correo = ""
        var numero = ""

        sendButton.setOnClickListener(){
            name = name_textfield.text.toString()
            correo = correo_textfield.text.toString()
            numero = numero_textfield.text.toString()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("NOMBRE", name)
            intent.putExtra("CORREO", correo)
            intent.putExtra("NUMERO", numero)

            startActivity(intent)

        }
    }
}
