import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCompras {

    public static void main(String[] args) {
        ArrayList<String> listaCompras = new ArrayList<>( );
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("   Lista de compras  ");
            System.out.println("1.Adicionar item ");
            System.out.println("2 Remover item ");
            System.out.println("3 Exibir lista de compras ");
            System.out.println("4 Sair");
            System.out.println(" Escolha uma opção: ");
            int opcao = scanner.nextInt( );
            scanner.nextLine( );

            switch (opcao) {
                case 1:
                    System.out.println("Digite o item a ser adicionado: ");
                    String item = scanner.nextLine( );
                    listaCompras.add(item);
                    System.out.println("Item adicionado na lista");
                    break;

                case 2:
                    System.out.println("Digite o item a ser removido:");
                    String itemRemover = scanner.nextLine( );
                    if (listaCompras.remove(itemRemover)) {
                        System.out.println("Item removido da lista de compras.");
                    } else {
                        System.out.println("Oitem não foi encontrado na lista de compras");
                    }
                    break;

                case 3:
                    System.out.println("Lista de compras: ");
                    for (String listItem : listaCompras) {
                        System.out.println(listItem);
                    }
                    break;
                case 4:


                    System.out.println("Saindo...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("opção inválida. TENTE NOVAMENTE.");
            }
            System.out.println( );


        }
    }

}