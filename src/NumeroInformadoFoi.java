import java.util.Scanner;

public class NumeroInformadoFoi {
	
        public static void main(String args[])
        {
       
         Scanner entrada = new Scanner(System.in);
       
         System.out.print("Digite um numero? ");
         int numero = entrada.nextInt();
       
         System.out.println("O numero informado foi: " + numero + "");
    }
}

