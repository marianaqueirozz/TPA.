/*Importando as bibliotecas necessárias para criar a interface gráfica 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparadornumeros;

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.*; //Biblioteca do Java Swing (para criar janelas, botões, etc.)
public class ComparadorNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarção de variáveis para armazenar os números digitados
        double numero1; // Primeiro número
        double numero2; // Segundo número
        
          // Usamos try/catch para evitar que o programa feche caso o usuário digite algo inválido
        try {
            // JOptionPane.showInputDialog mostra uma caixa de texto para o usuário digitar algo
            // O resultado vem como String, então usamos Double.parseDouble para converter para número
            numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número:"));
            numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número:"));

            // Criamos uma String para armazenar todas as comparações
            String resultado = "Resultados das comparações:\n\n";
            
            // Comparação de igualdade
            if (numero1 == numero2) {
                resultado += numero1 + " é IGUAL a " + numero2 + "\n";
            } else {
                resultado += numero1 + " é DIFERENTE de " + numero2 + "\n";
            }
            
            // Comparação de maior que
            if (numero1 > numero2) {
                resultado += numero1 + " é MAIOR que " + numero2 + "\n";
            }
            
            // Comparação de menor que
            if (numero1 < numero2) {
                resultado += numero1 + " é MENOR que " + numero2 + "\n";
            }
            
            // Comparação de maior ou igual
            if (numero1 >= numero2) {
                resultado += numero1 + " é MAIOR OU IGUAL a " + numero2 + "\n";
            }
            
            // Comparação de menor ou igual
            if (numero1 <= numero2) {
                resultado += numero1 + " é MENOR OU IGUAL a " + numero2 + "\n";
            }

            // Exibe o resultado final em uma janela
            JOptionPane.showMessageDialog(null, resultado, "Comparação Final", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            // Caso o usuário digite algo que não seja número, mostramos mensagem de erro
            JOptionPane.showMessageDialog(null, "Entrada inválida! Digite apenas números.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}