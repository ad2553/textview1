package com.example.textview1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView ace;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        ace = findViewById(R.id.textView);
    }

    public void dodge(View view) {
        ace.setTextColor(Color.RED);
        ace.setText("Oh, yea, I’ve been clicked!\n");
    }
}