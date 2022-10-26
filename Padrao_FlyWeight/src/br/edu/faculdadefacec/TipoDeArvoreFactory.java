package br.edu.faculdadefacec;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TipoDeArvoreFactory {

    private static Map<String, TipoDeArvore > tipos = new HashMap<String, TipoDeArvore>();

    public static  TipoDeArvore obterTipoDeArvore(String nome, Color cor, String dados){
        TipoDeArvore tipo = tipos.get(nome);
        if(tipo != null){
            return tipo;
        }
        tipo = new TipoDeArvore(nome, cor, dados);
        tipos.put(nome, tipo);

        return tipo;
    }

}


