package com.akb.a10119179latihan2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

//<!--Muhamad Bagus Prakoso-10119179-IF6-->

class VerifyAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_account)
        val veryacc = findViewById<Button>(R.id.veryacc)
        veryacc.setOnClickListener {
            val intent = Intent(this@VerifyAccountActivity, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}