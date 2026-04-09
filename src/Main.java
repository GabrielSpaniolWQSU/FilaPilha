import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //import da classe scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Defina o tamanho da pilha e fila: ");
        int tamanho = sc.nextInt();

        //criação da pilha e fila
        Pilha pilha = new Pilha(tamanho);
        Fila fila = new Fila(tamanho);

        int opcao;
        //estrutura de repetição
        do {
            System.out.println("\n------- MENU -------");
            System.out.println("/ 1 - Testar Pilha  /");
            System.out.println("/ 2 - Testar Fila   /");
            System.out.println("/ 3 - Sair          /");
            System.out.println("--------------------");
            System.out.print("Escolha uma opção: ");
            //leitura da opção escolhida pelo usuário
            opcao = sc.nextInt();

            //switch para executar a opção que fooi escolhida
            switch (opcao) {
                case 1:
                    //caso 1 vai chamar o metodo da pilha
                    testarPilha(pilha, sc);
                    break;
                case 2:
                    ///caso 2 vai chamar o metodo da fila
                    testarFila(fila, sc);
                    break;
                case 3:
                    //caso 3 vai finalizar o programa
                    System.out.println("Saindo...");
                    break;
                    //caso for um número diferente de 1, 2 e 3 vai mostrar opção invalida
                default:
                    System.out.println("Opção inválida!");
            }
        //condição da estrutura de repetição
        } while (opcao != 3);
        sc.close();
    }
    //criação do metodo para testar as funções da pilha
    private static void testarPilha(Pilha pilha, Scanner sc) {
        int opc;
        //estrutura de repetição
        do {
            System.out.println("\n------- PILHA -------");
            System.out.println("/ 1 - Empilhar       /");
            System.out.println("/ 2 - Desempilhar    /");
            System.out.println("/ 3 - Ver Topo       /");
            System.out.println("/ 4 - Exibir Pilha   /");
            System.out.println("/ 5 - Voltar ao Menu /");
            System.out.println("---------------------");
            System.out.print("Escolha: ");
            //leitura da opção escolhida pelo usuário
            opc = sc.nextInt();

            switch (opc) {
                //caso for 1 vai empilhar o numero escolhido e vai mostrar o valor empilhado
                case 1:
                    System.out.print("Valor a empilhar: ");
                    Pilha.push(sc.nextInt());
                    break;
                //caso 2 vai remover o número do topo da pilha e vai mostrar o valor removido
                case 2:
                    Pilha.pop();
                    break;
                //caso 3 vai exibir o número que está no topo da pilha
                case 3:
                    System.out.println("Topo: " + Pilha.stackpop());
                    break;
                //caso 4 vai mostrar todos os numeros que estão na pilha
                case 4:
                    Pilha.display();
                    break;
                //caso 5 vai voltar ao menu
                case 5:
                    break;
                //caso for um número diferente de 1, 2, 3, 4 ou 5 vai mostrar opção invalida
                default:
                    System.out.println("Opção inválida!");
            }
        //condição da estrutura de repetição
        } while (opc != 5);
    }
    //criação do metodo para testar as funções da fila
    private static void testarFila(Fila fila, Scanner sc) {
        int opc;
        //estrutura de repetição
        do {
            System.out.println("\n-------- FILA --------");
            System.out.println("/ 1 - Inserir         /");
            System.out.println("/ 2 - Remover         /");
            System.out.println("/ 3 - Ver Primeiro    /");
            System.out.println("/ 4 - Exibir Fila     /");
            System.out.println("/ 5 - Voltar ao Menu  /");
            System.out.println("----------------------");
            System.out.print("Escolha: ");
            opc = sc.nextInt();
            //leitura da opção escolhida pelo usuário
            switch (opc) {
                //caso 1 vai inserir elementos na pilha
                case 1:
                    System.out.print("Valor a inserir: ");
                    fila.enqueue(sc.nextInt());
                    break;
                //caso 2 remove um item da pilha
                case 2:
                    fila.dequeue();
                    break;
                //caso 3 mostra o item que esta no topo da fila
                case 3:
                    fila.front();
                    break;
                //caso 4 vai exibir os itens que estão na fila
                case 4:
                    fila.display();
                    break;
                //caso 5 vai voltar ao menu
                case 5:
                    break;
                //caso for um número diferente de 1, 2, 3, 4 ou 5 vai mostrar opção invalida
                default:
                    System.out.println("Opção inválida!");
            }
        //condição da estrutura de repetição
        } while (opc != 5);
    }
}