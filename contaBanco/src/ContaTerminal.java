import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;
    public static void main(String[] args) throws Exception {
     ContaTerminal conta = new ContaTerminal();
        try (Scanner Scanner = new Scanner(System.in).useLocale(Locale.getDefault())) {
            System.out.println("Digite o número da conta:");
            conta.numero = Scanner.nextInt();
            
            System.out.println("Digite a Agência:");
            conta.agencia = Scanner.next();
            
            System.out.println("Digite o nome do cliente:");
            conta.nomeCliente = Scanner.next();
            
            System.out.println("Digite o saldo:");
            conta.saldo = Scanner.nextDouble();
            
            System.out.println(
                    "Olá " + conta.nomeCliente + ", obrigado por abrir uma conta conosco, sua agência é " + conta.agencia +
                            ", conta " + conta.numero +
                            " e seu saldo atual é" + conta.saldo + ", e já está disponível para saque!"
            );
        }
    }
}
