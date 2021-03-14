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
            else if(usernameInput.text.toString()=="yuabka" && passwordInput.text.toString()=="dragon" ){
                Toast.makeText(this, "You will see the location of the person i am in love with", Toast.LENGTH_LONG).show()
                intent= Intent(this,MapsActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show()
            }
                
            
        }
    }
}