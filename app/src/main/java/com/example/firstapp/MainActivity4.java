package com.example.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent intent = getIntent();
        int index = 0;
        if(intent.hasExtra("index_image")) index = intent.getIntExtra("index_image", -1);
        if (index > -1){
            int pic;
            switch (index){
                case 2: pic = R.drawable.xbox;break;
                case 1: pic = R.drawable.playstation;break;
                case 0: pic = R.drawable.desktop;break;
                default: pic = -1;break;
            }
            ImageView img = (ImageView) findViewById(R.id.img0);
            img.setImageResource(pic);
        }

    }
}