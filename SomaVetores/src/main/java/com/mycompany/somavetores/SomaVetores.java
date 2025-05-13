// Vetor

package com.mycompany.somavetores;

import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite o tamanho dos vetores: ");
        int tamanho;
        try {
            tamanho = scanner.nextInt();
            if (tamanho <= 0) {
                System.out.println("Erro: O tamanho deve ser maior que zero.");
                scanner.close();
                return;
            }
        } catch (Exception e) {
            System.out.println("Erro: Digite um número inteiro válido.");
            scanner.close();
            return;
        }
        
        
        int[] vetor1 = new int[tamanho];
        int[] vetor2 = new int[tamanho];
        int[] vetorSoma = new int[tamanho];
        
        
        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            try {
                vetor1[i] = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Erro: Digite um número inteiro válido.");
                scanner.close();
                return;
            }
        }
        
        
        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            try {
                vetor2[i] = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Erro: Digite um número inteiro válido.");
                scanner.close();
                return;
            }
        }
        
        
        for (int i = 0; i < tamanho; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }
        
        
        System.out.println("\nVetor 1: " + arrayToString(vetor1));
        System.out.println("Vetor 2: " + arrayToString(vetor2));
        System.out.println("Vetor Soma: " + arrayToString(vetorSoma));
        
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