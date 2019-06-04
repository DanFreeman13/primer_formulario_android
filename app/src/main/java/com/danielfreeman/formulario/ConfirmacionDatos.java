package com.danielfreeman.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ConfirmacionDatos extends AppCompatActivity {

    String nombre, cumpleaniosdia, cumpleaniosmes, cumpleaniosanio, telefono, email, descripcion;
    TextView NombreDado, Cumpleanios, TelefonoDado, EmailDado, Bio;

    Button editar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion_datos);

        //Cachar Información desde la Activity Anterior
        Bundle datos  = getIntent().getExtras();

        nombre          = datos.getString(getResources().getString(R.string.pnombre));
        cumpleaniosdia  = datos.getString(getResources().getString(R.string.pcumpleaniosdia));
        cumpleaniosmes  = datos.getString(getResources().getString(R.string.pcumpleaniosmes));
        cumpleaniosanio = datos.getString(getResources().getString(R.string.pcumpleaniosanio));

        String cumple = cumpleaniosdia + "/" + cumpleaniosmes + "/" + cumpleaniosanio;

        telefono        = datos.getString(getResources().getString(R.string.ptelefono));
        email           = datos.getString(getResources().getString(R.string.pemail));
        descripcion     = datos.getString(getResources().getString(R.string.pdescripcion));


        //Identificar los Views de esta Activity

        NombreDado   = (TextView) findViewById(R.id.NombreDado);
        Cumpleanios  = (TextView) findViewById(R.id.Cumpleanios);
        TelefonoDado = (TextView) findViewById(R.id.TelefonoDado);
        EmailDado    = (TextView) findViewById(R.id.EmailDado);
        Bio          = (TextView) findViewById(R.id.Bio);

        //Asignar las propiedades cachadas al texto (Strings) de esta Activity

        NombreDado.setText(nombre);
        Cumpleanios.setText(cumple);
        TelefonoDado.setText(telefono);
        EmailDado.setText(email);
        Bio.setText(descripcion);

        editar = (Button) findViewById(R.id.btnEditar);

        editar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent j = new Intent(ConfirmacionDatos.this, MainActivity.class);
                startActivity(j);

            }
        });

    }
}
