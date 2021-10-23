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
 * Use the {@link KetigaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class KetigaFragment extends Fragment {

    private Button btnHasil;
    private EditText txt_jari_jari;
    private TextView hasil;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_pertama, container, false);
        btnHasil = v.findViewById(R.id.btnHasil);
        txt_jari_jari = v.findViewById(R.id.txt_jari_jari);
        hasil = v.findViewById(R.id.hasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View v) {
                String nilai = txt_jari_jari.getText().toString();

                if(nilai.isEmpty()) {
                    txt_jari_jari.setError("Data tidak boleh kosong");
                    txt_jari_jari.requestFocus();
                }
                else {
                    Double jari = Double.parseDouble(nilai);
                    Double luas = 3.14 * (jari * 2);

                    hasil.setText(String.format("%.2f",luas));
                }
            }
        });
        return v;
    }
}