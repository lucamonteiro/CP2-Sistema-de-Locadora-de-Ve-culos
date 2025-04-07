package org.example;

public class Veiculo {
    private String modelo;
    private double valorDiaria;

    public Veiculo(String modelo, double valorDiaria) {
        this.modelo = modelo;
        if (valorDiaria < 0) {
            throw new IllegalArgumentException("O valor da diária não pode ser negativo.");
        }
        this.valorDiaria = valorDiaria;
    }

    public double calcularCusto(int dias) {
        if (dias <= 0) {
            throw new IllegalArgumentException("O número de dias deve ser maior que zero.");
        }

        double custo = valorDiaria * dias;
        return custo - desconto(dias);
    }

    public double desconto(int dias) {
        double custo = valorDiaria * dias;
        if (dias >= 7) {
            return custo * 0.10;
        }
        return 0;
    }

    public double calcularMulta(int diasAtraso) {
        if (diasAtraso <= 0) {
            return 0;
        }
        return valorDiaria * diasAtraso * 1.5;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValorDiaria(double valorDiaria) {
        if (valorDiaria < 0) {
            throw new IllegalArgumentException("O valor da diária não pode ser negativo.");
        }
        this.valorDiaria = valorDiaria;
    }

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Toyota Corolla", 150.0);
        int diasAluguel = 10;
        int diasAtraso = 2;

        double custoTotal = veiculo.calcularCusto(diasAluguel);
        double multa = veiculo.calcularMulta(diasAtraso);

        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Custo do aluguel: R$ " + custoTotal);
        System.out.println("Multa por atraso: R$ " + multa);
    }
}
