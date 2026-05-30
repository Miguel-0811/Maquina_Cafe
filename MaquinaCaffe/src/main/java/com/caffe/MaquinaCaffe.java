package com.caffe;

import javax.swing.JOptionPane;

public class MaquinaCaffe {

    public static void main(String[] args) {

        Cafe cafe = new Cafe("tradicional", 1.00);

        int num = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Escolha de 1-6"));

        cafe.selecionar(num);
    }
}