public class Main {
    public static void main(String[] args) {
        Loja lojaVirtual = new Loja();

        Item item1 = new Item(1, "Produto A", 50.0);
        Item item2 = new Item(2, "Produto B", 30.0);

        lojaVirtual.vitrine.adicionarItem(item1);
        lojaVirtual.vitrine.adicionarItem(item2);

        lojaVirtual.verVitrine();

        lojaVirtual.comprarItem(1, 2);
        lojaVirtual.comprarItem(2, 1);

        lojaVirtual.verCarrinho();

        lojaVirtual.realizarPagamento(true);
    }
}
