# 🏦 Sistema Bancário em Java

Este projeto é baseado em um sistema simples que simula o funcionamento de um banco, utilizando conceitos de orientação a objetos.  
O sistema permite criar contas bancárias (corrente e poupança), realizar operações como depósitos, saques e transferências, além de consultar saldos de forma prática.

O objetivo principal é praticar conceitos fundamentais de **Java e POO**, como **herança, encapsulamento, polimorfismo, manipulação de listas** e **regras de negócio** aplicadas ao contexto bancário.

## 🗂 Estrutura do Projeto

Para a criação deste sistema foram desenvolvidas classes principais que interagem entre si para simular o funcionamento de um banco de forma simples e organizada. As principais classes são:

- **ContaBancaria**: Classe base que representa uma conta genérica, contendo atributos e métodos comuns, como número da conta, titular, saldo, depósitos e saques.

- **ContaCorrente**: Classe que herda de `ContaBancaria`, adicionando regras específicas como o uso de **cheque especial**.

- **ContaPoupanca**: Classe que herda de `ContaBancaria`, responsável pela aplicação de **rendimentos** sobre o saldo.

- **Main**: Classe responsável por iniciar a aplicação, permitindo criar contas, realizar depósitos, saques, transferências e consultar saldos.

## ⚙️ Funcionalidades

- Criar contas bancárias (corrente e poupança).  
- Armazenar informações de cada conta (número, titular e saldo).  
- Realizar depósitos em contas existentes.  
- Efetuar saques respeitando as regras de cada tipo de conta.  
- Consultar o saldo de uma conta.  
- Realizar transferências entre contas.  
- Aplicar rendimento em contas poupança.

## 🛠️ Tecnologias e Conceitos Abordados

- **Java** (JDK).  
- **Maven** (gerenciamento de dependências e build).  
- **Orientação a Objetos (POO)**: herança, encapsulamento, polimorfismo.  
- **Tratamento de exceções** (operações inválidas como saque sem saldo).  
- **Regras de negócio bancárias** (depósitos, saques, transferências e rendimento da poupança).

## 💻 Demonstração

Exemplo de uso das classes no `Main`:

```java
ContaCorrente cc = new ContaCorrente("João", 1001, 500.0, 100.0);
cc.sacar(200);
cc.depositar(150);
System.out.println("Saldo atual: " + cc.getSaldo());

ContaPoupanca cp = new ContaPoupanca("Maria", 1002, 1000.0, 0.01);
cp.aplicarRendimento();
System.out.println("Saldo após rendimento: " + cp.getSaldo());
```

## 💭 Futuras Melhorias

Meu objetivo é futuramente adicionar um **menu interativo no console**, permitindo que o usuário realize operações como criar contas, depósitos, saques, transferências e consultas de saldo de forma dinâmica.  
Também pretendo implementar uma **interface gráfica** (Swing ou JavaFX) para tornar o sistema mais completo e visual.

## 🚀 Como executar?

### Pré-requisitos

1. Possuir **JDK** instalado em sua máquina.  
2. Possuir uma **IDE** que permita a utilização do Java (como VSCode, IntelliJ, Eclipse).  
3. Possuir **Maven** instalado e configurado no PATH do sistema.  

### Execução

1. Clone o repositório em sua máquina local:  
   ```bash
   git clone https://github.com/Walmir07/sistema_bancario.git
   ```
2. Acesse a pasta do arquivo:

   ```bash
   cd sistema_bancario
   ```
3. Compile o projeto com Maven:
   ```bash
   mvn clean install
   ```
4. Execute a aplicação:
   ```bash
   mvn exec:java -Dexec.mainClass="br.com.bancario.app.Main"
   ```

## 📜 Licença

Este projeto está licenciado sob a **MIT License** - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 👤 Autor
- **Walmir Lima** – [@Walmir07](https://github.com/Walmir07)