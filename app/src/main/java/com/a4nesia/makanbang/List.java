package com.a4nesia.makanbang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class List extends AppCompatActivity {
    ImageView Baksu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Baksu = (ImageView) findViewById(R.id.baksu);
        Baksu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(List.this, Bakso.class);
                startActivity(intent);
            }
        });
    }
}
