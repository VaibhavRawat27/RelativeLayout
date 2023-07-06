package com.vaibhavrawat.relativelayout

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //declaration
    var tvNumber: TextView? = null
    var btnPlus: Button? = null
    var btnMinus: Button? = null
    var btnMul: Button? = null
    var btnDiv: Button? = null
    //val etInputNum : EditText? = null
    var btnClear : Button?= null
    var btnSubmit : Button?= null
    var number = 0
    var inputNumber = 0
    var intValue = 0
    //var userNumber = ""
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvNumber = findViewById(R.id.tvNumber)
        btnPlus = findViewById(R.id.btnPlus)
        btnDiv = findViewById(R.id.btnDiv)
        btnMinus = findViewById(R.id.btnMinus)
        btnMul = findViewById(R.id.btnMul)
        val etInputNum = findViewById<EditText>(R.id.etInputNum)
        btnClear = findViewById(R.id.btnClear)
        btnSubmit = findViewById(R.id.btnSubmit)

        btnSubmit?.setOnClickListener {
            val text = etInputNum.text.toString()
            val intValue = text.toInt()
            //println(intValue)
            tvNumber?.text = intValue.toString()
            // inputNumber = etInputNum.toString().toInt()
            // var intent = Intent(this, MainActivity::class.java)
            //intent.putExtra("userNumber", etInputNum?.text.toString())
            //startActivity(intent)
            //finish()

            //intent?.let {
            //  userNumber = it.getStringExtra("userNumber") ?: ""
            //inputNumber = userNumber.toInt()

            btnPlus?.setOnClickListener {
                number += intValue
                tvNumber?.text = number.toString()

            }

            btnMinus?.setOnClickListener {
                number -= intValue
                tvNumber?.text = number.toString()
            }

            btnMul?.setOnClickListener {
                number *= intValue
                tvNumber?.text = number.toString()
                println(number)
            }

            btnDiv?.setOnClickListener {
                number /= intValue
                tvNumber?.text = number.toString()
            }
        }
    //    }

        btnClear?.setOnClickListener {
            tvNumber?.text = "0"
            etInputNum?.text = Editable.Factory.getInstance().newEditable("")
            //var intent = Intent(this, MainActivity::class.java)
            //startActivity(intent)
            //finish()
        }
    }
}

