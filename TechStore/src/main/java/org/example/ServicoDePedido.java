package org.example;

class ServicoDePedido {

    private ValidadorDeEstoque validador;
    private CalculadoraDePreco calculadora;
    private RepositorioDePedido repositorio;
    private NotificadorDeEmail notificador;

    public ServicoDePedido() {
        this.validador = new ValidadorDeEstoque();
        this.calculadora = new CalculadoraDePreco();
        this.repositorio = new RepositorioDePedido();
        this.notificador = new NotificadorDeEmail();
    }

    public double processarPedido(Pedido pedido) throws Exception {

        validador.validar(pedido);

        double total = calculadora.calcularTotal(pedido);
        pedido.setPago(true);

        repositorio.salvar(pedido, total);

        notificador.enviarConfirmacao(pedido.getEmailCliente(), pedido.getId());

        return total;
    }
}
