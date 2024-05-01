import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        contaBanco();
    }

    public static void contaBanco() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o numero da conta");
          int numero = leitor.nextInt();
         
        
        System.out.println("Digite o numero da agencia");
         String agencia = leitor.next();
        
        System.out.println("Digite o nome do cliente");
          String nomeCliente = leitor.next();

        System.out.println("Digite o Saldo:");
         double saldo = leitor.nextDouble();

        imprimir(numero, agencia, nomeCliente, saldo);
    }

    public static void imprimir(int numero, String agencia, String nomeCliente, Double saldo) {
   
      System.out.println("Olá " +nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia  + " conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque.");
      }
}