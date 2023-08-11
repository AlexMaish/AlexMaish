package com.Calurator.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.Calurator.calc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPlus.setOnClickListener {
            calculate("+")
        }

        binding.btnMinus.setOnClickListener {
            calculate("-")
        }

        binding.btnMult.setOnClickListener {
            calculate("*")
        }

        binding.btnDiv.setOnClickListener {
            calculate("/")
        }
    }

    private fun calculate(operator: String) {
        val num1 = binding.edNum1.text.toString().toInt()
        val num2 = binding.edNum2.text.toString().toInt()

        val summary = when (operator) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> num1 / num2
            else -> "Unknown operator"
        }
        binding.txt1.text = summary.toString()
    }
}

