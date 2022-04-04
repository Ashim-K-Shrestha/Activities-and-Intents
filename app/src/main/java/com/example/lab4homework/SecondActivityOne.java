package com.example.lab4homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivityOne extends AppCompatActivity {

    // variable to hold the text header
    private TextView tHeadTextView;

    // variable to hold the text body
    private TextView tBodyTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_one);

        // id of the text header
        tHeadTextView = findViewById(R.id.text_one_header);

        // id of the text body
        tBodyTextView = findViewById(R.id.text_one_text);

        // defining a new intent for the second activity
        Intent intent = getIntent();

        // storing the extra into a string variable after being fetched
        String message = intent.getStringExtra(MainActivity.EXTRA_TEXT);

        // if message is equal to text_one
        if (message.equals("text_one")) {
            // setting text header
            tHeadTextView.setText(R.string.text_one_head);

            // setting text body
            tBodyTextView.setText(R.string.text_one_body);
        } else if (message.equals("text_two")) {
            // setting text header
            tHeadTextView.setText(R.string.text_two_header);

            tBodyTextView.setText(R.string.text_two_body);
        } else {
            // setting text header
            tHeadTextView.setText(R.string.text_three_header);

            tBodyTextView.setText(R.string.text_three_body);
        }
    }
}