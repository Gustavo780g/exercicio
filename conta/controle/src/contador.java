import java.util.Scanner;

public class contador {
    public static void main(String[] args) throws Exception {
        
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();


    
        int b = parametroDois;
        int c = 1;

        for ( int a = parametroUm;a<b;a++){
            System.out.println("imprimindo o número" + c++);
        }

    }
}
