package sio.pvz;

public class Plant{
    private String nom;
    private int health;
    private boolean alive = true;

    public Plant(String nom,int health, boolean alive) {
        this.nom = nom;
        this.health = health;
        this.alive = alive;
    }
    public String getNom() {
        return nom;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setNom(String n) {
        this.nom = n;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }


}

