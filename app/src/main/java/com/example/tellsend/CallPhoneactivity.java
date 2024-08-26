package com.example.tellsend;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CallPhoneactivity extends AppCompatActivity {
    EditText edtphone;
    ImageButton btncall;
    Button btnback1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_phoneactivity);
        edtphone =findViewById(R.id.edtphone);
        btncall = findViewById(R.id.btncall);
        btnback1 = findViewById(R.id.btnback1);
        // xử lí click
        btncall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // khai báo intent ẩn
                Intent callintent= new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+edtphone.getText().toString()));
                // yêu cầu sự đồng ý người dùng
                if (ActivityCompat.checkSelfPermission(CallPhoneactivity.this,
                        android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(CallPhoneactivity.this, new
                            String[]{android.Manifest.permission.CALL_PHONE},1);
                    return;
                }
                startActivity(callintent);
            }
        });
        btnback1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}