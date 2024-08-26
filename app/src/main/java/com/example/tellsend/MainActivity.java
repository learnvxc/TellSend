package com.example.tellsend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btncallphone,btnsendsms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       btncallphone =findViewById(R.id.btncallphone);
       btnsendsms = findViewById(R.id.btnsendsms);
       // xử lí click
        btncallphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // khai báo Intent công khai
                Intent myintent =new Intent(MainActivity.this, CallPhoneactivity.class);
                startActivity(myintent);
            }
        });
        btnsendsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // khai báo intent công khai
                Intent myintent2 =new Intent(MainActivity.this, sendactivity.class);
                startActivity(myintent2);
            }
        });
    }
}