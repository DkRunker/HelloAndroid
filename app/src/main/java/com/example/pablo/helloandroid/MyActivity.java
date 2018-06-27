package com.example.pablo.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.util.Log;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_layout);

        //Prueba de Toast y Log
        Toast.makeText(this, "Puedes verme?", Toast.LENGTH_SHORT).show();
        Log.i("info", "App creada: ");
    }

    public void topClick(View v){
        Toast.makeText(this, "Top button clicked", Toast.LENGTH_SHORT).show();
        Log.i("info", "topClick: ");
    }

    public void bottomClick(View v){
        Toast.makeText(this,"Bottom button clicked", Toast.LENGTH_SHORT).show();
        Log.i("info", "bottomClick: ");
    }
}
