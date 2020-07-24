package com.example.petagram;

import android.app.Activity;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{
    ArrayList<Contacto> contactos;
    Activity activity;

    public MascotaAdaptador(ArrayList<Contacto> contactos, Activity activity) {
        this.contactos = contactos;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas,parent,false);
        return new MascotaViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull MascotaViewHolder holder, int position) {

        final Contacto contacto = contactos.get(position);
        holder.ImgFoto.setImageResource(contacto.getFoto());
        holder.TextNombre.setText(contacto.getNombre());

    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView ImgFoto;
        private TextView TextNombre;
        private  ImageButton BtnRanking;
        private  TextView TextNumero;


        public MascotaViewHolder(@NonNull View itemView) {
            super(itemView);
        ImgFoto     = (ImageView) itemView.findViewById(R.id.ImgFoto);
        TextNombre  = (TextView) itemView.findViewById(R.id.TexTNombre);
        BtnRanking = (ImageButton) itemView.findViewById(R.id.BtnRanking);
        TextNumero = (TextView) itemView.findViewById(R.id.TextNumero); }



    }




}

