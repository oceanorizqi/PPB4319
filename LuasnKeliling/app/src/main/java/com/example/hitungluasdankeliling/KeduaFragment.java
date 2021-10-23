package com.example.hitungluasdankeliling;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link KeduaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class KeduaFragment extends Fragment {

    private EditText txt_alas, txt_tinggi;
    private Button btnHasil;
    private TextView hasil;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_pertama, container, false);
        txt_alas = v.findViewById(R.id.txt_alas);
        txt_tinggi = v.findViewById(R.id.txt_tinggi);
        btnHasil = v.findViewById(R.id.btnHasil);
        hasil = v.findViewById(R.id.hasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View v) {
                String nilai1 = txt_alas.getText().toString();
                String nilai2 = txt_tinggi.getText().toString();

                if(nilai1.isEmpty()){
                    txt_alas.setError("Data tidak boleh kosong");
                    txt_tinggi.requestFocus();
                }
                else if(nilai2.isEmpty()){
                    txt_alas.setError("Data tidak boleh kosong");
                    txt_tinggi.requestFocus();
                }
                else {
                    Double alas = Double.parseDouble(nilai1);
                    Double tinggi = Double.parseDouble(nilai2);

                    Double luas = 0.5 * alas * tinggi;
                    hasil.setText(String.format("%.2f", luas));
                }
            }
        });
        return v;
    }
}