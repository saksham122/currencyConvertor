package com.example.sakshamscurrconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void btnClick(View view){

        EditText dollarid = findViewById(R.id.dollarid);
        String Dollar = dollarid.getText().toString();
        Double DubleDollar = Double.parseDouble(Dollar);
        Double doubleINR = 74.85 * DubleDollar;
        String toasttext = " =" + doubleINR.toString() + " $";

        Toast.makeText(this, toasttext , Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
