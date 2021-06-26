package com.example.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        val btn_click_me = findViewById(R.id.button) as Button
//        val myTextView =findViewById(R.id.textView) as TextView
        var numClicked=0

        button.setOnClickListener {
            numClicked++
            textView.text=numClicked.toString()
            Toast.makeText(this@MainActivity, "doge to the moon", Toast.LENGTH_SHORT).show()
        }
    }
}

