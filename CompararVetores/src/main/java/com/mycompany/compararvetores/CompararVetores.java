// Vetor

package com.mycompany.compararvetores;

import java.util.Scanner;

public class CompararVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TAMANHO = 15;
        
        
        int[] v1 = new int[TAMANHO];
        int[] v2 = new int[TAMANHO];
        
        
        System.out.println("Digite os " + TAMANHO + " números do vetor V1:");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            try {
                v1[i] = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Erro: Digite um número inteiro válido.");
                scanner.close();
                return;
            }
        }
        
        
        System.out.println("Digite os " + TAMANHO + " números do vetor V2:");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            try {
                v2[i] = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Erro: Digite um número inteiro válido.");
                scanner.close();
                return;
            }
        }
        
        
        int contador = 0;
        for (int i = 0; i < TAMANHO; i++) {
            if (v1[i] == v2[i]) {
                contador++;
            }
        }
        
        
        System.out.println("\nVetor V1: " + arrayToString(v1));
        System.out.println("Vetor V2: " + arrayToString(v2));
        System.out.println("Quantidade de posições com números iguais: " + contador);
        
        scanner.close();
    }
    
    
    private static String arrayToString(int[] vetor) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < vetor.length; i++) {
            sb.append(vetor[i]);
            if (i < vetor.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}