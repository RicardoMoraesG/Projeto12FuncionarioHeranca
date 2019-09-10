
package modelo.Principal;


public class Gerente extends Funcionario {
    private String setor;
    private String senha;
    
    //Contrutores/getter/Setter

    public Gerente() {
    }

    public Gerente(String setor, String senha, String nome, double salario, String cpf) {
        //palavra reservada SUPER{
            //this.nome = nome;
            //this.salario = salario;
            //this.cpf = cpf;
        //}
        super(nome,salario,cpf);
        this.setor = setor;
        this.senha = senha;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    //sobrecarga (OVERRIDE) permite o uso do conceito de Polimorfismo da Orientação a Objetos
    //usando para isto a anotação @Override
    @Override
       public String getInformacao(){
        return "Gerente: " + this.nome + " recebe " + this.salario;
    }
    @Override
    public double getBonificacao(){
        return this.salario * 0.15;
    }
    public boolean gerAutenticacao(String senha){
        //comparação de Strings usamos equals//porque String é uma classe
        //comparação de int usamo ==
        if (this.senha.equals(senha)){
            System.out.println("Acesso Permitido!");
            return true;
        }else
        {
            System.out.println("Acesso Negado!");
            return false;
        }
    }
 
}
