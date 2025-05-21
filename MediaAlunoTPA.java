/*Eu,Mariana Pereira estou desenvolvendo um algoritimo para calcular a média com números inteiros
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediaaluno;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class MediaAluno {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    /**declarando variáveis/*/ 
        double nota1, nota2, media;
        
        System.out.print("Digite a primeira nota: ");
        nota1 = input.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        nota2 = input.nextDouble();
       
        media = (nota1 + nota2) / 2;  
        
        System.out.print("A média é: " + media);
        
    }
}
