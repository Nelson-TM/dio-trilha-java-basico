//Importar a classe Scanner
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);            
        
        //exibir as msg para o user
        //Valores digitados no terminal
        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Agora digite a sua agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Agora digite o número da Agência!");
        int numeroConta = scanner.nextInt();

        System.out.println("Qual valor esta depositando? ");
        double saldo = scanner.nextDouble();
        
        //msg conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}