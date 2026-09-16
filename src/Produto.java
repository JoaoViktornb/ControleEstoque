public class Produto {

    private String nome;
    private double preco;
    private int quantidade;


    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //GETTERS
    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }


    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    //Metodo para mostrar os dados do produto
    public void exibirDetalhes(){
        System.out.println("Quantidade: " + this.quantidade + " | Produto: " + this.nome + " | Preço: R$ " + this.preco);
    }

}
