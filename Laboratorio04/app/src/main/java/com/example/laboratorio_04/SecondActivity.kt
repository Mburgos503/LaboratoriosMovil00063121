package com.example.laboratorio_04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_second)

        val main_name_received = intent.getStringExtra("NOMBRE")
        val main_correo_received = intent.getStringExtra("CORREO")
        val main_numero_received = intent.getStringExtra("NUMERO")

        // nombre
        val textView = findViewById<TextView>(R.id.tv_name_holder)
        val name_text = main_name_received
        textView.text = name_text
        // correo
        val textViewCorreo = findViewById<TextView>(R.id.tv_correo_holder)
        val correoText = main_correo_received
        textViewCorreo.text = correoText
        // numero
        val textViewNumero = findViewById<TextView>(R.id.tv_numero_holder)
        val numeroText = main_correo_received
        textViewNumero.text = numeroText

        val shareBtn = findViewById<Button>(R.id.btn_share)

        shareBtn.setOnClickListener(){
            val shareInent = Intent(Intent.ACTION_SEND)

            shareInent.type = "text/plain"
            shareInent.putExtra(Intent.EXTRA_TEXT, "Nombre: $name_text\nEmail: $correoText\n, Numero: $numeroText")
            startActivity(Intent.createChooser(shareInent, "share to: "))
        }

    }

}