package com.example.calculaletradni;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MostrarLetraDNI extends AppCompatActivity {

    TextView letraRecibida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_letra_dni);

        dibujarFlechaAtras();

        letraRecibida =findViewById(R.id.letra);

        Log.d("MIAPP", "Activity MostrarLetraDNI ");
        Intent intent = getIntent();  //
        char letra = intent.getCharExtra("LETRA",'0');
        Log.d("MIAPP", "Letra enviada " + letra);

        letraRecibida.setText(String.valueOf(letra));

        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.animacion);
        letraRecibida.startAnimation(animacion);
    }

    private void dibujarFlechaAtras(){
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//dibujo la flecha

    }

    //ESTE MÉTODO SE INVOCA AL TOCAR UNA OPCIÓN DEL MENÚ
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Log.d("MIAPP", "Se ha tocado un elemento de la barra/menú");

        switch (item.getItemId())
        {
            case android.R.id.home:
                Log.d("MIAPP", "Ha tocado la flecha de para atrás");
                finish();
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + item.getItemId());
        }

        return true;//super.onOptionsItemSelected(item);
    }

}
