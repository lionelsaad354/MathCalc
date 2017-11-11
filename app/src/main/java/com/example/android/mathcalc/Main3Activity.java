package com.example.android.mathcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    private EditText edtPanjang;
    private TextView txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        edtPanjang = (EditText)findViewById(R.id.edt_jari_jari);
        txtLuas = (TextView)findViewById(R.id.txt_luas_lingkaran);
    }
    public void luasLingkaran (View view){
        String panjang = edtPanjang.getText().toString().trim();
        double phi = 3.14;

        double r = Double.parseDouble(panjang);
        double luasLingkaran = phi * r *r;

        txtLuas.setText("Luas :"+luasLingkaran);
    }
}
