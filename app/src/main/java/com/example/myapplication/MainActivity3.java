package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    Button kyr;
    Button test;
    Button polz;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        kyr = findViewById(R.id.button4);
        test = findViewById(R.id.button5);
        polz = findViewById(R.id.button6);
        button = findViewById(R.id.button7);
        DB_SCHOOL ff = new DB_SCHOOL(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BlankFragment fr = new BlankFragment();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fragmentContainerView2, fr);
                ft.commit();
            }
        });
        kyr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BlankFragment2 fr = new BlankFragment2();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fragmentContainerView2, fr);
                ft.commit();
            }
        });
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BlankFragment3 fr = new BlankFragment3();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fragmentContainerView2, fr);
                ft.commit();
            }
        });
        polz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BlankFragment4 fr = new BlankFragment4();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fragmentContainerView2, fr);
                ft.commit();
            }
        });
    }
}