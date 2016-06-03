package com.miditos.mascotastarea04;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by MIDITOS on 30/05/16.
 */
public class MascotaPerfil {

    public int ivPerfil;
    public TextView likesText3;
    public ImageView yellow_bone2;
        private int mascotasId;
        private int mascotasLike;

        public MascotaPerfil(int mascotasId, int mascotasLike) {
            this.mascotasId = mascotasId;
            this.mascotasLike = mascotasLike;
        }

        public int getMascotasId() {
            return mascotasId;
        }

        public void setMascotasId(int mascotasId) {
            this.mascotasId = mascotasId;
        }

        public int getMascotasLike() {
            return mascotasLike;
        }

        public void setMascotasLike(int mascotasLike) {
            this.mascotasLike = mascotasLike;
        }

}
