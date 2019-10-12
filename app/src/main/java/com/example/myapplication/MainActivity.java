package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button btnSA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSA=findViewById(R.id.btnStartActivity);

    }

    public void startActivity2(View v){

        Intent i=new Intent(this,ListViewAct.class);
        startActivity(i);

    }
}
