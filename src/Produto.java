public class Produto {
    String nome;
    int quantidade;
    int preco;
    Data dataDeValidade;

    public Produto(String nome, int quantidade, int preco, Data dataDeValidade) throws Exception {
        this.setNome(nome);
        try {
            this.setQuantidade(quantidade);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        try {
            this.setPreco(preco);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        this.setDataDeValidade(dataDeValidade);        
    }

    public String toString() {
        return this.nome + " - " + this.quantidade + " - " + this.preco + " - " + this.dataDeValidade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public int getPreco() {
        return this.preco;
    }

    public Data getDataDeValidade() {
        return this.dataDeValidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) throws Exception {
        if (quantidade < 0) {
            throw new Exception("Quantidade inválida");
        }
        this.quantidade = quantidade;
    }

    public void setPreco(int preco) throws Exception {
        if (preco < 0) {
            throw new Exception("Preço inválido");
        }
        this.preco = preco;
    }

    public void setDataDeValidade(Data dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

}
