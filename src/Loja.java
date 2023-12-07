public class Loja {
    Vitrine vitrine;
    CarrinhoDeCompra carrinho;

    public Loja() {
        this.vitrine = new Vitrine();
        this.carrinho = new CarrinhoDeCompra();
    }

    public void verVitrine() {
        this.vitrine.listarItens();
    }

    public void verCarrinho() {
        this.carrinho.listarItensDoCarrinho();
    }

    public void comprarItem(int codigo, int quantidade) {
        Item itemSelecionado = null;
        for (Item item : this.vitrine.itens) {
            if (item.codigo == codigo) {
                itemSelecionado = item;
                break;
            }
        }

        if (itemSelecionado != null) {
            this.carrinho.adicionarItem(itemSelecionado, quantidade);
            System.out.println(quantidade + " " + itemSelecionado.nome + "(s) adicionado(s) ao carrinho.");
        } else {
            System.out.println("Produto não encontrado na vitrine.");
        }
    }

    public void realizarPagamento(boolean aVista) {
        double total = this.carrinho.itensDoCarrinho.stream()
                .mapToDouble(itemCarrinho -> itemCarrinho.item.valor * itemCarrinho.quantidade)
                .sum();

        if (aVista) {
            total *= 0.9; // Aplica 10% de desconto
        }

        System.out.println("Total da compra: R$ " + String.format("%.2f", total));
    }
}
