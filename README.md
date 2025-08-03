# ContaBanco - DIO Java Básico

Este repositório contém a solução do desafio de projeto proposto no módulo de Sintaxe Java da formação Java Básico da [DIO (Digital Innovation One)](https://www.dio.me/).

## Descrição do Desafio

O desafio consiste em criar uma aplicação simples em Java que simula a criação de uma conta bancária a partir da entrada de dados via terminal. O objetivo é reforçar os conhecimentos sobre:

- Declaração de variáveis
- Leitura de dados pelo terminal com a classe `Scanner`
- Estrutura básica de uma classe Java com o método `main`
- Manipulação de Strings e concatenação
- Tipos de dados primitivos

## Estrutura do Projeto

O projeto é composto por:

- `ContaTerminal.java`: Classe principal que realiza a interação com o usuário via terminal.

## Funcionalidade

O programa solicita ao usuário as seguintes informações:

- Número da conta (inteiro)
- Agência (texto)
- Nome do cliente (texto)
- Saldo (decimal)

Após receber os dados, o programa exibe a seguinte mensagem personalizada:

Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque


## Tecnologias Utilizadas

- Java 17 (ou superior)
- IDE de sua preferência (Eclipse, IntelliJ, VS Code etc.)

## Como Executar

1. Clone este repositório: git clone https://github.com/mairapaulac/ContaBanco.git
2. Compile o arquivo `ContaTerminal.java`: javac ContaTerminal.java
3. Execute o programa: java ContaTerminal


## Autor

Desenvolvido como parte do desafio proposto por Gleyson Sampaio na plataforma DIO.


