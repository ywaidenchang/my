package com.example.test_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textView);
    }

    int num = 0;
    TextView text;

    public void countButtonClicked(View v){
        num = num + 1;
        text.setText(String.valueOf(num));
    }

    public void minusButtonClicked(View v){
        if(num<=0){
            num = 0;
        }
        else{
            num = num - 1;
            text.setText(String.valueOf(num));
        }
    }

    public void resetButtonClicked(View v){
        num = 0;
        text.setText(String.valueOf(num));
    }

}