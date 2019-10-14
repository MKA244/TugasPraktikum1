package com.example.tugaspraktikum1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void luassegitiga(View view){
        Intent a = new Intent(MainActivity.this,LuasSegitigaActivity.class);
        startActivity(a);
    }

    public void empatfragment(View view){
        Intent b = new Intent(MainActivity.this,EmpatFragment.class);
        startActivity(b);
    }
}
