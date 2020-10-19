package com.company;

//A faire pour prochaine fois Ex 6 du TD3
public class RobotNettoyeur extends Robot {

    public RobotNettoyeur(int posx, int posy, Monde monde) {
        super(posx, posy, monde);
    }

    public RobotNettoyeur(Monde monde){
        super(monde);
    }

    public void nettoyer(){
        getMonde().prendPapierGras(getPosx(), getPosy());
    }

    public void parcourir() {
        for(int i = 0; i<getMonde().getNbL(); i++){
            for(int y = getMonde().getNbC(); y != 0; y--){
                if(getMonde().estSale(i, y)){
                    vaEn(i, y);
                    nettoyer();
                }
            }
        }
    }
}
