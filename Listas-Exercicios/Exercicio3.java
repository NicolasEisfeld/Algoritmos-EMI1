
package Lista_Vetores;

/*
    Escreva um programa em Java que leia 10 números inteiros, e armazene num vetor. Em
    seguida, leia mais um número e verifique se ele é igual a um dos 10 números armazenados no
    vetor.
*/

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int numeros[] = new int [10];
        for(int i: numeros) {
            numeros[i] = dado.nextInt();
        }
        int O_Escolhido = dado.nextInt();
        for(int i: numeros) {
            System.out.println(numeros[i]);
            if(numeros[i] == O_Escolhido) {
                System.out.println("Possui esse valor no vetor");
            }
        }
    }
    
}
