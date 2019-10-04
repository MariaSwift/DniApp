package com.example.calculaletradni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextDni;
    char letraDNI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MIAPP", "MainActivity");


    }

    public void calcularLetraDNI(View view) {

        Log.d("MIAPP", "calcularLetraDNI ");

        editTextDni = findViewById(R.id.dni);

        String dniSinLetra = editTextDni.getText().toString();

        int numeroDNI = Integer.parseInt(dniSinLetra);

        int resto = numeroDNI % 23;

        letraDNI = 'Ñ';

        Log.d("MIAPP", "MainActivity  inicio switch");

        switch (resto) {
            case 0:
                letraDNI = 'T';
                break;
            case 1:
                letraDNI = 'R';
                break;
            case 2:
                letraDNI = 'W';
                break;
            case 3:
                letraDNI = 'A';
                break;
            case 4:
                letraDNI = 'G';
                break;
            case 5:
                letraDNI = 'M';
                break;
            case 6:
                letraDNI = 'Y';
                break;
            case 7:
                letraDNI = 'F';
                break;
            case 8:
                letraDNI = 'P';
                break;
            case 9:
                letraDNI = 'D';
                break;
            case 10:
                letraDNI = 'X';
                break;
            case 11:
                letraDNI = 'B';
                break;
            case 12:
                letraDNI = 'N';
                break;
            case 13:
                letraDNI = 'J';
                break;
            case 14:
                letraDNI = 'Z';
                break;
            case 15:
                letraDNI = 'S';
                break;
            case 16:
                letraDNI = 'Q';
                break;
            case 17:
                letraDNI = 'V';
                break;
            case 18:
                letraDNI = 'H';
                break;
            case 19:
                letraDNI = 'L';
                break;
            case 20:
                letraDNI = 'C';
                break;
            case 21:
                letraDNI = 'K';
                break;
            case 22:
                letraDNI = 'E';
                break;
        }

        Intent intent = null;
        intent = new Intent(this, MostrarLetraDNI.class);

        intent.putExtra("LETRA", letraDNI);
        startActivity(intent);

    }
}
