package com.example.exer4textview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tV;
    int x;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        tV = findViewById(R.id.tV);
        x = 0;

    }

    public void click(View view) {
        tV.setTextSize(25);
        tV.setTextColor(Color.YELLOW);
        x++;
        tV.setText("This is a click number:" + x);
        if (x == 7) {
            tV.setText("BOOM!");
            x = 0;


        }
    }
}