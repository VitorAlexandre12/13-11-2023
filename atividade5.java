import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        int idade, anoNascimento, anoAtual;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento: ");
        anoNascimento = sc.nextInt();
        System.out.println("Digite o ano atual: ");
        anoAtual = sc.nextInt();
        idade = anoAtual - anoNascimento;
        System.out.println("Você tem: "  + idade +  " anos");
    }
}
