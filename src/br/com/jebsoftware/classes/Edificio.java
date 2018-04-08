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
public class Edificio extends Imovel{
    private int totalDePortas;
    private int totalDeAndares;

    
    public void adicionarAndar(){
        this.totalDeAndares++;
    }
    
    public int totalDeAndares(){
        return this.totalDeAndares;
    }
    
    
}
