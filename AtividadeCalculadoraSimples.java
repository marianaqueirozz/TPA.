import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha a operação (1 = Soma, 2 = Subtração, 3 = Multiplicação, 4 = Divisão):");
        int operacao = ler.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = ler.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = ler.nextDouble();

        double resultado = 0;

        if (operacao == 1) {
            resultado = num1 + num2;
        } else if (operacao == 2) {
            resultado = num1 - num2;
        } else if (operacao == 3) {
            resultado = num1 * num2;
        } else if (operacao == 4) {
            if (num2 == 0) {
                System.out.println("Erro: divisão por zero!");
                return;
            } else {
                resultado = num1 / num2;
            }
        } else {
            System.out.println("Operação inválida.");
            return;
        }

        System.out.println("Resultado: " + resultado);
        ler.close();
    }
}