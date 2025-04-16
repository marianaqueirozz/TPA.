/* Eu Mariana Pereira estou desenvolvendo uma calculadora em java 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulacalculadora;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class AulaCalculadora {


    public static void main(String[] args) {
        // Definição de dois números
        double num1 = 10.5;
        double num2 = 5.2;
        
        // Realizando operações matemáticas 
        double soma = num1 + num2; 
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num2 != 0 ? num1 / num2 : Double.NaN; // Evita divisão por zero
        double resto = num1 % num2;
        
        //Exibindo os resultados
        System.out.println("Resultado das operações:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: "+ subtracao);
        System.out.println ("Multiplicacao:" + multiplicacao);
        System.out.println ("Divisao: " + (num2 != 0 ? divisao :
                "Indefinida(divisão por zero)"));
        System.out.println ("Resto:" + resto);
        }
}
