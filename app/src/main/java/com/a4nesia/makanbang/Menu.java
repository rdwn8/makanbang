package com.a4nesia.makanbang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    private RadioButton makandisini, bungkus;
    private Button pesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toast.makeText(getApplicationContext(),"MUH.RIDWAN 1202154222", Toast.LENGTH_LONG).show();
        makandisini = (RadioButton) findViewById(R.id.makandisini);
        bungkus = (RadioButton) findViewById(R.id.bungkus);
        pesan = (Button) findViewById(R.id.pesansekarang);
        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (makandisini.isChecked()){
                    Intent intent = new Intent(Menu.this, Makandisini.class);
                    startActivity(intent);
                }
                if (bungkus.isChecked()) {
                    Intent intent = new Intent(Menu.this, Bungkus.class);
                    startActivity(intent);
                }
            }
        });
    }
}
