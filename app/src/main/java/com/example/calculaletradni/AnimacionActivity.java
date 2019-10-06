package com.example.calculaletradni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.calculaletradni.R;

public class AnimacionActivity extends AppCompatActivity {

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_animacion);

                ImageView iv = findViewById(R.id.imagen);
                Animation animacion = AnimationUtils.loadAnimation(this, R.anim.animacion);
                iv.startAnimation(animacion);
            }


}
