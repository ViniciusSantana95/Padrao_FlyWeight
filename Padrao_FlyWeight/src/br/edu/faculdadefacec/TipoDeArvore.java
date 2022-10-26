package br.edu.faculdadefacec;

import java.awt.*;

public class TipoDeArvore {
    private String nome;
    private Color cor;
    private String dados;

    public TipoDeArvore(String nome, Color cor, String dados) {
        this.nome = nome;
        this.cor = cor;
        this.dados = dados;
    }

    public void desenhar(Graphics graficos, int x, int y){
        graficos.setColor(Color.BLACK);
        graficos.fillRect(x-1,y,3,5);
        graficos.setColor(this.cor);
        graficos.fillOval(x-5,y-10,10,10);
    }
}
