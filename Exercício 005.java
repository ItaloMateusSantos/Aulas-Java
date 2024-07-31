package com.mycompany.exercicio02;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        
        
    //Declarando variáveis 
        
        System.out.println("Digite o produto: ");
        String produto = teclado.next();
        
        System.out.println("Digite o valor que deseja: ");
        int valor = teclado.nextInt();
        
        System.out.println("Digite a quantidade de parcelas: ");
        double parcelas = teclado.nextDouble();
        
     // Operadores aritimédicos
        double total = valor / parcelas;
        
        System.out.println("Produto:  " + produto);
        System.out.println("Valor: " + valor);
        System.out.println("Quantidade de parcelas: " + parcelas);
        System.out.println("O valor de cada parcela é: " + total);
        
        teclado.close();
    }
}