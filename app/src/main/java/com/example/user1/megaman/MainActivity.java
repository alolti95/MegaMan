package com.example.user1.megaman;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imagen = (ImageView) findViewById(R.id.imgClick);
        AnimationDrawable animacion = (AnimationDrawable) imagen.getDrawable();
        animacion.start();
    }
}
