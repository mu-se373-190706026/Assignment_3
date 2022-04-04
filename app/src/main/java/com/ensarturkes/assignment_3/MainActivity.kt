package com.ensarturkes.assignment_3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var countClick = 0
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkToInitilize()


    }
    fun checkToInitilize(){
        var checkBox = findViewById<CheckBox>(R.id.checkBox)
        checkBox.setOnClickListener() {
            if (checkBox.isChecked) {
                buttonCounterFunction()
                checkBox.text = "The button is opened."
            } else {
                checkBox.text = "Click here to open the button."
                countClick = 0
                countClickToText()
            }
        }
    }

    fun buttonCounterFunction(){
        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            countClick ++
            countClickToText()
        }
    }

    fun countClickToText(){
        var counter = findViewById<TextView>(R.id.Counter)
        var counterText = findViewById<TextView>(R.id.counterText)
        counter.text = "${countClick}"
        if(countClick != 0)     counterText.text = "Button ${countClick} times clicked."
        if(countClick == 0)     counterText.text = "Button is not clicked yet."
    }

}