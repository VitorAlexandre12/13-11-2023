import java.util.Scanner;

public class atividade {
   public static void main(String[] args) {
    int a, b, resultado;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    a = sc.nextInt();
    System.out.println("Digite outro numero: ");
    b = sc.nextInt();

    resultado = a + b / 4;
    
    System.out.println("Resultado é de: " + resultado);

   } 
}
