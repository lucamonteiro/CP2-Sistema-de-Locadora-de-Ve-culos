package org.example;


public class Main {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo("Toyota Corolla", 150.0);
        Veiculo carro2 = new Veiculo("Honda Civic", 180.0);

        int diasAluguel = 8;
        int diasAtraso = 2;

        System.out.println(" Aluguel do " + carro1.getModelo());
        double custoTotal1 = carro1.calcularCusto(diasAluguel);
        double multa1 = carro1.calcularMulta(diasAtraso);
        System.out.println("Custo do aluguel por " + diasAluguel + " dias: R$ " + custoTotal1);
        System.out.println("Multa por atraso de " + diasAtraso + " dias: R$ " + multa1);
        System.out.println("Custo final: R$ " + (custoTotal1 + multa1));

        System.out.println();

        System.out.println("Aluguel do " + carro2.getModelo());
        double custoTotal2 = carro2.calcularCusto(diasAluguel);
        double multa2 = carro2.calcularMulta(0);
        System.out.println("Custo do aluguel por " + diasAluguel + " dias: R$ " + custoTotal2);
        System.out.println("Multa por atraso: R$ " + multa2);
        System.out.println("Custo final: R$ " + (custoTotal2 + multa2));
    }
}