package Vision;

import Model.Parede;

import javax.swing.*;

public class pintura {
    public static void main(String[] args) {
        Parede theWall = new Parede();

        theWall.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digite a altura da parede em metros")));
        theWall.setLargura(Float.parseFloat(JOptionPane.showInputDialog("Digite a largura da parede em metros")));

        System.out.println(theWall.getAltura());
        System.out.println(theWall.getLargura());

        float area = theWall.calcularArea(theWall.getLargura(), theWall.getAltura());

        System.out.println(area);

        theWall.tinta(area);


    }
}
