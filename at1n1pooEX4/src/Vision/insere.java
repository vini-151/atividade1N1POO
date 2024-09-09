package Vision;

import Model.numeros;

import javax.swing.*;

public class insere {
    public static void main(String[] args) {
        numeros num = new numeros();
        num.setNum1(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o n1:")));
        num.setNum2(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o n2:")));
        num.setNum3(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o n3:")));

        num.comp(num.getNum1(), num.getNum2(), num.getNum3());
    }
}
