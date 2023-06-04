public class Shopping {
    String nome;
    String endereco;
    Loja[] lojas;

    public Shopping(String nome, String endereco, int quantidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeLojas];
    }

    public void adicionarLoja(Loja loja) {
        for (int i = 0; i < this.lojas.length; i++) {
            if (this.lojas[i] == null) {
                this.lojas[i] = loja;
                break;
            }
        }
    }

    public String toString() {
        String str = "Nome: " + this.nome + "\nEndereço: " + this.endereco + "\nLojas: ";
        for (int i = 0; i < this.lojas.length; i++) {
            if (this.lojas[i] != null) {
                str += "\n" + this.lojas[i];
            }
        }
        return str;
    }
}
