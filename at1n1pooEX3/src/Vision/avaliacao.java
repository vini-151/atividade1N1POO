package Vision;

import Model.Boletim;

import javax.swing.*;

public class avaliacao {
    public static void main(String[] args) {
        Boletim Vini = new Boletim();

        Vini.setNotaUm(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: ")));
        Vini.setNotaDois(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: ")));
        Vini.setNotaTres(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3: ")));
        Vini.setNotaQuatro(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 4: ")));

        Vini.calculaMedia(Vini.getNotaUm(), Vini.getNotaDois(), Vini.getNotaTres(), Vini.getNotaQuatro());

    }
}
