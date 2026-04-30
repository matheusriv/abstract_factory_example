# Exemplo de Design Pattern: Abstract Factory (Java)

Este repositório contém uma implementação prática do padrão de projeto **Abstract Factory**, desenvolvida como material de apoio e exemplo para a disciplina de **Engenharia de Software**.

## 📌 Sobre o Projeto

O objetivo deste código é demonstrar como criar famílias de objetos relacionados (neste caso, veículos de luxo e básicos) sem especificar suas classes concretas. A implementação foca no desacoplamento entre a criação dos objetos e o sistema que os utiliza.

### O Cenário
Simulamos um sistema de uma loja de veículos que opera em dois contextos diferentes:
1. Main (Principal): Loja principal/padrão.
2. Branch (Filial): Loja com especificações regionais/filial.

## Como Compilar e Executar

Para compilar e executar este projeto via terminal, certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina.

1. Abra o terminal e navegue até a pasta `src` do projeto:
   ```bash
   cd src
   ```
2. Compile os arquivos Java a partir da classe principal:
   ```bash
   javac main/java/veiculos/Main.java
   ```
3. Execute o programa:
   ```bash
   java main.java.veiculos.Main
   ```
