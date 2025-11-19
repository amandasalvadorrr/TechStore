package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Pedido pedido = new Pedido("PED-123", 600, 5, "cliente@email.com");
            ServicoDePedido servico = new ServicoDePedido();

            double total = servico.processarPedido(pedido);
            System.out.println("Pedido finalizado! Total: R$" + total);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
