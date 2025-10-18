package com.example.alan_uimenu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class fragmentoBoton extends Fragment {

    private TextView tvContador;
    private Button btnContar;
    private Button btnReset;
    private int contador = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewBoton = inflater.inflate(R.layout.fragment_fragmento_boton, container, false);

        // Inicializar vistas
        tvContador = viewBoton.findViewById(R.id.tvContador);
        btnContar = viewBoton.findViewById(R.id.btnContar);
        btnReset = viewBoton.findViewById(R.id.btnReset);

        // Configurar listener para el botón de contar
        btnContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador++;
                actualizarContador();
            }
        });

        // Configurar listener para el botón de reset
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador = 0;
                actualizarContador();
            }
        });

        return viewBoton;
    }

    private void actualizarContador() {
        tvContador.setText("Clicks: " + contador);
    }
}