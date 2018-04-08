/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jebsoftware.main;

import br.com.jebsoftware.classes.Casa;
import br.com.jebsoftware.classes.Edificio;
import br.com.jebsoftware.classes.Porta;

/**
 *
 * @author TitanNot
 */

//Exercícios de Java
/*
De forma incremental, traduza o	seguinte conjunto de classes em	um programa	
Java. Importante:
Não são	permitidas chamadas a System.in, System.out ou similares	
de dentro das classes criadas.	

a) Classe: Porta	
Atributos: aberta, cor,	dimensaoX, dimensaoY, dimensaoZ	
Métodos:	void	abre(),	void	fecha(),	void	pinta(String	s),	boolean	estaAberta()	
Para	 testar,	 crie	 uma	 porta,	 abra	 e	 feche	 a	 mesma,	 pinte‐a	 de	 diversas	 cores,	
altere	 suas	 dimensões	 e	 use	 o	 método	 estaAberta	 para	 verificar	 se	 ela	 está	
aberta.	

b) Classe:	Casa	
Atributos:	cor,	porta1,	porta2,	porta3	
Método:	 void	 pinta(String	 s),	 int	 quantasPortasEstaoAbertas(),	 int	
totalDePortas()	
Para	testar,	crie	uma	casa	e	pinte‐a.	Crie	três	portas	e	coloque‐as	na	casa;	abra	e	
feche	 as	 mesmas	 como	 desejar.	 Utilize	 o	 método	 quantasPortasEstaoAbertas	
para	imprimir	o	número	de	portas	abertas.	

c) Classe:	Edificio	
Atributos:	cor,	totalDePortas,	totalDeAndares,	portas[]	
Métodos:	 void	 pinta(String	 s),	 int	 quantasPortasEstaoAbertas(),	 void	
adicionaPorta(Porta	 p),	 int	 totalDePortas(),	 void	 adicionarAndar(),	 int	
totalDeAndares()	
Para	 testar,	 crie	 um	 edifício,	 pinte‐o.	 Crie	 seis	 portas	 e	 coloque‐as	 no	 edifício	
através	do	método	adicionaPorta,	abra	e	feche‐as	como	desejar.	Utilize	o	método	
quantasPortasEstaoAbertas	 para	 imprimir	 o	 número	 de	 portas	 abertas	 e	 o	
método	 totalDePortas	 para	 imprimir	 o	 total	 de	 portas	 em	 seu	 edifício.	 Cria	
alguns	andares	utilizado	o	método	adicionarAndar	e	retorne	o	número	 total	de	
andares	utilizando	o	método	totalDeAndares.	

d) As	 classes	 Casa	 e	 edifício	 ficaram	 muito	 parecidas.	 Crie	 a	 classe	 Imovel	 e	
coloque	nela	tudo	o	Casa	e	Edificio	tem	em	comum.	Faça	Imovel	superclasse	de	
Casa	 e	 Edificio.	 Note	 que	 alguns	 métodos	 em	 comum	 não	 poderão	 ser	
implementados	 por	 Imovel	 (e.g.,	 quantasPortasEstaoAbertas	 e	 totalDePortas).	
Logo,	essesdeverão	ser	declarados	como	métodos	abstratos.	
*/
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TESTE EXERCÍCIO A
        /*Porta porta = new Porta();
        porta.setAberta(false);
        porta.setCor("Marron");
        porta.setDimensaox(20);
        porta.setDimensaoy(30);
        porta.setDimensaoz(40);
        
        System.out.println("Dados da porta :");
        System.out.println("Está Aberta? : "+porta.estaAberta());
        System.out.println("Cor: "+porta.getCor());
        System.out.println("Dimensão x   : "+porta.getDimensaox());
        System.out.println("Dimensão y   : "+porta.getDimensaoy());
        System.out.println("Dimensão z   : "+porta.getDimensaox());
        
        porta.abre();
        porta.pinta("Vermelho");
        porta.setDimensaox(90);
        porta.setDimensaoy(44);
        porta.setDimensaoz(46);
        
        System.out.println("\n\n\nDados da porta depois das modificações:");
        System.out.println("Está Aberta? : "+porta.estaAberta());
        System.out.println("Cor: "+porta.getCor());
        System.out.println("Dimensão x   : "+porta.getDimensaox());
        System.out.println("Dimensão y   : "+porta.getDimensaoy());
        System.out.println("Dimensão z   : "+porta.getDimensaox());
        */
        
        //TESTE EXERCÍCIO B
        /*Casa casa = new Casa();
        casa.pinta("Amarelo");
        
        Porta porta1 = new Porta();
        porta1.setAberta(false);
        porta1.setCor("Marrom");
        porta1.setDimensaox(10);
        porta1.setDimensaoy(15);
        porta1.setDimensaoz(20);
        
        casa.setPorta(porta1);
        
        Porta porta2 = new Porta();
        porta2.setAberta(true);
        porta2.setCor("Azul");
        porta2.setDimensaox(40);
        porta2.setDimensaoy(50);
        porta2.setDimensaoz(50);
        
        casa.setPorta(porta2);
        
        Porta porta3 = new Porta();
        porta3.setAberta(false);
        porta3.setCor("Cinza");
        porta3.setDimensaox(59);
        porta3.setDimensaoy(77);
        porta3.setDimensaoz(70);
        
        casa.setPorta(porta3);
        
        Porta porta4 = new Porta();
        porta4.setAberta(true);
        porta4.setCor("Branco");
        porta4.setDimensaox(80);
        porta4.setDimensaoy(75);
        porta4.setDimensaoz(86);
        
        casa.setPorta(porta4);
        
        System.out.println("Números de portas existentes na casa: "+casa.totalDePortas());
        System.out.println("Número de portas abertas na casa: "+casa.quantasPortasEstaoAbertas());
        */
        
        //TESTE EXERCÍCIO C
        /*Edificio edificio = new Edificio();
        edificio.pinta("Cinza");
        
        Porta porta1 = new Porta();
        porta1.setAberta(false);
        porta1.setCor("Marrom");
        porta1.setDimensaox(10);
        porta1.setDimensaoy(15);
        porta1.setDimensaoz(20);
        
        edificio.setPorta(porta1);
        
        Porta porta2 = new Porta();
        porta2.setAberta(false);
        porta2.setCor("Branco");
        porta2.setDimensaox(10);
        porta2.setDimensaoy(15);
        porta2.setDimensaoz(20);
        
        edificio.setPorta(porta2);
        
        Porta porta3 = new Porta();
        porta3.setAberta(true);
        porta3.setCor("Cinza");
        porta3.setDimensaox(10);
        porta3.setDimensaoy(15);
        porta3.setDimensaoz(20);
        
        edificio.setPorta(porta3);
        
        Porta porta4 = new Porta();
        porta4.setAberta(false);
        porta4.setCor("Vermelho");
        porta4.setDimensaox(10);
        porta4.setDimensaoy(15);
        porta4.setDimensaoz(20);
        
        edificio.setPorta(porta4);
        
        Porta porta5 = new Porta();
        porta5.setAberta(true);
        porta5.setCor("Preto");
        porta5.setDimensaox(10);
        porta5.setDimensaoy(15);
        porta5.setDimensaoz(20);
        
        edificio.setPorta(porta5);
        
        Porta porta6 = new Porta();
        porta6.setAberta(false);
        porta6.setCor("Roxo");
        porta6.setDimensaox(10);
        porta6.setDimensaoy(15);
        porta6.setDimensaoz(20);
        
        edificio.setPorta(porta6);
        
        System.out.println("Número total de portas: "+edificio.totalDePortas());
        System.out.println("Número de portas abertas: "+edificio.quantasPortasEstaoAbertas());
        
        edificio.adicionarAndar();
        edificio.adicionarAndar();
        edificio.adicionarAndar();
        edificio.adicionarAndar();
        edificio.adicionarAndar();
        edificio.adicionarAndar();
        
        System.out.println("Número de andares no edifício: "+edificio.totalDeAndares());
        */
    }
    
}
