package com.apomulitos.apprepos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class pesoIdealCristhian extends AppCompatActivity implements View.OnClickListener {

    EditText altura, peso;
    TextView resMci, resCons,resPI;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso_ideal_cristhian);




        altura = findViewById(R.id.etAlturaCristhian);

        peso = findViewById(R.id.etPesoCristhian);



        resCons = findViewById(R.id.tvResultadoConsCristhian);
        resMci = findViewById(R.id.tvResultadoMciCristhian);
        resPI = findViewById(R.id.tvResultadoPICristhian);
        btnCalcular = findViewById(R.id.btnCalcularCristhian);
        btnCalcular.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCalcularCristhian:

                String textoA = altura.getText().toString();
                double valorA = Double.parseDouble(textoA);
                double valorAMci = valorA/100;

                String textoP = altura.getText().toString();
                double valorP = Double.parseDouble(textoP);

                double resultadoMci = (valorP/Math.pow(valorAMci,2));

                if (resultadoMci<18.5){
                    resCons.setText("Usted tiene un peso demasiado bajo");
                }else if (resultadoMci >=25){
                    resCons.setText("Usted tiene SOBREPESO");
                }else if (resultadoMci > 30){
                    resCons.setText("Usted tiene OBESIDAD");
                }
 
                resMci.setText("Su indice de masa corporal es: "+resultadoMci);
                double valorPI = (valorA-100);
                resPI.setText("Su peso ideal debe de ser de: "+valorPI);

                break;

            default:
                Toast.makeText(this, "Opcion no valida", Toast.LENGTH_SHORT).show();
        }


    }

}

