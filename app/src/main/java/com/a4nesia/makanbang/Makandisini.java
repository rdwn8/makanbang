package com.a4nesia.makanbang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Makandisini extends AppCompatActivity {

    Button sini;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makandisini);
        Toast.makeText(getApplicationContext(),"Dine In", Toast.LENGTH_LONG).show();
        sini = (Button) findViewById(R.id.pilihsini);
        sini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Makandisini.this, List.class);
                startActivity(intent);
            }
        });
    }
}
