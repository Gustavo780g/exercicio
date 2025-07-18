import java.util.Scanner;

public class conta {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta");
        var conta = scanner.nextInt();
        System.out.println("Digite o número da agência");
        var agencia = scanner.nextInt();
        System.out.println("Digite o nome do usuario");
        var usuario = scanner.next();
        System.out.println("Digite o saldo");
        var saldo = scanner.nextDouble();


        System.out.println(usuario + " conta criada" + " agência é " + agencia + " conta " + conta + " e o saldo de " + saldo);



    }
}
