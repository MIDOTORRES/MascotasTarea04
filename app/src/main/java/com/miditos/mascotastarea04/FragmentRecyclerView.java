package com.miditos.mascotastarea04;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentRecyclerView extends Fragment {
    private RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Mascota> mascotas;

    public FragmentRecyclerView() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_recycler_view, container, false);


        // Obtener el Recycler
        recyclerView = (RecyclerView) v.findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);

        // Usar un administrador para LinearLayout
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        inicializaDatos();

        // Crear un nuevo adaptador
        adapter = new RecyclerAdapter(mascotas);
        recyclerView.setAdapter(adapter);

        return v;
    }


    public void inicializaDatos() {
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.mascota1, "Mascota 1"));
        mascotas.add(new Mascota(R.drawable.mascota2, "Mascota 2"));
        mascotas.add(new Mascota(R.drawable.mascota3, "Mascota 3"));
        mascotas.add(new Mascota(R.drawable.mascota4, "Mascota 4"));
        mascotas.add(new Mascota(R.drawable.mascota5, "Mascota 5"));
        mascotas.add(new Mascota(R.drawable.mascota6, "Mascota 6"));
        mascotas.add(new Mascota(R.drawable.mascota7, "Mascota 7"));
        mascotas.add(new Mascota(R.drawable.mascota8, "Mascota 8"));
        mascotas.add(new Mascota(R.drawable.mascota9, "Mascota 9"));
    }


}
