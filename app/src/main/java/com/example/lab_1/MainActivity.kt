package com.example.lab_1

import android.content.Context
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    private var t_color: Int = 0
    private var b_color: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {

        val text = "Программа запущена"
        val toast = Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT)
        toast.show()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val context: Context = this.applicationContext
        t_color = ContextCompat.getColor(context, R.color.tw_text_color)
        b_color = ContextCompat.getColor(context, R.color.tw_back_color)
    }

    override fun onPause() {
        super.onPause()

        val text = "Программа свёрнута"
        val toast = Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun onResume() {
        super.onResume()

        val text = "Выполнение программы продолжено"
        val toast = Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun onDestroy() {
        super.onDestroy()

        val text = "Программа закрыта"
        val toast = Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT)
        toast.show()
    }

    fun changeColors(view: View){
        val textView: TextView = findViewById<TextView>(R.id.textView)

        t_color = t_color xor 0x00ffffff
        b_color = b_color xor 0x00ffffff
        textView.setTextColor(t_color);
        textView.setBackgroundColor((b_color))
    }
}