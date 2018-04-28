package com.example.baltazarcastro.diseo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MateriasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materias);

        Spinner spinnerGrupo = (Spinner) findViewById(R.id.spinnerGrupo);
        String[] Grupos = {"Grupo1","Grupo2","Grupo3","Grupo3","Grupo4"};
        spinnerGrupo.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Grupos));

        Spinner spinnerHorario = (Spinner) findViewById(R.id.spinnerHorario);
        String[] Horarios = {"7:00am","8:00am","9:00am","10:00am","11:00am","12:00pm","1:00pm","2:00pm","3:00pm","4:00pm","5:00pm","6:00pm","7:00pm","8:00pm"};
        spinnerHorario.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Horarios));
    }
}
