import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
    
    //int numero;
    //String agencia;
    //String nomeCliente;
    //double saldo;
      
    //TODO:CONHECER E IMPORTAR A CLASSE SCANNER
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite sua conta: ");
    int numero = scanner.nextInt();

    System.out.println("Digite sua Agencia: ");
    String agencia = scanner.next();
    
    System.out.println("Digite seu nome: ");
    String nomeCliente = scanner.next();
    
    System.out.println("Digite o saldo: ");
    double saldo = scanner.nextDouble();

      //EXIBIR AS MESAGENS PARA O NOSSO USUARIO
    System.out.println("Olá " + nomeCliente + ", obrigado por criar a conta em nosso banco, sua agência é: " + agencia + ", conta: " + numero + " e seu saldo é de: " + saldo +" que já está disponível para saque");
      //OBTER PELO SCANNER OS VALORES DIGITADOS NO TERMINAL

      //EXIBIR A MENSAGEM CONTA CRIADA
    }
}
