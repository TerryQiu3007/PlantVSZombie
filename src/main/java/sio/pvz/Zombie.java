package sio.pvz;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Zombie {
    private ImageView imageView;
    private int health;
    private double x;
    private int row;
    private boolean alive = true;
    private boolean reachedEnd = false;

    public Zombie(int row) {
        this.row = row;
        this.health = 200;
        this.x = 800; // position initiale à droite
        this.imageView = new ImageView(new Image("/resources/images/Zombies/normal/zombie.gif"));
        this.imageView.setFitWidth(60);
        this.imageView.setFitHeight(60);
        this.imageView.setY(row * 80 + 20);
        this.imageView.setX(x);
    }

    public void update() {
        x -= 0.3;
        imageView.setX(x);

        if (x < 50) {
            reachedEnd = true;
            alive = false;
        }
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            die();
        }
    }

    public void die() {
        this.alive = false;
        this.imageView.setImage(new Image("/resources/images/Zombies/z_mort.gif"));
        // ajouter une animation de mort puis supprimer l'image
    }

    public boolean isAlive() {
        return alive;
    }

    public boolean hasReachedEnd() {
        return reachedEnd;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public int getRow() {
        return row;
    }
}
