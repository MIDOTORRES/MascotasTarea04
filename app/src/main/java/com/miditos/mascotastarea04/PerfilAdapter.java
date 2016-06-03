package com.miditos.mascotastarea04;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by MIDITOS on 02/06/16.
 */
public class PerfilAdapter extends RecyclerView.Adapter<PerfilAdapter.PetsViewHolder> {
        private List<MascotaPerfil> mascotaCard;

        public static class PetsViewHolder extends RecyclerView.ViewHolder {

            public ImageView ivPerfil;
            public TextView likesText3;
            public ImageView yellow_bone2;


            public PetsViewHolder(View v) {
                super(v);
                ivPerfil = (ImageView) v.findViewById(R.id.ivPerfil);
                likesText3 = (TextView) v.findViewById(R.id.likesText3);
                yellow_bone2 = (ImageView) v.findViewById(R.id.yellow_bone2);

            }
        }

        public PerfilAdapter(List<MascotaPerfil> mascotaCard) {
            this.mascotaCard = mascotaCard;
        }

        @Override
        public int getItemCount() {
            return mascotaCard.size();
        }

        @Override
        public PetsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View v = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.mascota_layout3, viewGroup, false);
            return new PetsViewHolder(v);
        }

        @Override
        public void onBindViewHolder(final PetsViewHolder viewHolder, int i) {
            viewHolder.ivPerfil.setImageResource(mascotaCard.get(i).getMascotasId());
            viewHolder.likesText3.setText(String.valueOf(mascotaCard.get(i).getMascotasLike()));
            viewHolder.yellow_bone2.setTag(viewHolder);

            viewHolder.yellow_bone2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    PetsViewHolder likeAmount = (PetsViewHolder) v.getTag();
                    likeAmount.likesText3.setText(String.valueOf(1 + Integer.parseInt(likeAmount.likesText3.getText().toString())));

                }
            });
        }
    }