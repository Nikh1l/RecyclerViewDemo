package com.example.shadow.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView programminglist = findViewById(R.id.programmingList);
        programminglist.setLayoutManager(new LinearLayoutManager(this));

        String[] languages = {"Java", "JavaScrip", "C", "C++","Java","JavaScrip", "C", "C++","Java","JavaScrip", "C", "C++"};
        programminglist.setAdapter(new ProgrammingAdapter(languages));
    }
}
