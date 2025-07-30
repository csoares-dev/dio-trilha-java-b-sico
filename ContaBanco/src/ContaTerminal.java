import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Seja Bem-Vindo ===");
        System.out.println("=== Banco Santander ===");

        System.out.println("\nPor favor, digite o número da conta !");
        int Numero = sc.nextInt();

        System.out.println("\nPor favor, digite sua agência: ");
        System.out.println("Exemplo: 067-8");
        String Agencia = sc.next();

        System.out.println("\nDigite seu nome completo: ");
        String NomeCliente = sc.next();

        System.out.println("\nDigite quanto você vai depositar:");
        float Saldo = sc.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %s já está disponivel para saque.", NomeCliente,Agencia,Numero,Saldo);

      
    }
}
