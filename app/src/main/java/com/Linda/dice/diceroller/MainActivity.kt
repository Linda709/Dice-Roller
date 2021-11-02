package com.Linda.dice.diceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declare and initialize variables
        val buttonToast: Button =findViewById(R.id.button_toast)
        buttonToast.setOnClickListener{ showToast()}

        val buttonRoll: Button =findViewById(R.id.button_roll)
        buttonRoll.setOnClickListener{rollDice()}

        val buttonTwo : Button = findViewById(R.id.button_two)
        buttonTwo.setOnClickListener{launchSecondActivity()}

    }
    private fun showToast(){

        Toast.makeText(this,"Oh My!you have toasted me", Toast.LENGTH_SHORT).show()
    }
    private fun rollDice(){
        val generatedRandom = (1..6).random()

        val textViewResult: TextView =findViewById(R.id.text_result)
        textViewResult.text =generatedRandom.toString()

    }

    private fun launchSecondActivity(){
        Toast.makeText(this,"You have clicked button two", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}