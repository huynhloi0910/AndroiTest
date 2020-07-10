package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_demo.*

class demo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)

    button.setOnClickListener {
        val intent = Intent (this, learnVocab::class.java)
        startActivity(intent)
    }

    button3.setOnClickListener {
        val intent1 = Intent (this, paraticeE::class.java)
        startActivity(intent1)
    }

    button4.setOnClickListener {
        val intent2 = Intent (this, testE::class.java)
        startActivity(intent2)
    }

    }
}
