public class Pilha {

    //declaração de uma array que vai guardar os valores da pilha
    private static int[] pilha;
    //variável que vai indicar onde está o topo da pilha
    private static int topo;

    //construtor da classe
    public Pilha(int tamanho) {
        pilha = new int[tamanho];
        topo = 0;
    }

    //metodo para empilhar um item na pilha
    public static void push(int valor) {
        //verifica se tem espaço na pilha
        if (!full()) {
            pilha[topo] = valor; //coloca o valor na posição do topo
            topo++;//avança o topo pra próxima posição
            System.out.println("Valor empilhado: " + valor);
        } else {
            //caso a pilha esteja cheia
            System.out.println("Erro: Pilha cheia!");
        }
    }

    // remove um item da pilha e retorna ele
    public static int pop() {
        //verifica se a pilha não está vazia
        if (!empty()) {
            //pega o último valor inserido na pilha
            int valor = pilha[size() - 1];
            //limpa a posição do vetor
            pilha[size() - 1] = 0;
            //diminui o topo
            topo--;
            //mostra o valor removido
            System.out.println("Valor removido: " + valor);
            return valor;

        }
        //caso a pilha esteja vazia, mostra erro
        System.out.println("Erro: Pilha vazia!");
        return -1;
    }

    // retorna o elemento do topo da pilha
    public static int stackpop() {
        //verifica se a pilha está vazia
        if (!empty()) {
            //se não estiver vazia, mostra valor que está no topo
            return pilha[size() - 1];
        }
        //se a pilha estiver vazia, mostra uma mensagme de erro
        System.out.println("Pilha vazia!");
        return -1;
    }

    //retorna o tamanho da pilha
    public static int size() {
        return topo;
    }

    //verifica se a pilha está vazia
    public static boolean empty() {
        return topo <= 0;
    }

    //verifica se a pilha está cheia
    public static boolean full() {
        return topo == pilha.length;
    }

    // exibe os elementos da pilha
    public static void display() {
        //verifica se a pilha está vazia
        if (empty()) {
            //se estiver vazia, mostra mensagem que está vazia
            System.out.println("Pilha vazia!");
        } else {
            System.out.println("Elementos da pilha:");
            //percorre a fila do inicio ao fim e printa no terminal
            for (int i = topo - 1; i >= 0; i--) {
                System.out.println(pilha[i]);
            }
        }
    }
}