package com.mycompany.iniciandojava;

public class PesoLua {
    public static void main(String args[]){
        double massa;
        double gravidadeLua;
        double gravidadeTerra;
        double pesoNaLua;
        
        massa = 108;
        gravidadeLua = 1.622;
        gravidadeTerra = 9.81;
        
        pesoNaLua = massa * (gravidadeLua / gravidadeTerra);
        
        System.out.println("Meu peso na Terra é " + massa + ", e na Lua é " + pesoNaLua);
        
        
    }
    
}
