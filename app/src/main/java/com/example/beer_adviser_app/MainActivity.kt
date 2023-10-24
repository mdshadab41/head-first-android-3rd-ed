package com.example.beer_adviser_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val findBeer = findViewById<Button>(R.id.find_beer)
        val beerColor = findViewById<Spinner>(R.id.beer_color)
        val brands = findViewById<TextView>(R.id.brands)

        findBeer.setOnClickListener {
            val color = beerColor.selectedItem
            val beerList = getBeers(color.toString())
            val beers = beerList.reduce{str, item -> str + '\n' + item}
           // brands.text = "Beer color is $color"
            brands.text = beers

        }

    }
    fun getBeers(color: String): List<String>{
        return when (color){
            "Light" -> listOf("Jale Paple Ale", "AAAAAAA")
            "Amber" -> listOf("BBBBBBBB", "CCCCCCCCC")
            "Brown" -> listOf("DDDDDDDDD", "EEEEEEEEE")
            else -> listOf("NOOOOOOOO", "NEWWWWWWWWW")
        }
    }
}