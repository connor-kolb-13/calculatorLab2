package com.cs407.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void performCalcAdd(View view) {
        // Find the EditText fields for first and second numbers
        EditText firstNumberEditText = findViewById(R.id.firstNumber);
        EditText secondNumberEditText = findViewById(R.id.secondNumber);

        // Retrieve the numbers entered by the user
        String firstNumberStr = firstNumberEditText.getText().toString();
        String secondNumberStr = secondNumberEditText.getText().toString();

        // Check if both fields are not empty
        if (firstNumberStr.isEmpty() || secondNumberStr.isEmpty()) {
            // Show a toast message if one or both fields are empty
            Toast.makeText(this, "Please provide two numbers", Toast.LENGTH_SHORT).show();
        } else {
            // Parse the input as doubles
            double firstNumber = Double.parseDouble(firstNumberStr);
            double secondNumber = Double.parseDouble(secondNumberStr);

            // Perform the addition operation
            double result = firstNumber + secondNumber;

            // Create an Intent to switch to the ResultsActivity
            Intent intent = new Intent(this, ResultsActivity.class);

            // Pass the result to the ResultsActivity
            intent.putExtra("result", result);

            // Start the ResultsActivity
            startActivity(intent);
        }
    }

    public void performCalcSubtract(View view) {
        // Find the EditText fields for first and second numbers
        EditText firstNumberEditText = findViewById(R.id.firstNumber);
        EditText secondNumberEditText = findViewById(R.id.secondNumber);

        // Retrieve the numbers entered by the user
        String firstNumberStr = firstNumberEditText.getText().toString();
        String secondNumberStr = secondNumberEditText.getText().toString();

        // Check if both fields are not empty
        if (firstNumberStr.isEmpty() || secondNumberStr.isEmpty()) {
            // Show a toast message if one or both fields are empty
            Toast.makeText(this, "Please provide two numbers", Toast.LENGTH_SHORT).show();
        } else {
            // Parse the input as doubles
            double firstNumber = Double.parseDouble(firstNumberStr);
            double secondNumber = Double.parseDouble(secondNumberStr);

            // Perform the subtraction operation
            double result = firstNumber - secondNumber;

            // Create an Intent to switch to the ResultsActivity
            Intent intent = new Intent(this, ResultsActivity.class);

            // Pass the result to the ResultsActivity
            intent.putExtra("result", result);

            // Start the ResultsActivity
            startActivity(intent);
        }
    }

    public void performCalcMultiply(View view) {
        // Find the EditText fields for first and second numbers
        EditText firstNumberEditText = findViewById(R.id.firstNumber);
        EditText secondNumberEditText = findViewById(R.id.secondNumber);

        // Retrieve the numbers entered by the user
        String firstNumberStr = firstNumberEditText.getText().toString();
        String secondNumberStr = secondNumberEditText.getText().toString();

        // Check if both fields are not empty
        if (firstNumberStr.isEmpty() || secondNumberStr.isEmpty()) {
            // Show a toast message if one or both fields are empty
            Toast.makeText(this, "Please provide two numbers", Toast.LENGTH_SHORT).show();
        } else {
            // Parse the input as doubles
            double firstNumber = Double.parseDouble(firstNumberStr);
            double secondNumber = Double.parseDouble(secondNumberStr);

            // Perform the multiplication operation
            double result = firstNumber * secondNumber;

            // Create an Intent to switch to the ResultsActivity
            Intent intent = new Intent(this, ResultsActivity.class);

            // Pass the result to the ResultsActivity
            intent.putExtra("result", result);

            // Start the ResultsActivity
            startActivity(intent);
        }
    }

    public void performCalcDivide(View view) {
        // Find the EditText fields for first and second numbers
        EditText firstNumberEditText = findViewById(R.id.firstNumber);
        EditText secondNumberEditText = findViewById(R.id.secondNumber);

        // Retrieve the numbers entered by the user as strings
        String firstNumberStr = firstNumberEditText.getText().toString();
        String secondNumberStr = secondNumberEditText.getText().toString();

        // Check if both fields are not empty
        if (firstNumberStr.isEmpty() || secondNumberStr.isEmpty()) {
            // Show a toast message if one or both fields are empty
            Toast.makeText(this, "Please provide two numbers", Toast.LENGTH_SHORT).show();
        } else {
            // Parse the input as doubles
            double firstNumber = Double.parseDouble(firstNumberStr);
            double secondNumber = Double.parseDouble(secondNumberStr);

            // Check if the secondNumber is 0
            if (secondNumber == 0) {
                // Show an error toast message for division by zero
                Toast.makeText(this, "You cannot divide by 0", Toast.LENGTH_SHORT).show();
            } else {
                // Perform the division operation
                double result = firstNumber / secondNumber;

                // Create an Intent to switch to the ResultsActivity
                Intent intent = new Intent(this, ResultsActivity.class);

                // Pass the result to the ResultsActivity
                intent.putExtra("result", result);

                // Start the ResultsActivity
                startActivity(intent);
            }
        }
    }
}