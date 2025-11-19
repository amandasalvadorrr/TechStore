package org.example;

class CalculadoraDePreco {
    public double calcularTotal(Pedido pedido) {
        double frete = (pedido.getValorTotal() < 500.0) ? 50.0 : 0.0;
        double impostos = pedido.getValorTotal() * 0.15;

        return pedido.getValorTotal() + frete + impostos;
    }
}
