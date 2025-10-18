package com.example.alan_uimenu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class fragmentoCheckBox extends Fragment {

    private CheckBox cbDeportes, cbMusica, cbLectura, cbCocinar, cbViajar;
    private Button btnSeleccionarTodos, btnDeseleccionarTodos;
    private TextView tvResumen;
    private List<CheckBox> checkBoxes;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewCheckBox = inflater.inflate(R.layout.fragment_fragmento_check_box, container, false);

        // Inicializar vistas
        cbDeportes = viewCheckBox.findViewById(R.id.cbDeportes);
        cbMusica = viewCheckBox.findViewById(R.id.cbMusica);
        cbLectura = viewCheckBox.findViewById(R.id.cbLectura);
        cbCocinar = viewCheckBox.findViewById(R.id.cbCocinar);
        cbViajar = viewCheckBox.findViewById(R.id.cbViajar);
        btnSeleccionarTodos = viewCheckBox.findViewById(R.id.btnSeleccionarTodos);
        btnDeseleccionarTodos = viewCheckBox.findViewById(R.id.btnDeseleccionarTodos);

        // Crear lista de CheckBoxes para fácil manejo
        checkBoxes = new ArrayList<>();
        checkBoxes.add(cbDeportes);
        checkBoxes.add(cbMusica);
        checkBoxes.add(cbLectura);
        checkBoxes.add(cbCocinar);
        checkBoxes.add(cbViajar);

        // Configurar listeners para cada CheckBox
        for (CheckBox checkBox : checkBoxes) {
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    actualizarResumen();
                }
            });
        }

        // Configurar listener para seleccionar todos
        btnSeleccionarTodos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionarTodos(true);
            }
        });

        // Configurar listener para deseleccionar todos
        btnDeseleccionarTodos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionarTodos(false);
            }
        });

        // Inicializar el resumen
        actualizarResumen();

        return viewCheckBox;
    }

    private void seleccionarTodos(boolean seleccionar) {
        for (CheckBox checkBox : checkBoxes) {
            checkBox.setChecked(seleccionar);
        }
    }

    private void actualizarResumen() {
        List<String> seleccionados = new ArrayList<>();

        for (CheckBox checkBox : checkBoxes) {
            if (checkBox.isChecked()) {
                seleccionados.add(checkBox.getText().toString());
            }
        }

        String resumen;
        if (seleccionados.isEmpty()) {
            resumen = "Selecciones: Ninguna";
        } else {
            resumen = "Selecciones (" + seleccionados.size() + "): " + String.join(", ", seleccionados);
        }

    }
}
