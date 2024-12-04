package com.capstone.wattsup

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.capstone.wattsup.ui.MainFeatureActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the login button using findViewById
        val loginButton: Button = findViewById(R.id.loginButton)

        // Add click listener to the login button
        loginButton.setOnClickListener {
            val intent = Intent(this, MainFeatureActivity::class.java)
            startActivity(intent)
        }
    }
}
