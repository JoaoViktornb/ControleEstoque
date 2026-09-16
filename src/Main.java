import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        //lista vazia para guardar os produtos
        ArrayList<Produto> estoque = new ArrayList<>();
        int opcao = 0;

        do {
            System.out.println("\n--- CONTROLE DE ESTOQUE ---");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Ver Estoque");
            System.out.println("3 - Sair");

            opcao = sc.nextInt();
            sc.nextLine(); //limpeza de buffer, para tirar o "enter duplo"

            switch (opcao) {
                case 1:
                    System.out.println("\n--- NOVO PRODUTO ---");

                    System.out.print("Digite o nome do produto: ");
                    String nome = sc.nextLine(); // Aqui lê o texto normalmente, pois o buffer já foi limpo lá em cima

                    System.out.print("Digite o preço (ex: 45,90): ");
                    double preco = sc.nextDouble();

                    System.out.print("Digite a quantidade em estoque: ");
                    int quantidade = sc.nextInt();

                    //dps de ler alguns números, limpar por precaução
                    sc.nextLine();

                    // Chamamos o Construtor para montar o objeto
                    Produto novoProduto = new Produto(nome, preco, quantidade);

                    // Guardamos o objeto pronto dentro da lista
                    estoque.add(novoProduto);

                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- ESTOQUE ATUAL ---");

                    // testar se a lista está vazia primeiro
                    if (estoque.isEmpty()) {
                        System.out.println("O estoque está vazio no momento.");
                    } else {
                        double valorTotalDoEstoque = 0;

                        // passa pela lista pra mostrar os detalhes
                        for (Produto p : estoque) {

                            p.exibirDetalhes();

                            valorTotalDoEstoque += (p.getPreco() * p.getQuantidade());
                        }
                        System.out.println("---------------------------");
                        System.out.printf("VALOR TOTAL EM ESTOQUE: R$ %.2f\n", valorTotalDoEstoque);
                    }
                     //adicionar para saber quanto tem de acda produto n so no geral
                    break;

                case 3:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 3);



    }
}
