# ⚔️ Jogo RPG - Demonstração de Estudos Java

Este projeto é uma pequena demonstração prática dos meus estudos em **Java**. Ele simula um sistema de combate básico entre diferentes classes de personagens, servindo como um exercício para aplicar conceitos fundamentais da programação orientada a objetos (POO).

## 🚀 Objetivo do Projeto

O objetivo principal foi praticar e consolidar o conhecimento em:

* **Classes e Objetos:** Estruturação dos personagens e suas características.
* **Herança:** Utilização de uma classe base (`Personagem`) para derivar classes específicas como `Guerreiro`, `Mago` e `Arqueiro`.
* **Polimorfismo:** Implementação do método abstrato `atacar`, onde cada classe de personagem executa a ação de uma maneira diferente.
* **Encapsulamento e Modificadores de Acesso:** Uso de `protected` para permitir que subclasses acessem atributos essenciais.

## 🎮 Funcionalidades

O sistema permite a criação de heróis e vilões com atributos de vida e força distintos:

* **Guerreiro:** Ataques físicos com espada.
* **Mago:** Utiliza mana para conjurar magias poderosas (Ira Divina).
* **Arqueiro:** Ataques à distância com flechas.
* **Tank:** Personagem com alta resistência (vida), focado em absorver danos.
* **Sistema de Dano:** Controle automático de pontos de vida e verificação de derrota quando a vida chega a zero.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 15).
* **IDE:** IntelliJ IDEA.

## 📝 Como funciona o combate (Exemplo)

No arquivo `Main.java`, é instanciado um cenário de batalha onde os heróis enfrentam o terrível vilão **Zorg, o Goblin**. O código executa uma sequência de ataques e, ao final, exibe o status atualizado dos envolvidos para verificar o dano causado.

---

*Este projeto faz parte do meu portfólio de aprendizado em desenvolvimento de software.*
