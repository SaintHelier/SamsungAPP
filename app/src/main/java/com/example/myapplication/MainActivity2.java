package com.example.myapplication;

import static java.security.AccessController.getContext;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button entrt;
    EditText log;
    EditText pas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        entrt=findViewById(R.id.button2);
        log=findViewById(R.id.editTextTextPersonName2);
        pas = findViewById(R.id.editTextTextPassword2);
        entrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intt = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intt);
            }
        });
        String email = entrt.getText().toString();
        String password = pas.getText().toString();

    }
}