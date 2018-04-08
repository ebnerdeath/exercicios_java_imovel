/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jebsoftware.classes;

import java.util.ArrayList;

/**
 *
 * @author TitanNot
 */
public abstract class Imovel {
    public String cor;
    private final ArrayList<Porta> lista_de_portas = new ArrayList<>();
    
    public void pinta(String cor){
        this.cor = cor;
    };
    
    //MÉTODOS
    public int quantasPortasEstaoAbertas(){
        int contador = 0;
        for(int i=0;i<this.lista_de_portas.size();i++){
            if(lista_de_portas.get(i).estaAberta() == true){
                contador ++;
            }
        }
        return contador;
    }

    public void setPorta(Porta porta) {
        if(porta != null){
            this.lista_de_portas.add(porta);
        }
    }
    
    public int totalDePortas(){
        return this.lista_de_portas.size();   
    }
    
    
}
