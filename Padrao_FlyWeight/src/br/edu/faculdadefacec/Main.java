package br.edu.faculdadefacec;

import java.awt.*;

public class Main {
    private static int TAMANHO = 500;
    private static int QUANTIDADE = 1000000;
    private static int TIPO = 2;

    public static void main(String[] args) {

        Floresta floresta = new Floresta();

        for(int i = 0; i< Math.floor(QUANTIDADE / TIPO); i++){
            floresta.plantarArvore(random(0, TAMANHO), random(0, TAMANHO), "verão", Color.GREEN, "cerejera");

            floresta.plantarArvore(random(0, TAMANHO), random(0, TAMANHO), "outono", Color.ORANGE, "carvalho");
        }

        floresta.setSize(TAMANHO, TAMANHO);
        floresta.setVisible(true);

    }

    private static int random(int min, int max){
        return min + (int) (Math.random() * (max - min) +1);
    }
}