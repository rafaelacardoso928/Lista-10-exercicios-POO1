
package ex05;

public class Ex05 {

    public static void main(String[] args) {
      
        Funcionario funcionario = new Funcionario ("Rafa", 1980.00);

        // Exibindo os dados do funcionário
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: R$" + funcionario.getSalario());
    }
    }
    

