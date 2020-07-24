package com.example.petagram;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.MenuInflater;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contacto> contactos;

    private RecyclerView listaContactos;



private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        listaContactos =   (RecyclerView) findViewById(R.id.rvContactos);

        LinearLayoutManager llm= new LinearLayoutManager(this);
          llm.setOrientation(LinearLayoutManager.VERTICAL);

           listaContactos.setLayoutManager(llm);
           InicializarListaContactos();
       InicializarAdaptador();



        }

    public MascotaAdaptador adaptador;
    private void InicializarAdaptador(){
        adaptador = new MascotaAdaptador (contactos, this);
        listaContactos.setAdapter(adaptador);

    }


    public void InicializarListaContactos() {
        contactos = new ArrayList<Contacto>();
        contactos.add(new Contacto("Gatito", R.drawable.gato));
        contactos.add(new Contacto("Perrito", R.drawable.perro));
        contactos.add(new Contacto("Gatito", R.drawable.gato));
        contactos.add(new Contacto("Perrito", R.drawable.perro));
        contactos.add(new Contacto("Gatito", R.drawable.gato));
        contactos.add(new Contacto("Gatito", R.drawable.gato));
        contactos.add(new Contacto("Perrito", R.drawable.perro));
        contactos.add(new Contacto("Gatito", R.drawable.gato));


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
       MenuInflater  inflater = getMenuInflater();
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        Intent intent = new Intent ();
        if (item.getItemId() == R.id.iconFavorito) {
            intent.setClass(this, MascotasFavoritas.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);


    }


}
