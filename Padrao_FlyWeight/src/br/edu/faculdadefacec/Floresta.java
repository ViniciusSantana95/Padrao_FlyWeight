package br.edu.faculdadefacec;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Floresta extends JFrame {

    private List<Arvore> arvores = new ArrayList<>();

    public void plantarArvore(int x, int y, String nome, Color cor, String dados){
        TipoDeArvore tipo = TipoDeArvoreFactory.obterTipoDeArvore(nome, cor, dados);
        Arvore arvore = new Arvore(x,y, tipo);
        this.arvores.add(arvore);
    }

    @Override
    public void paint(Graphics graficos) {
        for(Arvore arvore : this.arvores){
            arvore.desenhar(graficos);
        }
    }
}
