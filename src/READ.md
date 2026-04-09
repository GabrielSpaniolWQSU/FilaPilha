# Estruturas de Dados: Pilha e Fila em Java

## Aluno
## Gabriel Spaniol

---

## Descrição do Projeto
Este projeto tem como objetivo implementar duas estruturas de dados fundamentais da programação: **pilha** e **fila**, utilizando apenas arrays como base, sem o uso de estruturas prontas da linguagem Java.

O sistema possui um menu interativo no console que permite ao usuário testar todas as operações dessas estruturas, como inserção, remoção e visualização dos elementos.

---

## Explicação sobre Pilha e Fila

### Pilha (LIFO)
A pilha segue o conceito LIFO (Last In, First Out), ou seja, o último elemento inserido é o primeiro a ser removido.

Exemplo: uma pilha de pratos.

Operações principais:
- Push (empilhar)
- Pop (desempilhar)
- Peek (ver topo)

---

### Fila (FIFO)
A fila segue o conceito FIFO (First In, First Out), ou seja, o primeiro elemento inserido é o primeiro a ser removido.

Exemplo: fila de pessoas.

Operações principais:
- Enqueue (inserir)
- Dequeue (remover)
- Front (ver primeiro)

---

## Como o array foi utilizado
O array foi utilizado como estrutura base para armazenar os dados.

- Na pilha, os elementos são inseridos e removidos pelo topo, controlado por uma variável.
- Na fila, os elementos são inseridos no final e removidos do início, utilizando duas variáveis de controle (início e fim).

---
## Link vídeo Youtube
https://www.youtube.com/watch?v=UqBzJq23ZdM

## Como compilar e executar

### 1. Compilar
```bash
javac Main.java

