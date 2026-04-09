public class Fila {
    //declaração de uma array que vai guardar os valores da pilha
    private int[] fila;
    //declaração de 3 variáveis
    private int inicio, fim, tamanho;

    //construtor da classe
    public Fila(int capacidade) {
        fila = new int[capacidade];
        inicio = 0;
        fim = -1;
        tamanho = 0;
    }

    //verifica se a fila está vazia
    public boolean isEmpty() {
        return tamanho == 0;
    }

    //verifica se a fila está cheia
    public boolean isFull() {
        return tamanho == fila.length;
    }

    //adiciona um elemento no final da fila
    public void enqueue(int valor) {
        //se a fila estiver cheia vai mostrar erro
        if (isFull()) {
            System.out.println("Erro: Fila cheia!");
        } else {
            fim++; //se a fila não estiver cheia ela avança uma posição
            fila[fim] = valor; //coloca o valor adicionado nessa posição
            tamanho++; //aumenta o tamanho da fila
            System.out.println("Valor inserido!");
        }
    }
    //metodo para remover um elemento da fila
    public int dequeue() {
        //se a fila estiver vazia, não remove nada e mostra erro
        if (isEmpty()) {
            System.out.println("Erro: Fila vazia!");
            return -1;
        } else {
            int valor = fila[inicio]; //pega o valor que está no inicio e guarda na variavel valor
            inicio++; //avança o início da fila, o segundo elemento da fila vira o primeiro
            tamanho--; //diminui o tamanho da fila
            System.out.println("Valor removido: " + valor);
            return valor;
        }
    }

    //metodo para mostrar o primeiro elemento da fila
    public int front() {
        //se a fila estiver vazia, não tem o que mostrar
        if (isEmpty()) {
            System.out.println("Fila vazia!");
            return -1;
        }
        //mostra o valor que está no início
        System.out.println("Primeiro da fila: " + fila[inicio]);
        return fila[inicio];
    }

    //metodo para mostrar todos os elementos que tem na fila
    public void display() {
        //se estiver vazia, não tem o que mostrar
        if (isEmpty()) {
            System.out.println("Fila vazia!");
        } else {
            //percorre a fila do inicio ao fim e printa no terminal
            System.out.println("Elementos da fila:");
            for (int i = inicio; i <= fim; i++) {
                System.out.println(fila[i]);
            }
        }
    }
}