package com.apomulitos.apprepos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class DavidActivity extends AppCompatActivity {

    private EditText editTextPeso;
    private EditText editTextAltura;
    private Spinner spGenero;

    private Button btnCalc;
    private TextView textResul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_david);

        referenciar();
    }

    private void referenciar() {

        editTextPeso = findViewById(R.id.editTextPeso);
        editTextAltura = findViewById(R.id.editTextAltura);
        spGenero = findViewById(R.id.spinnerGenero);

        btnCalc = findViewById(R.id.btnCalcular);

        textResul = findViewById(R.id.textResult);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcIndice();
            }
        });

    }

    private void calcIndice() {

        double peso = Double.parseDouble(editTextPeso.getText().toString());
        double altura = Double.parseDouble(editTextAltura.getText().toString());

        altura = (altura * 0.01) / 1;

        double result = peso / Math.pow(altura, 2);

        textResul.setText(String.valueOf(result));

        if (result >= 30 && result <= 34.9 && spGenero.getSelectedItem().equals("Femenino")){
            // Obesa 1
        }else if (result >= 35 && result <= 39.9 && spGenero.getSelectedItem().equals("Femenino")){
            // Obeso 2
        }else if (result >= 40 && result <= 49.9 && spGenero.getSelectedItem().equals("Femenino")){
            // Obeso 3
        }else if (result > 50 && spGenero.getSelectedItem().equals("Femenino")){
            // obeso total
        }else if (result >= 25 && result <= 29.9 && spGenero.getSelectedItem().equals("Femenino")){
            //Sobre peso
        }else if (result >= 18.5 && result <= 24.9 && spGenero.getSelectedItem().equals("Femenino")){
            // Normal
        }else if (result < 18.5 && spGenero.getSelectedItem().equals("Femenino")){
            // bajo peso
        }


    }


}
