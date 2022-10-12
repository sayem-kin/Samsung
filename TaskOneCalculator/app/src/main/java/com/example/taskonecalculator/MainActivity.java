package com.example.taskonecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Addition(View v)
    {
        EditText editTextOne = (EditText)findViewById(R.id.editTextNumber1);
        EditText editTextTwo = (EditText)findViewById(R.id.editTextNumber2);
        EditText editTextThree = (EditText)findViewById(R.id.editTextNumber3);

        int numberOne = Integer.parseInt(editTextOne.getText().toString());
        int numberTwo = Integer.parseInt(editTextTwo.getText().toString()); // retrieving the value from EditText
        int result = numberOne+numberTwo; // addition

        editTextThree.setText("" + result);

    }

    public void Subtraction(View v)
    {
        EditText editTextOne = (EditText)findViewById(R.id.editTextNumber1);
        EditText editTextTwo = (EditText)findViewById(R.id.editTextNumber2);
        EditText editTextThree = (EditText)findViewById(R.id.editTextNumber3);

        int numberOne = Integer.parseInt(editTextOne.getText().toString());
        int numberTwo = Integer.parseInt(editTextTwo.getText().toString());
        int result = numberOne-numberTwo; // subtraction

        editTextThree.setText("" + result);

    }

    public void Multiplication(View v)
    {
        EditText editTextOne = (EditText)findViewById(R.id.editTextNumber1);
        EditText editTextTwo = (EditText)findViewById(R.id.editTextNumber2);
        EditText editTextThree = (EditText)findViewById(R.id.editTextNumber3);

        int numberOne = Integer.parseInt(editTextOne.getText().toString());
        int numberTwo = Integer.parseInt(editTextTwo.getText().toString());
        int result = numberOne*numberTwo; //multiplication

        editTextThree.setText("" + result);

    }

    public void Division(View v)
    {
        EditText editTextOne = (EditText)findViewById(R.id.editTextNumber1);
        EditText editTextTwo = (EditText)findViewById(R.id.editTextNumber2);
        EditText editTextThree = (EditText)findViewById(R.id.editTextNumber3);

        int numberOne = Integer.parseInt(editTextOne.getText().toString());
        int numberTwo = Integer.parseInt(editTextTwo.getText().toString());
        int result = numberOne/numberTwo; //division

        editTextThree.setText("" + result);

    }
}