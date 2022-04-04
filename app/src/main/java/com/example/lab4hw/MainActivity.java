package com.example.lab4hw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // declaring variable for the count
    private int count = 0;

    // declaring variable to store the count value
    private TextView Count_Text;

    // declaring string constant for the intent extras
    public static final String EXTRA_COUNT="com.example.android.twoactivities.extra.MESSAGE";

    // declaring unique key for fetching result using intent extra
    public static final int TEXT_REQUEST = 1;

    @Override
    // bundle to restore the activity to its initial state
    protected void onCreate(Bundle savedInstanceState) {
        // referring to the parent class
        super.onCreate(savedInstanceState);
        // setting the mentioned xml as the main layout
        setContentView(R.layout.activity_main);
        // assigning the view id with the variable
        Count_Text = (TextView) findViewById(R.id.count_value);
    }

    /**
     * function for displaying the second activity
     *
     *@param view The view that triggered this onClick handler.
     */
    public void launchSecondActivity(View view) {
        // instantiating a new intent for the second activity
        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
        // storing the text fo the textView into a variable
        String message = Count_Text.getText().toString();
        // defining an intent extra with the message as the value
        intent.putExtra(EXTRA_COUNT, message);
        // starting the activity for fetching result
        startActivityForResult(intent, TEXT_REQUEST);
    }

    /**
     * function to handle the increment in the counter value
     *
     *@param view The view that triggered this onClick handler.
     */
    public void IncreaseCount(View view) {
        // increment in the count value
        count++;
        // if the count value is not null
        if (Count_Text != null)
            // setting the count value to the variable
            Count_Text.setText(Integer.toString(count));
    }
}