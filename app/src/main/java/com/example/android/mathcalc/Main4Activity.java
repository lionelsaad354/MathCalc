package com.example.android.mathcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    private EditText edtPanjangSisia, getEdtPanjangSisib, edtTinggi;
    private Button btnHitung;
    private TextView txtLuas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        edtPanjangSisia = (EditText)findViewById(R.id.edt_panjang_sisi_a);
        getEdtPanjangSisib = (EditText)findViewById(R.id.edt_panjang_sisi_b);
        edtTinggi = (EditText)findViewById(R.id.edt_tinggi);
        btnHitung = (Button)findViewById(R.id.btn_hitung_trapesium);
        txtLuas = (TextView)findViewById(R.id.txt_luas_trapesium);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjangSisia = edtPanjangSisia.getText().toString().trim();
                String panjangSisib = getEdtPanjangSisib.getText().toString().trim();
                String tinggi = edtTinggi.getText().toString().trim();

                double a = Double.parseDouble(panjangSisia);
                double b = Double.parseDouble(panjangSisib);
                double t = Double.parseDouble(tinggi);
                double value = 1.5;

                double penjumlahanAntarSisi = a + b;

                double luas = value * penjumlahanAntarSisi * t;

                txtLuas.setText("Luas :"+luas);
            }
        });
    }
}
