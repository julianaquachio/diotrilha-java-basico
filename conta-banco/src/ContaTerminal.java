import java.util.Scanner;

public class ContaTerminal  {public static void main(String[] args) {try (Scanner input = new Scanner(System.in)) {
    // usar o Scanner
} catch (Exception e) {
    // tratar os erros
    
}
    try (Scanner sc = new Scanner(System.in)) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Seja bem vindo ao seu Banco!");
        System.out.println();
        System.out.println("Por favor, digite o número da Conta:");
        numero = sc.nextInt();

        System.out.println("Agora digite o número da Agência:");
        agencia = sc.next();

        System.out.println("Digite seu nome");
        nomeCliente = sc.next();
        sc.nextLine();

        System.out.println("Confira seu saldo em conta:");
        saldo = sc.nextDouble();

        System.out.println();
        System.out.printf("Olá Mário Andrade, obrigado por criar uma conta em "
                + "nosso banco, sua agência é 067-8, "
                + "conta 1021 e seu saldo 237.48 já está disponível"
                + " para saque.", nomeCliente, agencia, numero, saldo);
        sc.close() ;
    }}

}       
