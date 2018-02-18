package com.a4nesia.makanbang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Bungkus extends AppCompatActivity {
    Button bungkus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bungkus);
        Toast.makeText(getApplicationContext(),"Take Away", Toast.LENGTH_LONG).show();
        bungkus = (Button) findViewById(R.id.pilihbungkus);
        bungkus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Bungkus.this, List.class);
                startActivity(intent);
            }
        });
    }
}
