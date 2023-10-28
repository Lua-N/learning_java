package com.mycompany.iniciandojava;

public class IfDemo {
    public static void main(String args[]){
        int a, b, c;
        
        a = 2;
        b = 3;
        
        if(a < b){ System.out.println("a é menor que b");}
        if (a == b){ System.out.println("você não vai ver isso"); }
        
        System.out.println();
        
        c = a - b;
        
        System.out.println("c contém -1");
        
        if(c >= 0){ //início do bloco
            System.out.println("c é não-negativo");
        } //fim do bloco
        
        if(c < 0){ //início do bloco
            System.out.println("c é negativo");
        } //fim do bloco
        
        System.out.println();
        
        c = b - a;
        
        System.out.println("c contém 1");
        if(c >= 0){ System.out.println("c é não-negativo");}
        if(c < 0){ System.out.println("c é negativo");}
       
        
    }
    
}
