package com.miditos.mascotastarea04;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Perfil extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.LayoutManager _layoutManager;

    public Perfil(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_perfil, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recView2);


        _layoutManager = new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(_layoutManager);

        List<MascotaPerfil> mascotas = new ArrayList<>();

        mascotas.add(new MascotaPerfil(R.drawable.mascota1, 3));
        mascotas.add(new MascotaPerfil(R.drawable.mascota1, 4));
        mascotas.add(new MascotaPerfil(R.drawable.mascota1, 6));
        mascotas.add(new MascotaPerfil(R.drawable.mascota1, 9));
        mascotas.add(new MascotaPerfil(R.drawable.mascota1, 12));
        mascotas.add(new MascotaPerfil(R.drawable.mascota1, 13));
        mascotas.add(new MascotaPerfil(R.drawable.mascota1, 0));
        mascotas.add(new MascotaPerfil(R.drawable.mascota1, 4));
        mascotas.add(new MascotaPerfil(R.drawable.mascota1, 7));
        mascotas.add(new MascotaPerfil(R.drawable.mascota1, 9));
        mascotas.add(new MascotaPerfil(R.drawable.mascota1, 6));
        mascotas.add(new MascotaPerfil(R.drawable.mascota1, 1));

        recyclerAdapter = new PerfilAdapter(mascotas);
        recyclerView.setAdapter(recyclerAdapter);
        return view;
    }

}
