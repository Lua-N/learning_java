package com.mycompany.iniciandojava;

public class GalToLitTable {
    public static void main(String args[]){
        double gallons, liters;
        int counter;
        
        counter = 0; //inicialmente o contador de linhas é configurado com zero
        for(gallons = 1; gallons <= 100; gallons++){
            liters = gallons * 3.7854; //converte pra litros
            System.out.println(gallons + " galão é " + liters + " litros.");
            
            counter++; //incrementa o contador de linhas a cada iteração do laço
            //a cada décima linha, exibe uma linha em branco
            if(counter == 10){ //se o valor do contador for 10, exibe uma linha em branco
                System.out.println();
                counter = 0; //zera o contador de linhas
            }
        }
            
        
    }
    
}
