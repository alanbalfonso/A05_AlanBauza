package com.example.alan_uimenu;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class fragmentoSpinner extends Fragment {

    private Spinner spinnerPaises;
    private TextView tvPaisSeleccionado;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewSpinner = inflater.inflate(R.layout.fragment_fragmento_spinner, container, false);

        // Inicializar los componentes
        spinnerPaises = viewSpinner.findViewById(R.id.spinnerPaises);
        tvPaisSeleccionado = viewSpinner.findViewById(R.id.tvPaisSeleccionado);

        // Lista de países para el spinner
        String[] paises = {
            "México",
            "Estados Unidos",
            "Canadá",
            "Argentina",
            "Brasil",
            "Colombia",
            "España",
            "Francia",
            "Alemania",
            "Italia",
            "Reino Unido",
            "Japón",
            "China",
            "Corea del Sur",
            "Australia"
        };

        // Crear el adaptador para el spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
            getContext(),
            android.R.layout.simple_spinner_item,
            paises
        );

        // Establecer el layout para las opciones desplegables
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Asignar el adaptador al spinner
        spinnerPaises.setAdapter(adapter);

        // Configurar el listener para manejar la selección
        spinnerPaises.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String paisSeleccionado = parent.getItemAtPosition(position).toString();

                if (position == 0) {
                    // Si selecciona la primera opción (placeholder)
                    tvPaisSeleccionado.setText("País seleccionado: Ninguno");
                } else {
                    // Mostrar el país seleccionado
                    tvPaisSeleccionado.setText("País seleccionado: " + paisSeleccionado);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                tvPaisSeleccionado.setText("País seleccionado: Ninguno");
            }
        });

        return viewSpinner;
    }
}
