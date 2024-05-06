package com.jtrickz.mytamagotchiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    //declare variables
    //the keyword lateinit allows us to initialize a variable at a later stage
    private lateinit var openButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //making use of the find view by ID method
        //initializing the variable by getting reference to the button
        //get reference by using the ID name


        openButton = findViewById(R.id.button)
        openButton.setOnClickListener{

            //create variable
            var Intent= Intent(this,MainActivity2::class.java)
            startActivity(Intent)
        }
    }
}

