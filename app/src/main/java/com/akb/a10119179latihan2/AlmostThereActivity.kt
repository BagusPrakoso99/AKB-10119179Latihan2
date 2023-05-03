package com.akb.a10119179latihan2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

//<!--Muhamad Bagus Prakoso-10119179-IF6-->

class AlmostThereActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost_there)
        val veri = findViewById<Button>(R.id.veri)
        veri.setOnClickListener {
            val intent = Intent(this@AlmostThereActivity, VerifyAccountActivity::class.java)
            startActivity(intent)
        }
    }
}