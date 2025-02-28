
package ex03;

public class Ex03 {

    public static void main(String[] args) {
Conta conta;
        conta = new Conta("Rafaela", 1500.0);
System.out.println("Saldo inicial de " + conta.titular + ": R$ " + conta.getSaldo());
conta.depositar(500.0);
System.out.println("Saldo atual: R$ " + conta.getSaldo());
conta.sacar(300.0);
System.out.println("Saldo atual: R$ " + conta.getSaldo());
conta.sacar(1500.0);
conta.sacar(110.0);
}
    }
    

