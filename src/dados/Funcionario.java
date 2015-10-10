/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author Gabbi
 */
public class Funcionario {
      
    private int Codigo;
    private String Nome;
    private int Cpf;
    private int Telefone;
    
    
    private static int contadorCodigo = 1;
    
     public Funcionario() {
        System.out.println("Construtor default de Funcionario");
        
        
        Codigo = contadorCodigo;
        
        
        contadorCodigo++;
    }
    
     public Funcionario(String nome, int Cpf, int Telefone){
         Codigo = contadorCodigo;
         contadorCodigo++;
               System.out.println("Construtor com argumentos");
               
               this.Nome =nome;
               this.Cpf = Cpf;
               this.Telefone = Telefone;
         
         
         
         
     }
    
    public void imprimirDados() {
        
        System.out.println( toString() );
    }
    
    @Override
    public String toString(){
        
          String relatorio = "";
        relatorio += "Código: "+Codigo;
        relatorio += "\nNome: "+Nome;
        relatorio += "\nCPF: "+Cpf;
        relatorio += "\nTelefone: "+ Telefone;
        return relatorio;
        
        
        
    }

    public int getCodigo() {
        return Codigo;
    }


    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getCpf() {
        return Cpf;
    }

    public void setCpf(int Cpf) {
        this.Cpf = Cpf;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }
    
    
    
    
    

    
}
