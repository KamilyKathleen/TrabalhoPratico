import java.util.ArrayList;
import java.util.List;

public class Vitrine {
    List<Item> itens;

    public Vitrine() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    public void removerItem(int codigo) {
        this.itens.removeIf(item -> item.codigo == codigo);
    }

    public void listarItens() {
        for (Item item : this.itens) {
            System.out.println("Código: " + item.codigo + ", Nome: " + item.nome + ", Valor: " + item.valor);
        }
    }
}
