package com.example.android.mathcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    private EditText edtJariJari, edtTinggi;
    private TextView txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        edtJariJari = (EditText)findViewById(R.id.edt_jari_jari_tabung);
        edtTinggi = (EditText)findViewById(R.id.edt_tinggi_tabung);
        txtLuas = (TextView)findViewById(R.id.txt_volume_tabung);
    }

    public void volumeTabung (View view){
        String jariJari = edtJariJari.getText().toString().trim();
        String tinggi = edtTinggi.getText().toString().trim();
        double phi = 3.14;
        double r = Double.parseDouble(jariJari);
        double t = Double.parseDouble(tinggi);
        double jariKuadrat = r * r;

        double volumeTabung = phi * jariKuadrat * t;

        txtLuas.setText("Volume :"+volumeTabung);
    }
}
