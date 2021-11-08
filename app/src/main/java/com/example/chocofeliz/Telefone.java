package com.example.chocofeliz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Telefone extends AppCompatActivity {

    Button volta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telefone);

        volta = (Button) findViewById(R.id.btnBack);

        volta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent func = new Intent(Telefone.this, MainActivity.class);
                startActivity(func);
            }
        });

    }
}