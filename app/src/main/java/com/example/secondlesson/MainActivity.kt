    package com.example.secondlesson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            if (usernameInput.text.isNullOrEmpty() || passwordInput.text.isNullOrEmpty() ){
                Toast.makeText(this, "Please enter both fields", Toast.LENGTH_SHORT).show()
            }
            else{
                val intent=Intent(this,MapsActivity::class.java)
                intent.putExtra("latitude",usernameInput.text.toString())
                intent.putExtra("longitude",passwordInput.text.toString())
                startActivity(intent)
            }
                
            
        }
    }
}