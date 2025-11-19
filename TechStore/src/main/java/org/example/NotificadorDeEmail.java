package org.example;

class NotificadorDeEmail {
    public void enviarConfirmacao(String email, String idPedido) {
        System.out.println("Email enviado para " + email + " | Pedido: " + idPedido);
    }
}
