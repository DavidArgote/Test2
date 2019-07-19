package com.apomulitos.apprepos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Imc extends AppCompatActivity {
    EditText altura,peso,edad;
    Button consultar;
    TextView ver1,ideal;
    CheckBox hombre,mujer;
    double eda = 0.0,altu = 0.0,pes = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        referenciar();
    }

    private void referenciar() {

        altura = findViewById(R.id.altura_txt);
        peso = findViewById(R.id.peso_txt);
        consultar = findViewById(R.id.btn_consul);
        ver1 = findViewById(R.id.ver1);
        ideal = findViewById(R.id.pesoIdeal);
        edad = findViewById(R.id.edad);
        hombre = findViewById(R.id.hombre);
        mujer = findViewById(R.id.mujer);

        consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                todo();
            }
        });

    }

    private void todo() {

        eda = Double.parseDouble(edad.getText().toString());
        altu = Double.parseDouble(altura.getText().toString());
        pes = Double.parseDouble(peso.getText().toString());
        double al = (altu*altu);

        double resultado = (pes/al);
        double alt= altu*100;

        double resul = (((alt-150)*3)/4)+((eda-20)/4);

        if(hombre.isChecked() == true && mujer.isChecked() == false){

            if(eda >= 19 && eda <= 29) {

                if (resultado < 19.0) {
                    ver1.setText("Tu IMC es de " + resultado + "\n Estas un poco flaco");
                    ideal.setText("Y tu Peso ideal es de " +resul);

                }
                if (resultado >= 19.0 && resultado <= 24.9) {
                    ver1.setText("Tu IMC es de " + resultado + "\n Tienes un muy buen peso exelente");
                    ideal.setText("Y tu Peso ideal es de " +resul);

                }
                if (resultado > 24.9) {
                    ver1.setText("Tu IMC es de " + resultado + "\n Estas gordito");
                    ideal.setText("Y tu Peso ideal es de " +resul);
                }
            }

            if(eda >= 30 && eda <= 100) {

                if (resultado < 20.0) {
                    ver1.setText("Tu IMC es de " + resultado + "\n Estas un poco flaco");
                    ideal.setText("Y tu Peso ideal es de " +resul);

                }
                if (resultado >= 20.0 && resultado <= 25.9) {
                    ver1.setText("Tu IMC es de " + resultado + "\n Tienes un muy buen peso exelente");
                    ideal.setText("Y tu Peso ideal es de " +resul);

                }
                if (resultado > 25.9) {
                    ver1.setText("Tu IMC es de " + resultado + "\n Estas gordito");
                    ideal.setText("Y tu Peso ideal es de " +resul);
                }
            }

        }

        if(hombre.isChecked() == false && mujer.isChecked() == true){

            if(eda >= 19 && eda <= 29) {

                if (resultado < 19.0) {
                    ver1.setText("Tu IMC es de " + resultado + "\n Estas un poco flaco");
                    ideal.setText("Y tu Peso ideal es de " +resul);

                }
                if (resultado >= 19.0 && resultado <= 24.9) {
                    ver1.setText("Tu IMC es de " + resultado + "\n Tienes un muy buen peso exelente");
                    ideal.setText("Y tu Peso ideal es de " +resul);

                }
                if (resultado > 25) {
                    ver1.setText("Tu IMC es de " + resultado + "\n Estas gordito");
                    ideal.setText("Y tu Peso ideal es de " +resul);
                }
            }

            if(eda >= 30 && eda <= 34) {

                if (resultado < 20.0) {
                    ver1.setText("Tu IMC es de " + resultado + "\n Estas un poco flaco");
                    ideal.setText("Y tu Peso ideal es de " +resul);

                }
                if (resultado >= 20.0 && resultado <= 25.9) {
                    ver1.setText("Tu IMC es de " + resultado + "\n Tienes un muy buen peso exelente");
                    ideal.setText("Y tu Peso ideal es de " +resul);

                }
                if (resultado > 26) {
                    ver1.setText("Tu IMC es de " + resultado + "\n Estas gordito");
                    ideal.setText("Y tu Peso ideal es de " +resul);
                }
            }

            if(eda >= 35 && eda <= 44) {

                if (resultado < 21.0) {
                    ver1.setText("Tu IMC es de " + resultado + "\n Estas un poco flaco");
                    ideal.setText("Y tu Peso ideal es de " +resul);

                }
                if (resultado >= 21.0 && resultado <= 26.9) {
                    ver1.setText("Tu IMC es de " + resultado + "\n Tienes un muy buen peso exelente");
                    ideal.setText("Y tu Peso ideal es de " +resul);

                }
                if (resultado > 27) {
                    ver1.setText("Tu IMC es de " + resultado + "\n Estas gordito");
                    ideal.setText("Y tu Peso ideal es de " +resul);
                }
            }
            if(eda >= 45 && eda <= 54) {

                if (resultado < 22.0) {
                    ver1.setText("Tu IMC es de " + resultado + "\n Estas un poco flaco");
                    ideal.setText("Y tu Peso ideal es de " +resul);

                }
                if (resultado >= 22.0 && resultado <= 27.9) {
                    ver1.setText("Tu IMC es de " + resultado + "\n Tienes un muy buen peso exelente");
                    ideal.setText("Y tu Peso ideal es de " +resul);

                }
                if (resultado > 28) {
                    ver1.setText("Tu IMC es de " + resultado + "\n Estas gordito");
                    ideal.setText("Y tu Peso ideal es de " +resul);
                }
            }

            if(eda >= 55 && eda <= 64) {

                if (resultado < 23.0) {
                    ver1.setText("Tu IMC es de " + resultado + "\n Estas un poco flaco");
                    ideal.setText("Y tu Peso ideal es de " +resul);

                }
                if (resultado >= 19.0 && resultado <= 28.9) {
                    ver1.setText("Tu IMC es de " + resultado + "\n Tienes un muy buen peso exelente");
                    ideal.setText("Y tu Peso ideal es de " +resul);

                }
                if (resultado > 29) {
                    ver1.setText("Tu IMC es de " + resultado + "\n Estas gordito");
                    ideal.setText("Y tu Peso ideal es de " +resul);
                }

            }

            if(eda <= 65) {

                if (resultado < 24.0) {
                    ver1.setText("Tu IMC es de " + resultado + "\n Estas un poco flaco");
                    ideal.setText("Y tu Peso ideal es de " +resul);

                }
                if (resultado >= 24.0 && resultado <= 29.9) {
                    ver1.setText("Tu IMC es de " + resultado + "\n Tienes un muy buen peso exelente");
                    ideal.setText("Y tu Peso ideal es de " +resul);

                }
                if (resultado > 30) {
                    ver1.setText("Tu IMC es de " + resultado + "\n Estas gordito");
                    ideal.setText("Y tu Peso ideal es de " +resul);
                }
            }
        }

        if (hombre.isChecked() == true && mujer.isChecked() == true){

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Error");
            builder.setMessage("NO PUEDE MARCAR LOS DOS CAMPOS");
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            builder.show();

        }

        if (hombre.isChecked()==false &&  mujer.isChecked() == false){

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Error");
            builder.setMessage("TIENE QUE MARCAR UNO DE LOS DOS CAMPOS ");
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            builder.show();

        }
    }
}
