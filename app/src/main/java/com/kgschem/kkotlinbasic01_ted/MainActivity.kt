package com.kgschem.kkotlinbasic01_ted

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickBtn.setOnClickListener {

            // memo
            Ctrl + / : 커서가 어쩌구

            Log.d("main log", "click btn push")


        }

    }
}