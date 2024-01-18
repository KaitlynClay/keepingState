package com.example.keepingstate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.textservice.TextInfo
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var button4: Button
    lateinit var textInfo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button)
        var button2 = findViewById<Button>(R.id.button2)
        var button3 = findViewById<Button>(R.id.button3)
        var button4 = findViewById<Button>(R.id.button4)
        var textInfo = findViewById<TextView>(R.id.txtBox)

        button.setOnClickListener {
            textInfo.setText("I have been clicked!")
        }
        button2.setOnClickListener {
            textInfo.setText("I am the second message!!")
        }
        button3.setOnClickListener {
            textInfo.setText("I am the third message!!!")
        }
        button4.setOnClickListener {
            textInfo.setText("I am the fourth and final message!!!!")
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("saved_text", textInfo.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        
        textInfo.setText(savedInstanceState.getString("savedText"))
    }

}