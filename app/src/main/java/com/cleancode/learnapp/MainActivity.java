package com.cleancode.learnapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnBtnClick(View view)
    {
        TextView mainText=findViewById(R.id.txtView);
        if(mainText.getText().toString().equals("Hello World!"))
        {
            mainText.setText(R.string.bye_world);
        }
        else {
            mainText.setText(R.string.hello_world);
        }


    }
}