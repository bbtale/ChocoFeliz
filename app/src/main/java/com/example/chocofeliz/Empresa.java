package com.example.chocofeliz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Empresa extends AppCompatActivity {

    Button volta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empresa);

        volta = (Button) findViewById(R.id.btnBack);

        volta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent func = new Intent(Empresa.this, MainActivity.class);
                startActivity(func);
            }
        });
    }
}