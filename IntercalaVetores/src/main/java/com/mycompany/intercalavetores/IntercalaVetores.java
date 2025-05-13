// Vetor
package com.mycompany.intercalavetores;

import java.util.Scanner;

public class IntercalaVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lê o tamanho do vetor A
        System.out.print("Digite o tamanho do vetor A: ");
        int n;
        try {
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Erro: O tamanho deve ser não-negativo.");
                scanner.close();
                return;
            }
        } catch (Exception e) {
            System.out.println("Erro: Digite um número inteiro válido.");
            scanner.close();
            return;
        }
        
        // Lê os elementos do vetor A
        int[] a = new int[n];
        System.out.println("Digite os " + n + " elementos do vetor A (ordenados):");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            try {
                a[i] = scanner.nextInt();
                // Verifica se o vetor está ordenado
                if (i > 0 && a[i] < a[i - 1]) {
                    System.out.println("Erro: Os elementos devem estar em ordem crescente.");
                    scanner.close();
                    return;
                }
            } catch (Exception e) {
                System.out.println("Erro: Digite um número inteiro válido.");
                scanner.close();
                return;
            }
        }
        
        // Lê o tamanho do vetor B
        System.out.print("Digite o tamanho do vetor B: ");
        int m;
        try {
            m = scanner.nextInt();
            if (m < 0) {
                System.out.println("Erro: O tamanho deve ser não-negativo.");
                scanner.close();
                return;
            }
        } catch (Exception e) {
            System.out.println("Erro: Digite um número inteiro válido.");
            scanner.close();
            return;
        }
        
        // Lê os elementos do vetor B
        int[] b = new int[m];
        System.out.println("Digite os " + m + " elementos do vetor B (ordenados):");
        for (int i = 0; i < m; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            try {
                b[i] = scanner.nextInt();
                // Verifica se o vetor está ordenado
                if (i > 0 && b[i] < b[i - 1]) {
                    System.out.println("Erro: Os elementos devem estar em ordem crescente.");
                    scanner.close();
                    return;
                }
            } catch (Exception e) {
                System.out.println("Erro: Digite um número inteiro válido.");
                scanner.close();
                return;
            }
        }
        
        // Cria o vetor C
        int[] c = new int[n + m];
        
        // Intercala os vetores A e B
        int i = 0; // Índice para vetor A
        int j = 0; // Índice para vetor B
        int k = 0; // Índice para vetor C
        
        // Enquanto ambos os vetores têm elementos
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        
        // Copia elementos restantes de A, se houver
        while (i < n) {
            c[k] = a[i];
            i++;
            k++;
        }
        
        // Copia elementos restantes de B, se houver
        while (j < m) {
            c[k] = b[j];
            j++;
            k++;
        }
        
        // Exibe os vetores
        System.out.println("\nVetor A: " + arrayToString(a));
        System.out.println("Vetor B: " + arrayToString(b));
        System.out.println("Vetor C (intercalado): " + arrayToString(c));
        
        scanner.close();
    }
    
    // Método auxiliar para converter vetor em string
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