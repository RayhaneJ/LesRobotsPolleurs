package com.company;

public class PollueurToutDroit extends RobotPollueur {
    private int colDepart;

    public PollueurToutDroit(int colDepart, int posx, int posy, Monde monde){
        super(posx, posy, monde);
        this.colDepart = colDepart;
    }

    public PollueurToutDroit(int colDepart, Monde monde){
        super(monde);
        this.colDepart = colDepart;
    }

    public void parcourir() {
        for(int i = 0; i < getMonde().getNbL(); i++){
            vaEn(i, colDepart);
            polluer();
        }
    }
}
