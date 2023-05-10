package com.example.unitconvertor21

import kotlin.math.roundToInt

class ConversionScreenAttributes {

    companion object {
        var itemarr= arrayOf("null")
        var text_title= ""

        //Length Conversions
        fun kmtom(input: Double): Double {
            val out = (input * 1000)               //Kilometer to Meter
            return (out * 1000.0).roundToInt() / 1000.0
        }
        fun mtokm(input: Double): Double {
            val out = (input/1000)                //Meter to Kilometer
            return (out * 1000.0).roundToInt() / 1000.0
        }
        fun mtocm(input: Double): Double {
            val out =  input*100                   //Meter to Centimeter
            return (out * 1000.0).roundToInt() / 1000.0
        }
        fun cmtom(input: Double): Double {
            val out =  input/100                 //Centimeter to Meter
            return (out * 1000.0).roundToInt() / 1000.0
        }
        fun kmtocm(input: Double): Double {
            val out = (input *1000) * 100       //Kilometer to Centimeter
            return (out * 1000.0).roundToInt() / 1000.0
        }
        fun cmtokm(input: Double): Double {
            val out = (input/1000) /100       //Centimeter to Kilometer
            return (out * 1000.0).roundToInt() / 1000.0
        }

        //Weight Conversions
        fun kgtog(input: Double): Double {
            val out = (input * 1000)               //Kilogram to Gram
            return (out * 1000.0).roundToInt() / 1000.0
        }
        fun gtokg(input: Double): Double {
            val out = (input/1000)                //Gram to Kilogram
            return (out * 1000.0).roundToInt() / 1000.0
        }
        fun poundtog(input: Double): Double {
            val out =  input*453.6                   //Pound to Gram
            return (out * 1000.0).roundToInt() / 1000.0
        }
        fun gtopound(input: Double): Double {
            val out =  input/453.6                 //Gram to pound
            return (out * 1000.0).roundToInt() / 1000.0
        }
        fun kgtopound(input: Double): Double {
            val out = (input * 2.205)      //Kilogram to Pound
            return (out * 1000.0).roundToInt() / 1000.0
        }
        fun poundtokg(input: Double): Double {
            val out = (input/2.205)     //Pound to Kilogram
            return (out * 1000.0).roundToInt() / 1000.0
        }

        //Temperature Conversions
        fun ctof(input: Double): Double {
            val out = (input * 1.8) + 32                //Celsius to Fahrenheit
            return (out * 1000.0).roundToInt() / 1000.0
        }
        fun ftoc(input: Double): Double {
            val out = (input - 32) / 1.8                //Fahrenheit to Celsius
            return (out * 1000.0).roundToInt() / 1000.0
        }
        fun ctok(input: Double): Double {
            val out =  input + 273.15                   //Celsius to Kelvin
            return (out * 1000.0).roundToInt() / 1000.0
        }
        fun ktoc(input: Double): Double {
            val out =  input - 273.15                   //Kelvin to Celsius
            return (out * 1000.0).roundToInt() / 1000.0
        }
        fun ktof(input: Double): Double {
            val out = (input - 273.15) * 9/5 + 32       //Kelvin to Fahrenheit
            return (out * 1000.0).roundToInt() / 1000.0
        }
        fun ftok(input: Double): Double {
            val out = (input - 32) * 5/9 + 273.15       //Fahrenheit to Kelvin
            return (out * 1000.0).roundToInt() / 1000.0
        }


    }

}