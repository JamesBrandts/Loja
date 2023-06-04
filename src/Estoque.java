public class Estoque {
    private Produto[] produtos;

    public Estoque(int tamanho) {
        this.produtos = new Produto[tamanho];
    }

    public boolean adicionarProduto(Produto produto) {
        for (int i = 0; i < this.produtos.length; i++) {
            if (this.produtos[i] == null) {
                this.produtos[i] = produto;
                return true;
            }
        }
        return false;
    }

    public String listarProdutos() {
        String lista = "";
        for (int i = 0; i < this.produtos.length; i++) {
            if (this.produtos[i] != null) {
                lista += this.produtos[i] + "\n";
            }
        }
        return lista;
    }
}
