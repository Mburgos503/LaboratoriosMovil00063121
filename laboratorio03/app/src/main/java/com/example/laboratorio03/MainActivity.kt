package com.example.laboratorio03

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView


private lateinit var fives_cents: ImageView
private lateinit var tens_cents: ImageView
private lateinit var quarters: ImageView
private lateinit var one_dollars: ImageView
private lateinit var contaofnumbers: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnClickListener()
        bind()

    }
    private fun bind (){
        fives_cents = findViewById(R.id.five_cents)
        tens_cents = findViewById(R.id.ten_cents)
        quarters = findViewById(R.id.quarter)
        one_dollars = findViewById(R.id.one_dollar)
        contaofnumbers = findViewById(R.id.amount_text)
    }
    private fun setOnClickListener() {
        var totalmoney = 0.0

        fives_cents.setOnClickListener {
            totalmoney += 0.05
            contaofnumbers.text = String.format("$%.2f", totalmoney)
        }

        tens_cents.setOnClickListener {
            totalmoney += 0.10
            contaofnumbers.text = String.format("$%.2f", totalmoney)
        }

        quarters.setOnClickListener {
            totalmoney += 0.25
            contaofnumbers.text = String.format("$%.2f", totalmoney)
        }

        one_dollars.setOnClickListener {
            totalmoney += 1.0
            contaofnumbers.text = String.format("$%.2f", totalmoney)
        }
    }
}