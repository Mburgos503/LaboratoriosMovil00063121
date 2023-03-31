package com.example.laboratorio03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgFiveCents = findViewById<ImageView>(R.id.ivFiveCents)
        val imgTenCents = findViewById<ImageView>(R.id.ivTen_cents)
        val imgQuarter = findViewById<ImageView>(R.id.ivQuarter)
        val imgOneDollar = findViewById<ImageView>(R.id.ivOne_dollar)
        val totalMoney = findViewById<TextView>(R.id.tvTotal_money)
        var money = 0.00

        imgFiveCents.setOnClickListener {
            money += 0.05
            totalMoney.text = String.format("%.2f", money)
        }

        imgTenCents.setOnClickListener {
            money += 0.10
            totalMoney.text = String.format("%.2f", money)
        }

        imgQuarter.setOnClickListener {
            money += 0.25
            totalMoney.text = String.format("%.2f", money)
        }

        imgOneDollar.setOnClickListener{
            money += 1.00
            totalMoney.text = money.toString()
        }


    }


}