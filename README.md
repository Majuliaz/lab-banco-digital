# Banco Digital - Projeto DIO

Projeto desenvolvido para o desafio da Digital Innovation One (DIO), onde foi implementado um sistema bancário simples em Java usando os conceitos de Orientação a Objetos.

## Funcionalidades

- Criar contas correntes e poupança para clientes
- Realizar depósitos, saques e transferências entre contas
- Imprimir extratos das contas com informações básicas
- Gerenciar múltiplas contas dentro do banco

## Tecnologias utilizadas

- Java
- Programação Orientada a Objetos (POO)

## Como executar

1. Certifique-se de ter o JDK instalado ([Download JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html))
2. Compile os arquivos Java:

   ```bash
   javac *.java

3. execute o programa principal:
 
    ```bash
     java Main

## Estrutura do Projeto

    
     BancoDigital/
    │
    ├── Banco.java          # Classe que representa o banco e gerencia as contas
    ├── Cliente.java        # Classe que representa o cliente do banco
    ├── Conta.java          # Classe abstrata base para as contas
    ├── ContaCorrente.java  # Conta corrente que herda de Conta
    ├── ContaPoupanca.java  # Conta poupança que herda de Conta
    └── Main.java           # Classe principal para executar e testar o sistema

## Autor

**[Majuliaz](https://github.com/seu-usuario)**
