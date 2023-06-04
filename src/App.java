import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da loja:");
        String nome = scanner.nextLine();
        System.out.print("Digite a data de fundação no formato (dd/mm/aaaa):");
        String fundacaoString = scanner.nextLine();
        System.out.print("Digite o endereço da loja:");
        String endereco = scanner.nextLine();
        System.out.print("Digite a quantidade de funcionários:");
        int quantidadeFuncionarios = scanner.nextInt();
        System.out.print("Digite o salário base dos funcionários:");
        double salarioBaseFuncionario = scanner.nextDouble();
        String[] fundacaoArray = fundacaoString.split("/");
        int ano = Integer.parseInt(fundacaoArray[2]);
        int mes = Integer.parseInt(fundacaoArray[1]);
        int dia = Integer.parseInt(fundacaoArray[0]);
        Data fundacao = new Data(ano, mes, dia);
        System.out.print("Digite o tamanho máximo do estoque:");
        int tamanhoEstoque = scanner.nextInt();
        scanner.close();
        Loja loja = new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, fundacao, tamanhoEstoque);
        Produto produto1 = new Produto("Produto Teste 1",5,5.00, new Data(2021, 10, 10));
        Produto produto2 = new Produto("Produto Teste 2",5,5.00, new Data(2021, 10, 10));
        Produto produto3 = new Produto("Produto Teste 3",5,5.00, new Data(2021, 10, 10));
        Produto produto4 = new Produto("Produto Teste 4",5,5.00, new Data(2021, 10, 10));
        Produto produto5 = new Produto("Produto Teste 5",5,5.00, new Data(2021, 10, 10));
        loja.adicionarProduto(produto1);
        loja.adicionarProduto(produto2);
        loja.adicionarProduto(produto3);
        loja.adicionarProduto(produto4);
        loja.adicionarProduto(produto5);
        System.out.println(loja);

    }
}
