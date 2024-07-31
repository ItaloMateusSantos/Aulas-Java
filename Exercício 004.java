package com.mycompany.exercicio01;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        
    //Declarando variáveis 
        
        System.out.println("Digite o seu nome: ");
        String nome = teclado.next();
        
        System.out.println("Digite sua idade ");
        int idade = teclado.nextInt();
        
        System.out.println("Digite o seu peso");
        double peso = teclado.nextDouble();
        
        System.out.println("Nome " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        
        teclado.close();
    }
}