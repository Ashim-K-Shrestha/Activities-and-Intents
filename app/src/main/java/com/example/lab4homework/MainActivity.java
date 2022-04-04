package com.example.lab4homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // constant for the LOG_TAG variable
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    // defining a constant for intent extra
    public static final String EXTRA_TEXT = "com.example.android.twoactivities.extra.TEXT";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivityOne(View view) {
        // displaying the message in the logcat pane
        Log.d(LOG_TAG, "Button clicked!");

        // creating a new intent to activate the second activity
        Intent intent = new Intent(this, SecondActivityOne.class);

        // sending the message
        intent.putExtra(EXTRA_TEXT, "text_one");

        // starting the activity with the intent as the argument
        startActivity(intent);
    }

    public void launchSecondActivityTwo(View view) {
        // creating a new intent to activate the second activity
        Intent intent = new Intent(this, SecondActivityOne.class);

        // sending the message
        intent.putExtra(EXTRA_TEXT, "text_two");

        // starting the activity with the intent as the argument
        startActivity(intent);
    }

    public void launchSecondActivityThree(View view) {
        // creating a new intent to activate the second activity
        Intent intent = new Intent(this, SecondActivityOne.class);

        // sending the message
        intent.putExtra(EXTRA_TEXT, "text_three");

        // starting the activity with the intent as the argument
        startActivity(intent);
    }
}