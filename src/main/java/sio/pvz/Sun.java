package sio.pvz;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

public class Sun {
    private int sunCount;


    public Sun(int sunCount) {
        this.sunCount = sunCount;
    }

    public int getSunCount() {
        return sunCount;
    }

    public void setSunCount(int sunCount) {
        this.sunCount = sunCount;
    }

    public void addition(int nb) {
        this.sunCount = sunCount+nb;
    }

    public void acheter(int plante) {
            switch (plante) {
                case 1, 3:
                    if (sunCount >= 50) {
                        this.sunCount = sunCount - 50;
                        break;
                    }
                        break;
                case 2:
                    if (sunCount >= 100) {
                        this.sunCount = sunCount - 100;
                    }
                    break;
            }
            if (sunCount<=0){
                this.sunCount=0;
            }

    }

}

