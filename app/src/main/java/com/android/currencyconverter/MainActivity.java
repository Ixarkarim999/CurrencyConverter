package com.android.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {
    public void btnClick(View view){
    EditText dollarAmount=(EditText) findViewById(R.id.dollarAmount);
    String dollars = dollarAmount.getText().toString();
    Double doubleDollars=Double.parseDouble(dollars);
    Double doublePKR=154.15*doubleDollars;
    String toastText = "= " + doublePKR.toString() + " $";

    Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}