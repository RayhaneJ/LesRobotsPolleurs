package com.company;

public abstract class Robot {
    private int posx, posy;
    private Monde monde;

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public Monde getMonde() {
        return monde;
    }

    public Robot(int posx, int posy, Monde monde){
        this.posx = posx;
        this.posy = posy;
        this.monde = monde;
    }

    public Robot(Monde monde){
        this((int)(Math.random() * monde.getNbL()), (int)(Math.random() * monde.getNbC()), monde);
    }

    public void vaEn(int x, int y){
        posx = x;
        posy = y;
    }

    public abstract void parcourir();
}
