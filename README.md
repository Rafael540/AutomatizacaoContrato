

# 📄 Sistema de Processamento de Contratos com Parcelamento em Java

Este projeto simula um sistema de geração de parcelas a partir de um contrato, aplicando regras de juros e taxas definidas por um serviço de pagamento (ex: PayPal). Desenvolvido em Java, o sistema aplica conceitos de programação orientada a objetos e boas práticas como injeção de dependência e uso de interfaces.

---

## 🧠 Funcionalidades

- Leitura de dados de um contrato via terminal.
- Divisão do valor total em parcelas mensais.
- Aplicação de juros e taxas de pagamento com base em um serviço externo (`PaypalService`).
- Exibição das parcelas formatadas com data e valor corrigido.

---

## 🧩 Estrutura do Projeto

- `model.entities.Contract`: representa o contrato com número, data e valor total.
- `model.entities.Installment`: representa uma parcela do contrato.
- `model.services.ContractService`: lógica para gerar parcelas.
- `model.services.OnlinePaymentService`: interface para serviços de pagamento online.
- `model.services.PaypalService`: implementação com juros de 1% ao mês e taxa de 2% por parcela.
- `application.Program`: classe principal que executa a aplicação via terminal.

---

## 🛠️ Tecnologias e Conceitos Utilizados

- Java SE 17+ (ou compatível com `java.time`)
- `LocalDate` e `DateTimeFormatter`
- POO: encapsulamento, abstração, composição
- Inversão de dependência com interfaces

---

## ▶️ Instruções de Execução

1. **Clone o repositório:**

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
````

2. **Compile o projeto (exemplo com `javac`):**

```bash
javac application/Program.java
```

3. **Execute o programa:**

```bash
java application.Program
```

4. **Exemplo de entrada esperada:**

```
Entre os dados do contrato:
Numero: 8028
Data (dd/MM/yyyy): 25/06/2025
Valor do contrato: 600.00
Entre com os números de parcelas: 3
```

5. **Saída esperada:**

```
Parcelas:
25/07/2025 - 206.04
25/08/2025 - 208.08
25/09/2025 - 210.12
```

---

## 📌 Observações

* A lógica de juros e taxa pode ser adaptada substituindo a implementação de `OnlinePaymentService`.
* A aplicação foi criada com fins didáticos e pode ser expandida para uso com banco de dados ou interfaces gráficas.

---

```
