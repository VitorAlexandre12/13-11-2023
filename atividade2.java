import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        String nome, sobrenome;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite o seu sobrenome: ");
        sobrenome = sc.nextLine();

        System.out.println("Seu nome completo é: " + nome + sobrenome);

    }
}
