package com.example.intentpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Intent home=new Intent(SplashActivity.this,MainActivity.class);

        //Handler is a class that allows you to schedule and execute code (runnable tasks) on a specific thread
        // It is used when you need to update the UI or perform tasks at specific intervals or after a certain delay

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(home);
                finish(); //Pop the activity from the stack as we press back we are not directed to th splash screen
            }
        },4000); //4sec
    }
}