package com.mycompany.iniciandojava;
// esse programa mostra a diferença entre float e double

public class Example3 {
    public static void main (String args[]){
        int var; //declara uma variável int
        double x; //declara uma variável double
        
        var = 10; //atribuição de valor
        
        x = 10.0; //atribuição de valor
        
        System.out.println("Valor original de var: " + var);
        System.out.println("Valor original de x: " + x);
        System.out.println(); //exibe uma linha em branco
        
        //agora divide as duas por 4
        var = var / 4;
        x = x / 4;
        
        System.out.println("Valor de var depois da divisão: " + var);
        System.out.println("Valor de x depois da divisão: " + x);
        
    }
    
}
