package com.example.petagram;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {


    ArrayList<Contacto> mascotas;

    private RecyclerView MascotasFavoritas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //This line helps to display back arrow
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        MascotasFavoritas =   (RecyclerView) findViewById(R.id.MascotasFavoritas);

        LinearLayoutManager llm= new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        MascotasFavoritas.setLayoutManager(llm);
        InicializarMascotasFavoritas();
        InicializarAdaptadorMascota();

    }

                public AdaptadorMascotaFavorita adaptador;
                private void InicializarAdaptadorMascota() {
                 adaptador = new  AdaptadorMascotaFavorita  (mascotas, this);
                 MascotasFavoritas.setAdapter(adaptador);

                }

        private void InicializarMascotasFavoritas() {
             mascotas = new ArrayList<Contacto>();
             mascotas.add(new Contacto("Gatito", R.drawable.gato));
             mascotas.add(new Contacto("Perrito", R.drawable.perro));
            mascotas.add(new Contacto("Gatito", R.drawable.gato));
            mascotas.add(new Contacto("Perrito", R.drawable.perro));
            mascotas.add(new Contacto("Gatito", R.drawable.gato));
             }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            int id = item.getItemId();
            // Respond to the action bar's Up/Home button
            if (id == android.R.id.home) {
                onBackPressed();
                return true;
            }
            return super.onOptionsItemSelected(item);
        }








}



