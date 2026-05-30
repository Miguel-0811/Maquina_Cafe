package com.caffe;

import javax.swing.JOptionPane;

public class Cafe extends Drink {

    public Cafe(String sabor, double valor) {
        super(sabor, valor);
    }

    public void selecionar(int numero) {

        double[] lista = new double[6];
        lista[0] = 1.30;
        lista[1] = 1.80;

        switch (numero) {
            case 1:
                JOptionPane.showMessageDialog(null, "Café puro");
                this.setValor(lista[0]);
                JOptionPane.showMessageDialog(
                        null, "Valor: R$" + this.getValor());
                qtdCafe(1);
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Café com leite");
                this.setValor(lista[1]);
                JOptionPane.showMessageDialog(
                        null, "Valor: R$" + this.getValor());
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Café Latte");
                this.setValor(2.40);
                JOptionPane.showMessageDialog(
                        null, "Valor: R$" + this.getValor());
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "Capuccino");
                this.setValor(2.30);
                JOptionPane.showMessageDialog(
                        null, "Valor: R$" + this.getValor());
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "Café com chocolate");
                this.setValor(2.70);
                JOptionPane.showMessageDialog(
                        null, "Valor: R$" + this.getValor());
                break;

            case 6:
                JOptionPane.showMessageDialog(null, "Café Java");
                this.setValor(8.40);
                JOptionPane.showMessageDialog(
                        null, "Valor: R$" + this.getValor());
                break;

            default:
                JOptionPane.showMessageDialog(
                        null, "Nenhuma das opções");
        }
    }

    public int qtdCafe(int num) {
        // estoque de doses de café
        int toq = 10 - num;

        if (toq > 0 && toq < 11) {
            JOptionPane.showMessageDialog(null, "Preparando!");
            return 1;
        } else {
            JOptionPane.showMessageDialog(null, "Sem café!");
            return 0;
        }
    }
}