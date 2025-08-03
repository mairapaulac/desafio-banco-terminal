import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.println("Olá, seja bem-vindo(a) ao banco Avaj!");
        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = input.nextLine();
        System.out.println("Agora, digite o número da agência: ");
        agencia = input.nextLine();
        System.out.println("Digite o número da conta: ");
        numero = input.nextInt();
        System.out.println("Por último, digite o saldo: ");
        saldo = input.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo "
                            + saldo + " já está disponível para saque." );

    }
}
