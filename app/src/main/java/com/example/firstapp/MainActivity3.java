package com.example.firstapp;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        // method 1
        /* Resources res = getResources();
        ListView lv = findViewById(R.id.listview_articles);
        List<String> items = Arrays.asList(res.getStringArray(R.array.items));
        lv.setAdapter(new ArrayAdapter<String>(this, R.layout.layout_articles_detail, items)); */

        //method 2
        Resources res = getResources();
        ListView lv = findViewById(R.id.listview_articles);
        List<String> items = Arrays.asList(res.getStringArray(R.array.items));
        // lv.setAdapter(new ArrayAdapter<String>(this, R.layout.layout_articles_detail, items));
        lv.setAdapter(new ItemAdapter(this, items));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), MainActivity4.class).putExtra("index_image", position);
                startActivity(intent);
            }
        });


    }
}