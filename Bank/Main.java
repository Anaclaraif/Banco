package Bank;

import java.util.Scanner;
import java.util.Random;

public class Main {
	
	    
	  
	    public static void main (String[] args){
	    
	        String nome;
	        double inicial;
	        Scanner sc = new Scanner(System.in);
	        Random numero = new Random();
	        int conta = 1 + numero.nextInt(9999);
	    
	 
	        System.out.println("Cadastrando novo cliente.");
	        System.out.print("Entre com seu nome: ");
	        nome = sc.next();
	        
	        System.out.print("Entre com o valor inicial depositado na conta: ");
	        inicial = sc.nextDouble();
	        
	       
	        Conta minhaConta = new Conta(nome, conta, inicial);
	        minhaConta.iniciar();
	    }
}

