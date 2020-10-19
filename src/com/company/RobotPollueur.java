package com.company;

public abstract class RobotPollueur extends Robot{
    public RobotPollueur(int posx, int posy, Monde monde) {
        super(posx, posy, monde);
    }

    public RobotPollueur(Monde monde){
        super(monde);
    }

    public void polluer(){
        getMonde().metPapierGras(getPosx(), getPosy());
    }
}
