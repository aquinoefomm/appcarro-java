
package appcarro;

public class Owner {
    String nome, cpf;
    
    public void setNome(String nome){
        if(!nome.isEmpty()){
            this.nome = nome;
        }
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setCPF(String cpf){
        if(!cpf.isEmpty()){
            this.cpf = cpf;
        }
    }
    
    public String getCPF(){
        return cpf;
    }
    
    public void printData(){
    System.out.println("Nome: " + getNome());
    System.out.println("CPF: " + getCPF());
    }
}
