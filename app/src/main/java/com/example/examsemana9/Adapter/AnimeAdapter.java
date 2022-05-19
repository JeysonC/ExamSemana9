package com.example.examsemana9.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.examsemana9.R;
import com.squareup.picasso.Picasso;

import java.util.List;


public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.viewHolder>{

    private List<Anime> animeList;
    private Context context;

    public AnimeAdapter(List<Anime> animeList, Context context) {
        this.animeList = animeList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_peliculas,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.txtNombre.setText(animeList.get(position).getNombre());
        holder.txtDescripcion.setText(animeList.get(position).getDescripción());
        Picasso.get().load(animeList.get(position).getFoto())
                        .centerCrop()
                        .into(holder.imgAnime);
    }

    @Override
    public int getItemCount() {
        return animeList.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{

        private ImageView imgAnime;
        private TextView txtNombre;
        private TextView txtDescripcion;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imgAnime = itemView.findViewById(R.id.img_anime);
            txtNombre = itemView.findViewById(R.id.nombre);
            txtDescripcion = itemView.findViewById(R.id.descripcion);
        }
    }
}
