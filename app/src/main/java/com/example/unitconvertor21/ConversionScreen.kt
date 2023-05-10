package com.example.unitconvertor21

//noinspection SuspiciousImport
import android.R
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.unitconvertor21.R.id
import com.example.unitconvertor21.R.layout
import kotlin.math.roundToInt

class ConversionScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_conversion)

        val inputparameter: EditText= findViewById(id.inputparameter)
        val sourcespinner:Spinner=findViewById(id.sourcespinner)
        val destinationspinner:Spinner=findViewById(id.destinationspinner)
        val result:TextView=findViewById(id.result)
        val button: Button =findViewById(id.button)
        val conversion_title:TextView=findViewById(id.conversiontitle)
        conversion_title.setText(ConversionScreenAttributes.text_title)


        val items = ConversionScreenAttributes.itemarr

        val adapter = ArrayAdapter(this, R.layout.simple_spinner_item, items)
        adapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)
        sourcespinner.adapter = adapter

        val adapter2 = ArrayAdapter(this, R.layout.simple_spinner_item, items)
        adapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)
        destinationspinner.adapter = adapter2

        destinationspinner.setSelection(1)


        button.setOnClickListener {

            val inputnum:Double= inputparameter.text.toString().toDouble()

            //Length Conversions
            if (sourcespinner.selectedItem.toString() == "km" && destinationspinner.selectedItem.toString() == "m") {
                result.text = (""+ConversionScreenAttributes.kmtom(inputnum)) }
            else if (sourcespinner.selectedItem.toString() == "m" && destinationspinner.selectedItem.toString() == "km") {
                result.text = (""+ConversionScreenAttributes.mtokm(inputnum)) }

            else if (sourcespinner.selectedItem.toString() == "km" && destinationspinner.selectedItem.toString() == "cm") {
                result.text = (""+ConversionScreenAttributes.kmtocm(inputnum)) }
            else if (sourcespinner.selectedItem.toString() == "cm" && destinationspinner.selectedItem.toString() == "km") {
                result.text = (""+ConversionScreenAttributes.cmtokm(inputnum)) }

            else if (sourcespinner.selectedItem.toString() == "cm" && destinationspinner.selectedItem.toString() == "m") {
                result.text = (""+ConversionScreenAttributes.cmtom(inputnum)) }
            else if (sourcespinner.selectedItem.toString() == "m" && destinationspinner.selectedItem.toString() == "cm") {
                result.text = (""+ConversionScreenAttributes.mtocm(inputnum)) }

            //Weight Conversions
            if (sourcespinner.selectedItem.toString() == "kg" && destinationspinner.selectedItem.toString() == "g") {
                result.text = (""+ConversionScreenAttributes.kgtog(inputnum)) }
            else if (sourcespinner.selectedItem.toString() == "g" && destinationspinner.selectedItem.toString() == "kg") {
                result.text = (""+ConversionScreenAttributes.gtokg(inputnum)) }

            else if (sourcespinner.selectedItem.toString() == "g" && destinationspinner.selectedItem.toString() == "pound") {
                result.text = (""+ConversionScreenAttributes.gtopound(inputnum)) }
            else if (sourcespinner.selectedItem.toString() == "pound" && destinationspinner.selectedItem.toString() == "g") {
                result.text = (""+ConversionScreenAttributes.poundtog(inputnum)) }

            else if (sourcespinner.selectedItem.toString() == "kg" && destinationspinner.selectedItem.toString() == "pound") {
                result.text = (""+ConversionScreenAttributes.kgtopound(inputnum)) }
            else if (sourcespinner.selectedItem.toString() == "pound" && destinationspinner.selectedItem.toString() == "kg") {
                result.text = (""+ConversionScreenAttributes.poundtokg(inputnum)) }


            //Temperature Conversions
            if (sourcespinner.selectedItem.toString() == "Celsius" && destinationspinner.selectedItem.toString() == "Fahrenheit") {
                result.text = (""+ConversionScreenAttributes.ctof(inputnum)+"°F") }
            else if (sourcespinner.selectedItem.toString() == "Fahrenheit" && destinationspinner.selectedItem.toString() == "Celsius") {
                result.text = (""+ConversionScreenAttributes.ftoc(inputnum)+"°C") }

            else if (sourcespinner.selectedItem.toString() == "Celsius" && destinationspinner.selectedItem.toString() == "Kelvin") {
                result.text = (""+ConversionScreenAttributes.ctok(inputnum)+"K") }
            else if (sourcespinner.selectedItem.toString() == "Kelvin" && destinationspinner.selectedItem.toString() == "Celsius") {
                result.text = (""+ConversionScreenAttributes.ktoc(inputnum)+"°C") }

            else if (sourcespinner.selectedItem.toString() == "Kelvin" && destinationspinner.selectedItem.toString() == "Fahrenheit") {
                result.text = (""+ConversionScreenAttributes.ktof(inputnum)+"°F") }
            else if (sourcespinner.selectedItem.toString() == "Fahrenheit" && destinationspinner.selectedItem.toString() == "Kelvin") {
                result.text = (""+ConversionScreenAttributes.ftok(inputnum)+"K") }

        }




        }

    }
