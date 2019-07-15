package com.apomulitos.apprepos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

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

        int peso = Integer.parseInt(editTextPeso.getText().toString());
        int altura = Integer.parseInt(editTextAltura.getText().toString());

        int result = peso / (altura*altura);

        textResul.setText(String.valueOf(result));

    }


}
