package com.company;

public class TestRobot {
    public static void main(String[] args) {
        Monde monde = new Monde();
        PollueurToutDroit pollueurToutDroit = new PollueurToutDroit(9, 3, 4, monde);
        pollueurToutDroit.parcourir();

        monde.metPapierGras(1, 2);
        monde.metPapierGras(1, 3);

        System.out.println(monde);
    }
}
