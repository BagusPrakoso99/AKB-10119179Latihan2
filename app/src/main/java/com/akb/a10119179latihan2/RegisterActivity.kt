package com.akb.a10119179latihan2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

//<!--Muhamad Bagus Prakoso-10119179-IF6-->

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val register = findViewById<Button>(R.id.register)
        register.setOnClickListener {
            val intent = Intent(this@RegisterActivity, AlmostThereActivity::class.java)
            startActivity(intent)
        }
    }
}