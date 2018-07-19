package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<String> colors = new ArrayList<String>();

        colors.add("red");
        colors.add("green");
        colors.add("brown");
        colors.add("gray");
        colors.add("black");
        colors.add("white");
        colors.add("dusty yellow");
        colors.add("mustard yellow");

        ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, colors);

        ListView listView = (ListView) findViewById(R.id.color_list);
        listView.setAdapter(itemAdapter);

    }
}
