package com.rager.dapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button redButton,greenButton;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        redButton = findViewById(R.id.redbutton);
        greenButton = findViewById(R.id.greenbutton);
        layout= findViewById(R.id.linearlayout);

        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             layout.setBackgroundColor(Color.RED);
            }
        });
        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(Color.GREEN);
            }
        });
    }
}
