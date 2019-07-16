package com.apomulitos.apprepos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Peso extends AppCompatActivity {
    private TextView lista;
    private ImageView imagen;
    private EditText peso;
    private EditText altura;
    private EditText edad;

    private Button enviar;

    private RadioButton femenino;
    private RadioButton masculino;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso);
        inicializar();
    }

    private void inicializar() {
        lista = findViewById(R.id.TexviewRES);

        peso = findViewById(R.id.EdiPeso);

        altura = findViewById(R.id.EdiAtura);
        edad = findViewById(R.id.EdiEdad);


        femenino = findViewById(R.id.RadioFeme);
        masculino = findViewById(R.id.RadioMascu);

        enviar = findViewById(R.id.ButtonEnvio);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int e = Integer.parseInt(edad.getText().toString());
                if (e>18){
                if (femenino.isChecked()){
                    int p = Integer.parseInt(peso.getText().toString());
                    Double a = Double.valueOf(altura.getText().toString());
                    Double p2 = Double.valueOf(a / 100);
                    Double masa = Double.valueOf(p / (p2*p2));
                    if (masa>17 && masa<20){
                        lista.setText("Esta bajo de masa, la tabla que debe manejar es la siguiente");


                    }else if (masa>21 && masa<24){
                        lista.setText("Esta Normal de masa, la tabla que debe manejar es la siguiente");


                    }else if (masa>25 && masa<29){
                        lista.setText("Esta con sobre peso, la tabla que debe manejar es la siguiente");


                    }else if (masa>30 && masa<34){
                        lista.setText("contiene obecidad, la tabla que debe manejar es la siguiente");


                    }else if (masa>35 && masa<39){
                        lista.setText("Esta con obec. marcada, la tabla que debe manejar es la siguiente");


                    }else if (masa>40){
                        lista.setText("Pinche madre ya es una bola demoledora, la tabla que debe manejar es la siguiente");


                    }
                }else if (masculino.isChecked()) {
                    int p = Integer.parseInt(peso.getText().toString());
                    Double a = Double.valueOf(altura.getText().toString());
                    Double p2 = Double.valueOf(a / 100);
                    Double masa = Double.valueOf(p / (p2*p2));

                    if (masa < 17) {
                        lista.setText("Esta bajo de masa, la tabla que debe manejar es la siguiente");


                    } else if (masa > 18 || masa < 20) {
                        lista.setText("Esta Normal de masa, la tabla que debe manejar es la siguiente");


                    } else if (masa > 21 || masa < 25) {
                        lista.setText("Esta con sobre peso, la tabla que debe manejar es la siguiente");


                    } else if (masa > 26 || masa < 30) {
                        lista.setText("contiene obecidad, la tabla que debe manejar es la siguiente");


                    } else if (masa > 31 || masa < 35) {
                        lista.setText("Esta con obec. marcada, la tabla que debe manejar es la siguiente");


                    } else if (masa > 40) {
                        lista.setText("Pinche madre ya es una bola demoledora, la tabla que debe manejar es la siguiente");


                    }
                }
                }


            }
        });

    }
}
