package com.mycompany.aula03;

/**
 *
 * @author aluno.den
 */
public class Aula03 {

public static void main(String[] args){
        String nome = "Marta";
        String sobrenome = "Silveira";

        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: " + sobrenome.length());

        String nomeCompleto = nome.concat(" ").concat(sobrenome);
        
        System.out.println("Concatenação Maiúscula: " + nomeCompleto.toUpperCase());
        
        System.out.println("Concatenação Maiúscula: " + nomeCompleto.toUpperCase());



    }
}
