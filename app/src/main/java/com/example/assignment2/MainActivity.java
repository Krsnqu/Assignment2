package com.example.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int angka=0;
    TextView angkacount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angkacount=findViewById(R.id.score);
        Button tombolreset = findViewById(R.id.tombolreset);
    }

    public void countclick(View view) {
        angka = angka+1;
        angkacount.setText(Integer.toString(angka));
    }

    public void countclickreset(View view) {
        angka = 0;
        angkacount.setText(String.valueOf(angka));

    }
}