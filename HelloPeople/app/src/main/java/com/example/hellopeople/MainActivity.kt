package com.example.hellopeople

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

// this Kotlin File handles user interface; xml file defines how layout looks like
class MainActivity<background : View?> : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // tells program to show this layout file: activity_main
        setContentView(R.layout.activity_main)

        //display customized text task
        // in xml file changed line of Hello world to display Hello from [yourname]
        // under constraint layout added a line and added background to display the hex color

        // User can tap a button to change the text color of the label
        // 1. add button to layout
        // 2. setup logic to know when user has clicked a button
        // 2. change the color when user clicks on button (design view drag and drop button)

    // get a reference to button         .setOnClickListener handles button clicks and what to do
        findViewById<Button>(R.id.button).setOnClickListener {
            //handles button tap
            // 2. Change the color of text
            Log.i("Zack", "Tapped on button")
            // Get a reference to the text view
            // 2. set the color of the txt
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))

        }

    }

}



