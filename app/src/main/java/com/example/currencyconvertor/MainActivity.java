package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {
        Log.i(
                "Info", "Button Pressed");

        EditText editText = (EditText) findViewById(R.id.editText);
        String amountInRupees = editText.getText().toString();
        double amountInRupeesDouble = Double.parseDouble(amountInRupees);
        double amountInDollars = amountInRupeesDouble*0.014;
        String amountInDolLarsString= String.format("%.2f",amountInDollars );
        Toast.makeText(this, "Rs " + amountInRupees + " is $ " +amountInDolLarsString, Toast.LENGTH_LONG).show();

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}