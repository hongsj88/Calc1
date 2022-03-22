package com.example.calc1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var name = input1.text.toString()

            var calc1 = Calc1()
            calc1.name = name

            show("계산기객체만들어짐: ${calc1.name}")
        }

    }
    fun show(message:String){
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }
}