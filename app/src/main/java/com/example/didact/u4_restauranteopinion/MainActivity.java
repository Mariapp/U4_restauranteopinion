package com.example.didact.u4_restauranteopinion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    static final String EXTRA_NOMBRE = "nombre";
    static final String EXTRA_OPINION = "opinion";
    static final String EXTRA_VALORACION = "valoracion";

    EditText etrestaurantenombre, edrestauranteopinion;
    Spinner spvaloracion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spvaloracion = (Spinner) findViewById(R.id.spvaloracion);
        etrestaurantenombre = (EditText) findViewById(R.id.etrestaurantenombre);
        edrestauranteopinion = (EditText) findViewById(R.id.edrestauranteopinion);

        String[] valoracion = {"", "1", "2", "3", "4", "5"};
        ArrayAdapter <String> adaptadorDorsales = new ArrayAdapter <String>(this,
                android.R.layout.simple_expandable_list_item_1, valoracion);
        spvaloracion.setAdapter(adaptadorDorsales);


    }

    public void botonverinicial(View view) {

        String nombre = etrestaurantenombre.getText().toString();
        String opinion = edrestauranteopinion.getText().toString();
        String valoracion = spvaloracion.getSelectedItem().toString();

        //String valoracion=spvaloracion.getOnItemSelectedListener().toString();

        if (nombre.equals("") || opinion.equals("")||valoracion.equals("")) {
            Toast.makeText(getApplicationContext(), "Rellena todos los campos", Toast.LENGTH_LONG).show();
        } else {


            Intent i = new Intent(getApplicationContext(), opinioactivity.class);

            i.putExtra(EXTRA_NOMBRE, nombre);
            i.putExtra(EXTRA_OPINION, opinion);
            i.putExtra(EXTRA_VALORACION, valoracion);


            startActivity(i);


        }

    }
}