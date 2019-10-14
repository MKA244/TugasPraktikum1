package com.example.tugaspraktikum1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasSegitigaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);

        final EditText alas = (EditText)findViewById(R.id.i_alas);
        final EditText tinggi = (EditText)findViewById(R.id.i_tinggi);

        final TextView hasil = (TextView) findViewById(R.id.hasil);

        final Button tampil = (Button) findViewById(R.id.button);
        tampil.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String n_alas = alas.getText().toString();
                String n_tinggi = tinggi.getText().toString();
                double alas1 = Double.parseDouble(n_alas);
                double tinggi1 = Double.parseDouble(n_tinggi);
                double lsegitiga = (alas1 * tinggi1 * 0.5);
                String output = String.valueOf(lsegitiga);
                hasil.setText(output.toString());
            }
        });
    }
}
