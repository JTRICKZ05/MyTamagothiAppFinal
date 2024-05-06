package com.jtrickz.mytamagotchiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.coroutines.delay

class MainActivity2 : AppCompatActivity() {

    //declare
    private lateinit var PetImageView: ImageView
    private lateinit var resultTextView1: TextView
    private lateinit var resultTextView2: TextView
    private lateinit var resultTextView3: TextView

    private var health = 100
    private var hunger = 50
    private var cleanliness= 50


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setupGameScreen()
    }

    //initialize
    resultTextView1 = findViewById(R.id.resultTextView1)
    resultTextView2 = findViewById(R.id.resultTextView2)
    resultTextView3 = findViewById(R.id.resultTextView3)

    private fun setupGameScreen() {
        PetImageView = findViewById(R.id.imageView)
        val FeedButton: Button = findViewById(R.id.FeedButton)
        val BathButton: Button = findViewById(R.id.BathButton)
        val PlayButton: Button = findViewById(R.id.PlayButton)

        FeedButton.setOnClickListener {
            PetImageView.setImageResource(R.drawable.eatingdog)
            updatePetStatus("feed")
        }

        BathButton.setOnClickListener {
            PetImageView.setImageResource(R.drawable.bathingdog)
            updatePetStatus("bath")
        }

        PlayButton.setOnClickListener {
            PetImageView.setImageResource(R.drawable.playdog)
            updatePetStatus("play")
        }
    }

    private fun updatePetStatus(action: String) {
        when (action) {
            "feed" -> {
                hunger += 0
                if (hunger > 100) hunger = 100
            }
            "bath" -> {
                cleanliness += 0
                if (cleanliness > 100) cleanliness = 100
            }
            "play" -> {
                health += 0
                if (health > 100) health = 100
            }
            }
            }
        }


