package com.danielfreeman.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Array;

public class MainActivity extends AppCompatActivity {

    // Elementos de la primer Activity
    EditText elNombre, elTelefono, elEmail, laDescripcion;
    String nombre, telefono, email, descripcion;


    // Date Picker
    DatePicker valorFecha;
    int dia;
    int mes;
    int anio;
    String cumpleanios;
    Button submit;

    Persona persona;

    //Botón Siguiente

    Button boton;

    // Método OnCreate que genera la primer Activity (El Formulario)

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        elNombre         = (EditText) findViewById(R.id.ElNombre);
        valorFecha       = (DatePicker) findViewById(R.id.selectorFecha);
        elTelefono       = (EditText) findViewById(R.id.ElTelefono);
        elEmail          = (EditText) findViewById(R.id.ElEmail);
        laDescripcion    = (EditText) findViewById(R.id.LaDescripcion);
        boton            = (Button)   findViewById(R.id.botonSiguiente);
        submit           = (Button)   findViewById(R.id.btnsubmit);

        //elNombre.setText(persona.getNombre());
        //elTelefono.setText(persona.getTelefono());
        //elEmail.setText(persona.getEmail());
        //laDescripcion.setText(persona.getBio());

        // Establecer Fecha

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dia        = valorFecha.getDayOfMonth();
                mes        = valorFecha.getMonth() +1;
                anio       = valorFecha.getYear();
                cumpleanios    = String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(anio);

                Toast.makeText(getBaseContext(),"La Fecha " + cumpleanios + " se ha establecido",Toast.LENGTH_LONG).show();
            }
        });

        // Enviar información y cambiar de pantalla

        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                nombre         = elNombre.getText().toString();
                telefono       = elTelefono.getText().toString();
                email          = elEmail.getText().toString();
                descripcion    = laDescripcion.getText().toString();

                persona = new Persona(nombre,dia,mes,anio,telefono,email,descripcion);

                Intent i = new Intent(MainActivity.this, ConfirmacionDatos.class);
                i.putExtra(getResources().getString(R.string.pnombre), persona.getNombre().toString());
                i.putExtra(getResources().getString(R.string.pcumpleaniosdia), String.valueOf(persona.getFechaDIA()));
                i.putExtra(getResources().getString(R.string.pcumpleaniosmes), String.valueOf(persona.getFechaMES()));
                i.putExtra(getResources().getString(R.string.pcumpleaniosanio), String.valueOf(persona.getFechaANIO()));
                i.putExtra(getResources().getString(R.string.ptelefono), persona.getTelefono().toString());
                i.putExtra(getResources().getString(R.string.pemail), persona.getEmail().toString());
                i.putExtra(getResources().getString(R.string.pdescripcion), persona.getBio().toString());
                startActivity(i);

            }
        });

    }

    

}
