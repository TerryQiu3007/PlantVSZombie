package sio.pvz;

public class Sun {
    private int sunCount;
    private static int SUN=25;

    public Sun(int sunCount) {
        this.sunCount = sunCount;
    }

    public int getSunCount() {
        return sunCount;
    }

    public void setSunCount(int sunCount) {
        this.sunCount = sunCount;
    }

    public void addition() {
        this.sunCount += SUN;
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

