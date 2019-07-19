package com.apomulitos.apprepos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
        btnDaniel.setOnClickListener(this);
        btnCris = findViewById(R.id.btnCristhian);
        btnDavid = findViewById(R.id.btnDavid);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnLuis:

                break;
            case R.id.btnDaniel:
                Intent ir = new Intent(getApplicationContext(),Imc.class);
                startActivity(ir);
                break;
            case R.id.btnCristhian:

                break;
            case R.id.btnDavid:

                break;

            default:
                Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
        }


    }
}
