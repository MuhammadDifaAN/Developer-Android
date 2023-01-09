package com.example.difa.latihan021_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Show_dongeng1(View view) {
    Intent intent1 = new Intent(this,DongengSangkuriang.class);
    startActivity(intent1);
    }

    public void Show_dongeng2(View view) {
        Intent intent2 = new Intent(this,DongengMalinKun.class);
        startActivity(intent2);
    }

    public void Show_dongeng3(View view) {
        Intent intent3 = new Intent(this,DongengDanauToba.class);
        startActivity(intent3);
    }
}