package com.example.examsemana9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

import com.example.examsemana9.Adapter.Anime;
import com.example.examsemana9.Adapter.AnimeAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewAnime;
    AnimeAdapter animeAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarElementos();
    }

    private void inicializarElementos() {
        recyclerViewAnime = findViewById(R.id.recyclerAnim);
        recyclerViewAnime.setLayoutManager(new LinearLayoutManager(this));
        List<Anime> animes = new ArrayList<>();

        animes.add(new Anime(1,"Naruto","La historia de un pequeño que tiene un camino ninja","https://i.pinimg.com/736x/5f/60/34/5f60349f6b0980548907a7a81a8f3aed.jpg"));
        animes.add(new Anime(1,"Dragon Ball","Goku es un sayayin enviado a la tierra después de la destrucción de su planeta","data:image/png;base64,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"));
        animeAdapter = new AnimeAdapter(animes,this);
        recyclerViewAnime.setAdapter(animeAdapter);
    }


}