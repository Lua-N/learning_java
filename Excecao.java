package com.mycompany.iniciandojava;

public class Excecao {
    
    public static int div(int a, int b){
        try{
            return a / b;
            
        } catch (ArithmeticException ex){
            System.err.println("A divisão por zero é indefinida");
            return 0;
        }
    }
    
}
