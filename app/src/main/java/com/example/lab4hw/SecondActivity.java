package com.example.lab4hw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    // declaring variable for the upper text
    private TextView tUpper;

    // declaring variable for the counter value
    private TextView tCountValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // assigning the id of the upper text textView
        tUpper = findViewById(R.id.text_upper);

        // assigning the id of the lower text textView
        tCountValue = findViewById(R.id.text_lower);

        // defining a new intent for the second activity
        Intent intent = getIntent();

        // storing the extra into a string variable after being fetched
        String message = intent.getStringExtra(MainActivity.EXTRA_COUNT);

        // setting the string to the upper text
        tUpper.setText("Hello!");

        // setting the count value sent through the extra into the lower text
        tCountValue.setText(message);
    }
}