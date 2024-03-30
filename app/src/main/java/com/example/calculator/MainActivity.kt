package com.example.calculator

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculator.ui.theme.CalculatorTheme

class MainActivity : ComponentActivity() {

    lateinit var num1: EditText
    lateinit var num2: EditText
    lateinit var res: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num1 = findViewById<EditText>(R.id.editTextNumber)
        num2 = findViewById<EditText>(R.id.editTextNumber2)
        res = findViewById<EditText>(R.id.textView)

    }

    fun add(v: View) {
        val result = num1.text.toString().toInt() + num2.text.toString().toInt()
        res.text = result.toString()
    }

    fun subtract(v: View) {
        val result = num1.text.toString().toInt() - num2.text.toString().toInt()
        res.text = result.toString()
    }
}