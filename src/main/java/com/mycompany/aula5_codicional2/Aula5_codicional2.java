package com.mycompany.aula5_codicional2;
import javax.swing.JOptionPane;

public class Aula5_codicional2 {

    public static void main(String[] args) {

        int valor1, valor2;
        double total = 0;

        //JOptionPane.showMessageDialog(null, "Apresentação do menu");

        JOptionPane.showMessageDialog(null,
                "Apresentacao do Nosso cardápio:\n" +
                "100 - ARROZ (5,70)\n" +
                "101 - FEIJÃO (7,70)\n" +
                "102 - BATATA (3,40)\n" +
                "103 - LINGUIÇA (5,99)\n" +
                "104 - TORRESMO (10,00)\n" +
                "105 - BRAHMA (10,00)"
        );

        // PRIMEIRO ITEM
        valor1 = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o código do produto")
        );

        switch (valor1) {
            case 100:
                JOptionPane.showMessageDialog(null, "ARROZ - 5,70");
                total += 5.70;
                break;
            case 101:
                JOptionPane.showMessageDialog(null, "FEIJÃO - 7,70");
                total += 7.70;
                break;
            case 102:
                JOptionPane.showMessageDialog(null, "BATATA - 3,40");
                total += 3.40;
                break;
            case 103:
                JOptionPane.showMessageDialog(null, "LINGUIÇA - 5,99");
                total += 5.99;
                break;
            case 104:
                JOptionPane.showMessageDialog(null, "TORRESMO - 10,00");
                total += 10.00;
                break;
            case 105:
                JOptionPane.showMessageDialog(null, "BRAHMA - 10,00");
                total += 10.00;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Código inválido");
        }

        // SEGUNDO ITEM
        valor2 = Integer.parseInt(
                JOptionPane.showInputDialog("Digite outro código ou 0 para finalizar")
        );

        switch (valor2) {
            case 100:
                JOptionPane.showMessageDialog(null, "ARROZ - 5,70");
                total += 5.70;
                break;
            case 101:
                JOptionPane.showMessageDialog(null, "FEIJÃO - 7,70");
                total += 7.70;
                break;
            case 102:
                JOptionPane.showMessageDialog(null, "BATATA - 3,40");
                total += 3.40;
                break;
            case 103:
                JOptionPane.showMessageDialog(null, "LINGUIÇA - 5,99");
                total += 5.99;
                break;
            case 104:
                JOptionPane.showMessageDialog(null, "TORRESMO - 10,00");
                total += 10.00;
                break;
            case 105:
                JOptionPane.showMessageDialog(null, "BRAHMA - 10,00");
                total += 10.00;
                break;
            case 0:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Código inválido");
        }

        JOptionPane.showMessageDialog(null, "Total do pedido: R$ " + total);
    }
}