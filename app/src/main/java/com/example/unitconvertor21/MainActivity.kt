package com.example.unitconvertor21

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val lengthbtn:ImageButton= findViewById(R.id.lengthconversion)
        val weightbtn:ImageButton=findViewById(R.id.weightconversion)
        val tempbtn:ImageButton=findViewById(R.id.tempconversion)

        lengthbtn.setOnClickListener{
            val intent = Intent(this, ConversionScreen::class.java)
            ConversionScreenAttributes.itemarr=arrayOf("km", "m", "cm")
            ConversionScreenAttributes.text_title="Length"
            startActivity(intent)
        }
        weightbtn.setOnClickListener{
            val intent = Intent(this, ConversionScreen::class.java)
            ConversionScreenAttributes.itemarr=arrayOf("kg", "g", "pound")
            ConversionScreenAttributes.text_title="Weight"
            startActivity(intent)
        }
        tempbtn.setOnClickListener{
            val intent = Intent(this, ConversionScreen::class.java)
            ConversionScreenAttributes.itemarr=arrayOf("Celsius", "Fahrenheit", "Kelvin")
            ConversionScreenAttributes.text_title="Temperature"
            startActivity(intent)
        }


    }
}