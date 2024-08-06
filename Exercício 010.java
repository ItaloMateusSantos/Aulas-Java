package com.mycompany.aula05;


public class Aula05 {

    public static void main(String[] args) {
// Declarando variáveis.        
        String nomeUsuario = "Marta";
        int senha = 123;
// Compração de Strings e inteiros.       
        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultadoSenha = (senha == 456);
//Exibindo resultados.        
        System.out.println("O nome do usuário está correto? " + resultadoNome);
        System.out.println("A senha está corretoa? " + resultadoSenha);
        
        
    }
}
