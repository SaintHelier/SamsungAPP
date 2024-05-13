 package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashMap;

 public class MainActivity extends AppCompatActivity {
    Button entr;
    Button reg;
    EditText log;
    EditText pas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entr = findViewById(R.id.button3);
        reg = findViewById(R.id.button);
        log = findViewById(R.id.editTextTextPersonName);
        pas = findViewById(R.id.editTextTextPassword);
        

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });
        entr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iy = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(iy);
            }
        });
    }
}