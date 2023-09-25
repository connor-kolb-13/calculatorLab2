package com.cs407.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        // Find the TextView for displaying the result
        textView = findViewById(R.id.calcResult);

        // Retrieve the result from the Intent as a double
        Intent intent = getIntent();
        double result = intent.getDoubleExtra("result", 0.0);

        // Display the result in the TextView
        textView.setText(String.valueOf(result));
    }

    public void backToCalc(View view) {
        // Create an Intent to switch back to the MainActivity
        Intent intent = new Intent(this, MainActivity.class);

        // Start the MainActivity
        startActivity(intent);
        finish();
    }
}
