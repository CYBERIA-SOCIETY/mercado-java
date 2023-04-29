import util.Mercado;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Mercado produto1;
        produto1 = new Mercado();

        Scanner input = new Scanner(System.in);

        System.out.println("registre  o nome do produto \n");
        produto1.nome = input.next();
        System.out.println("registre o valor do produto \n");
        produto1.preco = input.nextDouble();
        System.out.println("registre a quantidade de estoque do produto");
        produto1.quantidadeEstoque = input.nextInt();
        int op;

        do
        {
            System.out.println("1) veja o valor do estoque inteiro do produto");
            System.out.println("2) adicione 1 produto ao estoque");
            System.out.println("3) remova o produto do estoque");
            System.out.println("4) sair");
            op = input.nextInt();

            switch(op)
            {
                case 1:
                    double  valorEstoqueTotal = produto1.valorTotalEmEstoque();
                    System.out.printf("o valor total do %s no estoque eh: %f", produto1.nome, valorEstoqueTotal);
                    break;
                case 2:
                    System.out.printf("insira a quantidade de produtos que deseja inserir no estoque de %s \n",produto1.nome);
                    int valorAdicionar = input.nextInt();
                    produto1.adicionarProdutos(valorAdicionar);
                    break;
                case 3:
                    System.out.printf("insira a quantidade de produtos que deseja remover no estoque de %s \n",produto1.nome);
                    int valorRemover = input.nextInt();
                    produto1.removeProdutos(valorRemover);
                    break;
                case 4:
                    System.out.println("encerrando o sistema \n");
                    break;
                default:
                    System.out.println("o numero selecionado não é uma opção \n");
                    break;
            }
        }while(op != 4);
                
     /*   System.out.println("Dados do produto \n");
        System.out.printf("nome: %s \n",produto1.nome);
        System.out.printf("valor unitario: %f \n",produto1.preco);
        System.out.printf("quantidade: %d \n",produto1.quantidadeEstoque);
        System.out.printf("valor total do estoque: %s",produto1.valorTotalEmEstoque());
    */
        System.out.println("informações do produo:" + produto1);
    }
}
