package com.example.faith.brookside;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splashscren extends AppCompatActivity {
    private  static int SPLASH_SCREEN=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscren);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Splashscren.this,MainActivity.class);
                Splashscren.this.startActivity(intent);
                Splashscren.this.finish();
            }
        }, SPLASH_SCREEN);
    }
}
