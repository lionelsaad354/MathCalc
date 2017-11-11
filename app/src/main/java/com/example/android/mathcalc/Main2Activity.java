package com.example.android.mathcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private EditText edtPanjang, edtLebar;
    private Button btnHitung;
    private TextView txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edtPanjang = (EditText) findViewById(R.id.edt_alas);
        edtLebar = (EditText) findViewById(R.id.edt_tinggi);
        btnHitung = (Button) findViewById(R.id.btn_hitung_segitiga);
        txtLuas = (TextView) findViewById(R.id.txt_luas_segitiga);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = edtPanjang.getText().toString().trim();
                String lebar = edtLebar.getText().toString().trim();
                double value = 1.5;

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);
                double luas = value * p * l;

                txtLuas.setText("Luas : " + luas);
            }
        });
    }
}
