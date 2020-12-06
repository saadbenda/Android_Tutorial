package com.example.firstapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView title = (TextView) findViewById(R.id.txt_title);
        if (getIntent().hasExtra("var1")){
            String txt = getIntent().getExtras().getString("var1");
            title.setText(txt);
        }
        Button browser = (Button) findViewById(R.id.btn_browser);
        browser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.fr"));
                if(intent.resolveActivity(getPackageManager()) != null){
                }
                startActivity(intent);
            }
        });


    }
}