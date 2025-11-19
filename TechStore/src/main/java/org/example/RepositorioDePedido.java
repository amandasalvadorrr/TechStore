package org.example;

class RepositorioDePedido {
    public void salvar(Pedido pedido, double valorFinal) {
        System.out.println("Pedido " + pedido.getId() +
                " salvo no BD com valor final: R$" + valorFinal);
    }
}
