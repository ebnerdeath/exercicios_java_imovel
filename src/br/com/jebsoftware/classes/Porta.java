/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jebsoftware.classes;

/**
 *
 * @author TitanNot
 */
public class Porta {
    private boolean aberta;
    private String cor;
    private float dimensaox;
    private float dimensaoy;
    private float dimensaoz;

    //CONSTRUTORES
    public Porta() {
    }

    public Porta(boolean aberta, String cor, float dimensaox, float dimensaoy, float dimensaoz) {
        this.aberta = aberta;
        this.cor = cor;
        this.dimensaox = dimensaox;
        this.dimensaoy = dimensaoy;
        this.dimensaoz = dimensaoz;
    }
    
    
    //MÉTODOS
    public void abre(){
        this.aberta = true;
    }
    
    public void fecha(){
        this.aberta = false;
    }
    
    public void pinta(String cor){
        this.cor = cor;
    }
    
    public boolean estaAberta(){
        return this.aberta;
    }
    
    //GETTERS E SETTERS
    /**
     * @return the aberta
     */
    public boolean isAberta() {
        return aberta;
    }

    /**
     * @param aberta the aberta to set
     */
    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the dimensaox
     */
    public float getDimensaox() {
        return dimensaox;
    }

    /**
     * @param dimensaox the dimensaox to set
     */
    public void setDimensaox(float dimensaox) {
        this.dimensaox = dimensaox;
    }

    /**
     * @return the dimensaoy
     */
    public float getDimensaoy() {
        return dimensaoy;
    }

    /**
     * @param dimensaoy the dimensaoy to set
     */
    public void setDimensaoy(float dimensaoy) {
        this.dimensaoy = dimensaoy;
    }

    /**
     * @return the dimensaoz
     */
    public float getDimensaoz() {
        return dimensaoz;
    }

    /**
     * @param dimensaoz the dimensaoz to set
     */
    public void setDimensaoz(float dimensaoz) {
        this.dimensaoz = dimensaoz;
    }
    
    
    
    
    
}
