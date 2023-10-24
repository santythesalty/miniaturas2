package com.example.miniaturas2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        val thirdFragment = ThirdFragment()
        val boton1 = findViewById<ImageView>(R.id.imageView)
        val boton2 = findViewById<ImageView>(R.id.imageView2)
        val boton3 = findViewById<ImageView>(R.id.imageView3)


        boton1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment, firstFragment)
                commit()
            }
        }
        boton2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment, secondFragment)
                commit()
            }
        }

        boton3.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment, thirdFragment)
                commit()
            }
        }

    }
}