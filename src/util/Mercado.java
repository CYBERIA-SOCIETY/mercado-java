package util;


 // @author rafaax

public class Mercado {
    public String nome;
    public double preco;
    public int quantidadeEstoque;

    public double valorTotalEmEstoque()
    {
        return preco * quantidadeEstoque;
    }

    public void adicionarProdutos(int somaQuantidade)
    {
        quantidadeEstoque += somaQuantidade;
        System.out.println("adicionou ao estoque! \n");
    }

    public void removeProdutos(int subQuantidade)
    {
        quantidadeEstoque -= subQuantidade;
        System.out.println("removeu do estoque! \n");
    }

    public String toString()
    {
        return nome
                + " R$ "
                + String.format("%.2f", preco)
                +", "
                + quantidadeEstoque
                +"unidades, valor total em estoque: R$"
                +String.format("%.2f", valorTotalEmEstoque());
    }
}
