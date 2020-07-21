package com.simpl3apz.simpleintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

// declare the variable for the views
lateinit var inputTxt : EditText
lateinit var inputBtn : Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // link variables to the view
        inputTxt = findViewById(R.id.inputText)
        inputBtn = findViewById(R.id.button)

        // set onClick action for button
        inputBtn.setOnClickListener {
            val myIntent = Intent(this,MainActivity2::class.java)
            val msgText = inputTxt.text.toString()
            myIntent.putExtra("Text",msgText)
            startActivity(myIntent)
        }

    }
}