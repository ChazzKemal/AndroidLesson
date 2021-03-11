package com.example.secondlesson

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
            else if(usernameInput.text.toString()=="yuabka" && passwordInput.text.toString()=="dragon" ){
                Toast.makeText(this, "Your login is done", Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show()
            }
                
            
        }
    }
}