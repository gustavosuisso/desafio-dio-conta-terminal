import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){

        /* numero: inteiro
         * agencia: texto
         * nome cliente: texto
         * saldo: decimal
         */

        int numeroDaConta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); /* instanciando um objeto do tipo scanner e usando sua referencia 
                                                                        * para pegar os dados digitados pelo usuário*/

        System.out.println("Por favor, digite o número da sua Agência:");
        agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta:");
        numeroDaConta = scanner.nextInt();

        System.out.println("Por favor, agora digite seu nome:");
        nomeCliente = scanner.next();

        System.out.println("Informe o saldo que quer inserir:");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
         + agencia + ", conta " + numeroDaConta + " e seu saldo de " + saldo + " já está disponivel para saque.");

    }

}