package com.jamiahus.jaycalc;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    private Button myButton_0;
    private Button myButton_1;
    private Button myButton_2;
    private Button myButton_3;
    private Button myButton_4;
    private Button myButton_5;
    private Button myButton_6;
    private Button myButton_7;
    private Button myButton_8;
    private Button myButton_9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton_0 = findViewById(R.id.button_0);
        myButton_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Button number:","0");
            }
        });

        myButton_1 = findViewById(R.id.button_1);
        myButton_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Button number:","1");
            }
        });

        myButton_2 = findViewById(R.id.button_2);
        myButton_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Button number:","2");
            }
        });

        myButton_3 = findViewById(R.id.button_3);
        myButton_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Button number:","3");
            }
        });

        myButton_4 = findViewById(R.id.button_4);
        myButton_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Button number:","4");
            }
        });

        myButton_5 = findViewById(R.id.button_5);
        myButton_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Button number:","5");
            }
        });

        myButton_6 = findViewById(R.id.button_6);
        myButton_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Button number:","6");
            }
        });

        myButton_7 = findViewById(R.id.button_7);
        myButton_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Button number:","7");
            }
        });

        myButton_8 = findViewById(R.id.button_8);
        myButton_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Button number:","8");
            }
        });

        myButton_9 = findViewById(R.id.button_9);
        myButton_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Button number:","9");
            }
        });
    }
}
