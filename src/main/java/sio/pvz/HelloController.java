package sio.pvz;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;


import java.net.URL;
import java.security.cert.PolicyNode;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.Timer;

public class HelloController implements Initializable {


    @FXML
    public AnchorPane idAccueil;
    @FXML
    public AnchorPane idLevel;
    @FXML
    public AnchorPane idTerrain;
    @FXML
    public AnchorPane idMenu;
    @FXML
    public AnchorPane idlevel1;
    @FXML
    public Label idSunCount;
    public ImageView idSunflower;
    @FXML
    public ImageView idSun;
    @FXML
    public ImageView cadre1;
    @FXML
    public ImageView cadre2;
    @FXML
    public ImageView cadre3;
    @FXML
    public ImageView idClose;
    @FXML
    public ImageView cadre5;
    @FXML
    public ImageView cadre4;
    @FXML
    public ImageView cadre6;
    @FXML
    public ImageView cadre7;
    @FXML
    public ImageView cadre8;
    @FXML
    public ImageView cadre9;
    @FXML
    public ImageView sunflower1;
    @FXML
    public ImageView peashooter1;
    @FXML
    public ImageView wallnut1;
    @FXML
    public ImageView sunflower2;
    @FXML
    public ImageView sunflower3;
    @FXML
    public ImageView sunflower4;
    @FXML
    public ImageView sunflower5;
    @FXML
    public ImageView sunflower6;
    @FXML
    public ImageView sunflower7;
    @FXML
    public ImageView sunflower8;
    @FXML
    public ImageView sunflower9;
    @FXML
    public ImageView peashooter2;
    @FXML
    public ImageView peashooter9;
    @FXML
    public ImageView peashooter6;
    @FXML
    public ImageView peashooter5;
    @FXML
    public ImageView peashooter4;
    @FXML
    public ImageView peashooter3;
    @FXML
    public ImageView peashooter8;
    @FXML
    public ImageView peashooter7;
    @FXML
    public ImageView wallnut2;
    @FXML
    public ImageView wallnut3;
    @FXML
    public ImageView wallnut4;
    @FXML
    public ImageView wallnut5;
    @FXML
    public ImageView wallnut6;
    @FXML
    public ImageView wallnut7;
    @FXML
    public ImageView wallnut8;
    @FXML
    public ImageView wallnut9;

    int numero =0;
    Plant p;
    ArrayList<Plant> pt = new ArrayList<>();
    Sun s;
    Zombie z;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        idAccueil.setVisible(true);
        idLevel.setVisible(false);
        idlevel1.setVisible(false);
        idMenu.setVisible(false);
        idTerrain.setVisible(false);
        affcadre(false);
        affPlante(false);
    }
    @FXML
    public void clickStart(MouseEvent mouseEvent) {
        idAccueil.setVisible(false);
        idLevel.setVisible(true);
        idlevel1.setVisible(true);
    }


    @FXML
    public void clickRetourAccueil(MouseEvent mouseEvent) {
        idAccueil.setVisible(true);
        idLevel.setVisible(false);
        idlevel1.setVisible(false);
    }

    @FXML
    public void click1(MouseEvent mouseEvent) {
        idLevel.setVisible(false);
        idlevel1.setVisible(false);
        idMenu.setVisible(true);
        idTerrain.setVisible(true);
        startGame(1);
    }

    @FXML
    public void clickRetourLevel(MouseEvent mouseEvent) {
        idLevel.setVisible(true);
        idlevel1.setVisible(true);
        idMenu.setVisible(false);
        idTerrain.setVisible(false);
    }
    public void startGame(int level) {
        s = new Sun(300);
        idSunCount.setText(String.valueOf(s.getSunCount()));
        z = new Zombie(3);
        z.update();
        p = new Plant("Sunflower",100,true);

    }

    @FXML
    public void clickSun(MouseEvent mouseEvent) throws InterruptedException {
        s.addition(25);
        idSunCount.setText(String.valueOf(s.getSunCount()));
    }


    @FXML
    public void clickSunflower(MouseEvent mouseEvent) {
        affcadre(true);
        selectPlante(1);
    }

    @FXML
    public void clickWallnut(MouseEvent mouseEvent) {
        affcadre(true);
        selectPlante(3);
    }

    @FXML
    public void clickPeashooter(MouseEvent mouseEvent) {
        affcadre(true);
        selectPlante(2);
    }

    public void affcadre(boolean c){
        idClose.setVisible(c);
        cadre1.setVisible(c);
        cadre2.setVisible(c);
        cadre3.setVisible(c);
        cadre4.setVisible(c);
        cadre5.setVisible(c);
        cadre6.setVisible(c);
        cadre7.setVisible(c);
        cadre8.setVisible(c);
        cadre9.setVisible(c);
    }
    public void affPlante(boolean n){
        peashooter1.setVisible(n);
        peashooter2.setVisible(n);
        peashooter3.setVisible(n);
        peashooter4.setVisible(n);
        peashooter5.setVisible(n);
        peashooter6.setVisible(n);
        peashooter7.setVisible(n);
        peashooter8.setVisible(n);
        peashooter9.setVisible(n);
        sunflower1.setVisible(n);
        sunflower2.setVisible(n);
        sunflower3.setVisible(n);
        sunflower4.setVisible(n);
        sunflower5.setVisible(n);
        sunflower6.setVisible(n);
        sunflower7.setVisible(n);
        sunflower8.setVisible(n);
        sunflower9.setVisible(n);
        wallnut1.setVisible(n);
        wallnut2.setVisible(n);
        wallnut3.setVisible(n);
        wallnut4.setVisible(n);
        wallnut5.setVisible(n);
        wallnut6.setVisible(n);
        wallnut7.setVisible(n);
        wallnut8.setVisible(n);
        wallnut9.setVisible(n);
    }

    @FXML
    public void clickClose(MouseEvent mouseEvent) {
        affcadre(false);
    }
    public void selectPlante(int slt){
        switch (slt){
            case 1:
                numero =1;
                break;
            case 2:
                numero =2;
                break;
            case 3:
                numero =3;
                break;
        }
    }

    @FXML
    public void clickCadre1(MouseEvent mouseEvent) {
        if(numero==1){
            sunflower1.setVisible(true);
            p = new Plant("Sunflower",100,true);
            pt.add(p);
            affcadre(false);
            s.acheter(1);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
        if(numero==2){
            peashooter1.setVisible(true);
            p = new Plant("Peashooter",100,true);
            pt.add(p);
            affcadre(false);
            s.acheter(2);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
        if(numero==3){
            wallnut1.setVisible(true);
            p = new Plant("Wallnut",1800,true);
            pt.add(p);
            affcadre(false);
            s.acheter(3);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
    }

    @FXML
    public void clickCadre2(MouseEvent mouseEvent) {
        if(numero==1){
            sunflower2.setVisible(true);
            p = new Plant("Sunflower",100,true);
            pt.add(p);
            affcadre(false);
            s.acheter(1);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
        if(numero==2){
            peashooter2.setVisible(true);
            p = new Plant("Peashooter",100,true);
            pt.add(p);
            affcadre(false);
            s.acheter(2);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
        if(numero==3){
            wallnut2.setVisible(true);
            p = new Plant("Wallnut",1800,true);
            pt.add(p);
            affcadre(false);
            s.acheter(3);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
    }

    @FXML
    public void clickCadre3(MouseEvent mouseEvent) {
        if(numero==1){
            sunflower3.setVisible(true);
            p = new Plant("Sunflower",100,true);
            pt.add(p);
            affcadre(false);
            s.acheter(1);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
        if(numero==2){
            peashooter3.setVisible(true);
            p = new Plant("Peashooter",100,true);
            pt.add(p);
            affcadre(false);
            s.acheter(2);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
        if(numero==3){
            wallnut3.setVisible(true);
            p = new Plant("Wallnut",1800,true);
            pt.add(p);
            affcadre(false);
            s.acheter(3);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
    }

    @FXML
    public void clickCadre4(MouseEvent mouseEvent) {
        if(numero==1){
            sunflower4.setVisible(true);
            p = new Plant("Sunflower",100,true);
            pt.add(p);
            affcadre(false);
            s.acheter(1);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
        if(numero==2){
            peashooter4.setVisible(true);
            p = new Plant("Peashooter",100,true);
            pt.add(p);
            affcadre(false);
            s.acheter(2);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
        if(numero==3){
            wallnut4.setVisible(true);
            p = new Plant("Wallnut",1800,true);
            pt.add(p);
            affcadre(false);
            s.acheter(3);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
    }

    @FXML
    public void clickCadre5(MouseEvent mouseEvent) {
        if(numero==1){
            sunflower5.setVisible(true);
            p = new Plant("Sunflower",100,true);
            pt.add(p);
            affcadre(false);
            s.acheter(1);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
        if(numero==2){
            peashooter5.setVisible(true);
            p = new Plant("Peashooter",100,true);
            pt.add(p);
            affcadre(false);
            s.acheter(2);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
        if(numero==3){
            wallnut5.setVisible(true);
            p = new Plant("Wallnut",1800,true);
            pt.add(p);
            affcadre(false);
            s.acheter(3);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
    }

    @FXML
    public void clickCadre6(MouseEvent mouseEvent) {
        if(numero==1){
            sunflower6.setVisible(true);
            p = new Plant("Sunflower",100,true);
            pt.add(p);
            affcadre(false);
            s.acheter(1);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
        if(numero==2){
            peashooter6.setVisible(true);
            p = new Plant("Peashooter",100,true);
            pt.add(p);
            affcadre(false);
            s.acheter(2);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
        if(numero==3){
            wallnut6.setVisible(true);
            p = new Plant("Wallnut",1800,true);
            pt.add(p);
            affcadre(false);
            s.acheter(3);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
    }

    @FXML
    public void clickCadre7(MouseEvent mouseEvent) {
        if(numero==1){
            sunflower7.setVisible(true);
            p = new Plant("Sunflower",100,true);
            pt.add(p);
            affcadre(false);
            s.acheter(1);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
        if(numero==2){
            peashooter7.setVisible(true);
            p = new Plant("Peashooter",100,true);
            pt.add(p);
            affcadre(false);
            s.acheter(2);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
        if(numero==3){
            wallnut7.setVisible(true);
            p = new Plant("Wallnut",1800,true);
            pt.add(p);
            affcadre(false);
            s.acheter(3);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
    }

    @FXML
    public void clickCadre8(MouseEvent mouseEvent) {
        if(numero==1){
            sunflower8.setVisible(true);
            p = new Plant("Sunflower",100,true);
            pt.add(p);
            affcadre(false);
            s.acheter(1);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
        if(numero==2){
            peashooter8.setVisible(true);
            p = new Plant("Peashooter",100,true);
            pt.add(p);
            affcadre(false);
            s.acheter(2);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
        if(numero==3){
            wallnut8.setVisible(true);
            p = new Plant("Wallnut",1800,true);
            pt.add(p);
            affcadre(false);
            s.acheter(3);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
    }

    @FXML
    public void clickCadre9(MouseEvent mouseEvent) {
        if(numero==1){
            sunflower9.setVisible(true);
            p = new Plant("Sunflower",100,true);
            pt.add(p);
            affcadre(false);
            s.acheter(1);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
        if(numero==2){
            peashooter9.setVisible(true);
            p = new Plant("Peashooter",100,true);
            pt.add(p);
            affcadre(false);
            s.acheter(2);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
        if(numero==3){
            wallnut9.setVisible(true);
            p = new Plant("Wallnut",1800,true);
            pt.add(p);
            affcadre(false);
            s.acheter(3);
            idSunCount.setText(String.valueOf(s.getSunCount()));
        }
    }
}

