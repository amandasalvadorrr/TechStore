# Sistema de Processamento de Pedidos - Aplicação do SRP

Este documento resume a refatoração da classe `ProcessadorDePedido` do sistema fictício **TechStore**, que concentrava funções demais e violava o **Princípio da Responsabilidade Única (SRP)**.

---

## 1. Problemas Identificados

A classe original acumulava quatro tarefas diferentes, dificultando manutenção e testes:

1. **Validação de estoque** – conferia disponibilidade de itens.
2. **Cálculo de frete e impostos** - regras financeiras e de negócio.
3. **Persistência** - salvava informações no banco de dados.
4. **Notificações externas** - enviava e-mails de confirmação.

---

## 2. Aplicando SRP

A solução foi dividir cada responsabilidade em uma classe própria, deixando o código mais simples e organizado:

* **ValidadorDeEstoque** - valida quantidades e disponibilidade.
* **CalculadoraDePreco** - calcula frete, impostos e total.
* **RepositorioDePedido** - salva e gerencia dados no banco.
* **NotificadorDeEmail** - envia confirmações e avisos.

Para coordenar o processo completo, foi criada a classe:

* **ServicoDePedido** - responsável apenas por orquestrar o fluxo:

**validar → calcular → salvar → notificar**

---

## 3. Por que isso melhora o sistema?

Separar as responsabilidades traz benefícios diretos:

* **Mais estabilidade:** mudanças em frete, banco ou e-mail não afetam o restante.
* **Manutenção mais fácil:** cada classe muda por um único motivo.
* **Testes mais simples:** cada parte pode ser testada isoladamente.
* **Mais flexibilidade:** trocar tecnologias (banco, APIs, regras de negócio) fica muito mais seguro.

---

Documentação produzida como parte do estudo de princípios SOLID em Java.
