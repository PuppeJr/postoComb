import java.util.Scanner;
import java.text.DecimalFormat;

public class postoComb {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        // Arrays para armazenar as vendas
        double[] vendasTotais = new double[100]; // Array para armazenar os totais de cada venda
        double[] vendasDescontos = new double[100]; // Array para armazenar os descontos de cada venda
        int indiceVenda = 0; // Índice para controlar a posição atual das vendas nos arrays
        
        boolean fazerOutraVenda;
        
        do {
            int fi, combustivel;
            double l, total, desconto;
            
            System.out.println("Fidelidade? (1) Sim (2) Não");
            fi = sc.nextInt();
            System.out.println("Tipo de Combustível? (1) Gasolina (2) Álcool");
            combustivel = sc.nextInt();
            System.out.println("Quantidade em litros?");
            l = sc.nextDouble();
            
            if (combustivel == 1) { // Gasolina
                if (l <= 20) {
                    if (fi == 1) {
                        total = l * 4.3 * 0.92;
                        desconto = total * 0.08;
                        vendasTotais[indiceVenda] = total;
                        vendasDescontos[indiceVenda] = desconto;
                        System.out.println("O valor final é: " + df.format(total) + ". O desconto foi de: " + df.format(desconto));
                    } else {
                        total = l * 4.3;
                        vendasTotais[indiceVenda] = total;
                        vendasDescontos[indiceVenda] = 0; // Sem desconto
                        System.out.println("O total é: " + df.format(total));
                    }
                } else {
                    if (fi == 1) {
                        total = l * 4.3 * 0.9;
                        desconto = total * 0.1;
                        vendasTotais[indiceVenda] = total;
                        vendasDescontos[indiceVenda] = desconto;
                        System.out.println("O total é: " + df.format(total));
                    } else {
                        total = l * 4.3;
                        vendasTotais[indiceVenda] = total;
                        vendasDescontos[indiceVenda] = 0; // Sem desconto
                        System.out.println("O total é: " + df.format(total));
                    }
                }
            } else if (combustivel == 2) { // Álcool
                if (l <= 20) {
                    if (fi == 1) {
                        total = l * 3.5 * 0.95;
                        desconto = total * 0.05;
                        vendasTotais[indiceVenda] = total;
                        vendasDescontos[indiceVenda] = desconto;
                        System.out.println("O valor final é: " + df.format(total) + ". O desconto foi de: " + df.format(desconto));
                    } else {
                        total = l * 3.5;
                        vendasTotais[indiceVenda] = total;
                        vendasDescontos[indiceVenda] = 0; // Sem desconto
                        System.out.println("O total é: " + df.format(total));
                    }
                } else {
                    if (fi == 1) {
                        total = l * 3.5 * 0.93;
                        desconto = total * 0.07;
                        vendasTotais[indiceVenda] = total;
                        vendasDescontos[indiceVenda] = desconto;
                        System.out.println("O valor final é: " + df.format(total) + ". O desconto foi de: " + df.format(desconto));
                    } else {
                        total = l * 3.5;
                        vendasTotais[indiceVenda] = total;
                        vendasDescontos[indiceVenda] = 0; // Sem desconto
                        System.out.println("O total é: " + df.format(total));
                    }
                }
            } else {
                System.out.println("Tipo de combustível inválido.");
            }
            
            // Incrementa o índice da venda
            indiceVenda++;
            
            System.out.println("Deseja fazer outra venda? (1) Sim (2) Não");
            int opcao = sc.nextInt();
            fazerOutraVenda = (opcao == 1);
        } while (fazerOutraVenda);
        
        // Imprimir todas as vendas
        System.out.println("---- Vendas Realizadas ----");
        for (int i = 0; i < indiceVenda; i++) {
            System.out.println("Venda " + (i+1) + ": Total = " + df.format(vendasTotais[i]) + ", Desconto = " + df.format(vendasDescontos[i]));
        }
        
        sc.close(); // Fechar o Scanner no final do programa
    }
}
