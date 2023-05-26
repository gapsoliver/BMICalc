package com.example.bmicalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var display_result:TextView
    lateinit var first_edit:EditText
    lateinit var second_edit:EditText
    lateinit var btn_calculate:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        first_edit = findViewById(R.id.weight)
        second_edit = findViewById(R.id.Height)
        btn_calculate = findViewById(R.id.Button)

        btn_calculate.setOnClickListener {
            var myweight: String = first_edit.text.toString().trim()
            var myheight: String = second_edit.text.toString().trim()

            if (myweight.isEmpty() && myheight.isEmpty())

                Toast.makeText(this, "Cannot Submit an empty Form", Toast.LENGTH_SHORT).show()

            var userweight : Double = myweight.toDouble()
            var useerheigt : Double = myheight.toDouble()

            var result : Double = userweight / (useerheigt * useerheigt)
            var finalresult : String = result.toString()

            display_result.setText(finalresult)
        }
    }
}







