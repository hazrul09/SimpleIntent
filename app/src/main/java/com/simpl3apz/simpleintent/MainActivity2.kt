package com.simpl3apz.simpleintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

// declare the variable for the views
lateinit var msgView : TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // link variables to the view
        msgView = findViewById(R.id.textView)

        // get the intent value for the msg text
        val messageTxt = intent.getStringExtra("Text")

        // set the msg in the textview
        msgView.text = messageTxt
    }
}