package com.example.petagram;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class AdaptadorMascotaFavorita extends RecyclerView.Adapter<AdaptadorMascotaFavorita.MascotaFavViewHolder> {

    ArrayList<Contacto> mascotas;
    Activity activity;


    public AdaptadorMascotaFavorita(ArrayList<Contacto> mascotas, Activity activity) {
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MascotaFavViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_favmascotas,parent,false);
        return new MascotaFavViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaFavViewHolder holder, int position) {
        final Contacto mascota = mascotas.get(position);
        holder.TextNombreM.setText(mascota.getNombre());
        holder.ImgFotoM.setImageResource(mascota.getFoto());


    }

    @Override
    public int getItemCount(){
        return mascotas.size();

    }


    public class MascotaFavViewHolder extends RecyclerView.ViewHolder {


        private ImageView ImgFotoM;
        private TextView TextNombreM;



        public MascotaFavViewHolder(@NonNull View itemView) {
            super(itemView);
            ImgFotoM     = (ImageView) itemView.findViewById(R.id.ImgFotoM);
            TextNombreM  = (TextView) itemView.findViewById(R.id.TexTNombreM);


        }
    }
}
