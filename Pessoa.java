package projetoolamundo;

public class Pessoa {
    String sexo;
    String corPele;
    int peso;
    
    //Cria método
    public void comer(){
        System.out.println("Estou com fome!");
    }
    
    //Cria método 2
    public void sono(){
        System.out.println("Estou com sono!");
    }
    
    //Cria método 3
    public void estudar(){
        System.out.println("O/a estudante vai estudar.");
    }
    
    //Exemplo de método privado. Este não pode ser herdado
    private void correr(){
        System.out.println("Necessário correr para exercitar.");
    }
            
    
}
