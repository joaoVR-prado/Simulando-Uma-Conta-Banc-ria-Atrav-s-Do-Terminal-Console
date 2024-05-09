import java.util.Locale;
import java.util.Scanner;

class ContaTerminal {

    int numero;
    String agencia;
    String nomeCliente;
    Float saldo;

    ContaTerminal(int umNumero, String umaAgencia, String umNomeCliente, Float umSaldo){
        numero = umNumero;
        agencia = umaAgencia;
        nomeCliente = umNomeCliente;
        saldo = umSaldo;

    }

    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        ContaTerminal conta;
        int numero;
        String agencia, nomeCliente;
        Float saldo;
        
        System.out.println("Por favor, digite o número da conta!");
        numero = ler.nextInt();
        System.out.println("Por favor, digite o número da Agência !");
        agencia = ler.next();
        ler.nextLine();
        System.out.println("Por favor, digite o nome do cliente");
        nomeCliente = ler.nextLine();
        System.out.println("Por favor, digite o saldo");
        saldo = ler.nextFloat();
        ler.close();

        conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);
        System.out.print("Olá" + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
         + conta.agencia + ", conta " + conta.numero + " e seu saldo " + conta.saldo + "já está disponível para saque");


    }
}
