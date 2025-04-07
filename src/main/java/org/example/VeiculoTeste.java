package org.example;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;


class VeiculoTeste {

    @Test
    void testCalcularCustoSemDesconto() {
        Veiculo veiculo = new Veiculo("Gol", 100.0);
        double custo = veiculo.calcularCusto(3);
        assertEquals(300.0, custo, 0.001);
    }

    @Test
    void testCalcularCustoComDesconto() {
        Veiculo veiculo = new Veiculo("Onix", 100.0);
        double custo = veiculo.calcularCusto(7);
        assertEquals(630.0, custo, 0.001);
    }

    @Test
    void testCalcularCustoZeroDias() {
        Veiculo veiculo = new Veiculo("Palio", 100.0);
        double custo = veiculo.calcularCusto(0);
        assertEquals(0.0, custo, 0.001);
    }

    @Test
    void testMultaPorAtraso() {
        Veiculo veiculo = new Veiculo("Civic", 150.0);
        double multa = veiculo.calcularMulta(2);
        assertEquals(300.0, multa, 0.001);
    }

    @Test
    void testDescontoProgressivo() {
        Veiculo veiculo = new Veiculo("Corolla", 200.0);
        double desconto = veiculo.calcularDescontoProgressivo(15);
        assertEquals(300.0, desconto, 0.001);
    }
}
