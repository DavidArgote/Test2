package com.apomulitos.apprepos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnLuis;
    private Button btnDaniel;
    private Button btnCris;
    private Button btnDavid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        referenciar();


    }

    private void referenciar() {

        btnLuis = findViewById(R.id.btnLuis);
        btnDaniel = findViewById(R.id.btnDaniel);
        btnCris = findViewById(R.id.btnCristhian);
        btnDavid = findViewById(R.id.btnDavid);

    }

    @Override
    public void onClick(View view) {
        
    }
}
