import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    List<ItemDoCarrinho> itensDoCarrinho;

    public CarrinhoDeCompra() {
        this.itensDoCarrinho = new ArrayList<>();
    }

    public void adicionarItem(Item item, int quantidade) {
        ItemDoCarrinho itemCarrinho = new ItemDoCarrinho(item, quantidade);
        this.itensDoCarrinho.add(itemCarrinho);
    }

    public void listarItensDoCarrinho() {
        for (ItemDoCarrinho itemCarrinho : this.itensDoCarrinho) {
            System.out.println("Item: " + itemCarrinho.item.nome + ", Quantidade: " + itemCarrinho.quantidade);
        }
    }
}
