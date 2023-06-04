public class Produto {
    String nome;
    int quantidade;
    double preco;
    Data dataDeValidade;

    public Produto(String nome, int quantidade, double preco, Data dataDeValidade) throws Exception {
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
        return "Nome: " + this.nome + " - Quantidade: " + this.quantidade + " - Preço: " + this.preco + " - Validade: " + this.dataDeValidade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public double getPreco() {
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

    public void setPreco(double preco2) throws Exception {
        if (preco2 < 0) {
            throw new Exception("Preço inválido");
        }
        this.preco = preco2;
    }

    public void setDataDeValidade(Data dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

}
