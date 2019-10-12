package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewAct extends AppCompatActivity {
    private ListView lv;
    private ArrayList<String> names=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lv=findViewById(R.id.listview);

        names.add("John");
        names.add("Melvin");
        names.add("Nicholas");
        names.add("Chun Hean");

        ArrayAdapter<String> nameAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, names);

        lv.setAdapter(nameAdapter);
    }
}
