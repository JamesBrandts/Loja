public class Loja {
    String nome;
    Data fundacao;
    int quantidadeFuncionarios;
    double salarioBaseFuncionario;
    String endereco;
    Produto[] estoqueProdutos;

    public boolean adicionarProduto(Produto produto) {
        for (int i = 0; i < this.estoqueProdutos.length; i++) {
            if (this.estoqueProdutos[i] == null) {
                this.estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }

    public void setTamanhoEstoque(int tamanho) {
        this.estoqueProdutos = new Produto[tamanho];
    }

    public String listarProdutos() {
        String lista = "";
        for (int i = 0; i < this.estoqueProdutos.length; i++) {
            if (this.estoqueProdutos[i] != null) {
                lista += this.estoqueProdutos[i] + "\n";
            }
        }
        return lista;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public double getSalarioBaseFuncionario() {
        return this.salarioBaseFuncionario;
    }

    public int getQuantidadeFuncionarios() {
        return this.quantidadeFuncionarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFundacao(Data fundacao) {
        this.fundacao = fundacao;
    }

    public String getNome() {
        return this.nome;
    }

    public Data getFundacao() {
        return this.fundacao;
    }

    public Loja(String nome, Data fundacao, int tamanhoEstoque) throws Exception {
        this.setNome(nome);
        this.setFundacao(fundacao);
        this.setTamanhoEstoque(tamanhoEstoque);
    }

    public Loja(
            String nome,
            int quantidadeFuncionarios,
            double salarioBaseFuncionario,
            String endereco, Data fundacao,
            int tamanhoEstoque)
            throws Exception {
        this.setNome(nome);
        this.setQuantidadeFuncionarios(quantidadeFuncionarios);
        this.setSalarioBaseFuncionario(salarioBaseFuncionario);
        this.setEndereco(endereco);
        this.setFundacao(fundacao);
        this.estoqueProdutos = new Produto[tamanhoEstoque];
    }

    public String toString() {
        return "Loja: " + this.nome + "\nFundação: " + this.fundacao + "\nEndereço: " + this.endereco
                + "\nQuantidade de funcionários: " + this.quantidadeFuncionarios + "\nSalário base dos funcionários: "
                + this.salarioBaseFuncionario + "\nProdutos: " + this.listarProdutos();
    }
}
