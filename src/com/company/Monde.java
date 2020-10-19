package com.company;

public class Monde {
    private int nbL = 10;
    private int nbC = 10;
    private boolean matrice[][];

    public int getNbL() {
        return nbL;
    }
    public int getNbC(){
        return nbC;
    }

    public Monde(int nbL, int nbC){
        this.nbL = nbL;
        this.nbC = nbC;
        matrice = new boolean[nbL][nbC];
        for(int i = 0; i<nbL; i++){
            for(int y = 0; y<nbC; y++){
                matrice[i][y] = false;
            }
        }
    }

    public Monde(){
        this(Config.nbL, Config.nbC);
    }


    public String toString(){
        String s="";
        for(int i = 0; i<nbL; i++){
            for(int j = 0; j< nbL; j++){
                if(matrice[i][j]){
                    s = s + "o";
                }
                else{
                    s = s + ".";
                }
            }
            s = s + "\n";
        }
        return s;
    }

    public void metPapierGras(int i, int j){
        matrice[i][j]=true;
    }

    public void prendPapierGras(int i, int j){
        matrice[i][j] = false;
    }

    public boolean estSale(int i, int j){
        return matrice[i][j];
    }

    public int nbPapierGras(){
        int compteur = 0;
        for(int i = 0; i<nbL; i++){
            for(int y = 0; y<nbC; y++){
                if(matrice[i][y]){
                    compteur++;
                }
            }
        }
        return compteur;
    }
}
