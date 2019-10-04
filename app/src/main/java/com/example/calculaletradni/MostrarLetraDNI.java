package com.example.calculaletradni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MostrarLetraDNI extends AppCompatActivity {

    TextView letraRecibida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_letra_dni);

        letraRecibida =findViewById(R.id.letra);

        Log.d("MIAPP", "Activity MostrarLetraDNI ");
        Intent intent = getIntent();  //
        char letra = intent.getCharExtra("LETRA",'0');
        Log.d("MIAPP", "Letra enviada " + letra);

        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.animacion);
        letraRecibida.startAnimation(animacion);
    }
}
