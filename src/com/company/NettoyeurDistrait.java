package com.company;

//A Faire pour prochaine fois -> Ex 7 du TD3
public class NettoyeurDistrait extends RobotNettoyeur {

    public NettoyeurDistrait(int posx, int posy, Monde monde) {
        super(posx, posy, monde);
    }

    public NettoyeurDistrait(Monde monde) {
        super(monde);
    }

    public void parcourir() {
        for(int i = 0; i<getMonde().getNbL(); i++){
            for(int y = getMonde().getNbC(); y != 0; y--){
                if(getMonde().estSale(i, y) && y%2 == 0){
                    vaEn(i, y);
                    nettoyer();
                }
            }
        }
    }
}
