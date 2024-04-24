import java.util.LinkedList;

public class MainClass {
    private static LinkedList<Produto> produtos;
    private static LinkedList<Lote> lotes;
    private static LinkedList<Encomenda> encomendas;
    public static void main(String[] args) {
        Produto produto1 = new Produto("Marca1", 101, "Categoria1", "Produto1", 10.50f, "Fornecedor1", null);
        Produto produto2 = new Produto("Marca2", 102, "Categoria2", "Produto2", 20.75f, "Fornecedor2", null);

        produtos.add(produto1);
        produtos.add(produto2);

        Lote lote1 = new Lote(201, null, 10, produto1, null, "Localizacao1", "Estado1");
        Lote lote2 = new Lote(202, null, 20, produto2, null, "Localizacao2", "Estado2");
        Lote lote3 = new Lote(203, null, 30, produto1, null, "Localizacao3", "Estado3");

        lotes.add(lote1);
        lotes.add(lote2);
        lotes.add(lote3);

        Encomenda encomenda1 = new Encomenda(301, produto1, 5, null);
        Encomenda encomenda2 = new Encomenda(302, produto2, 10, null);
        Encomenda encomenda3 = new Encomenda(303, produto1, 15, null);

        encomendas.add(encomenda1);
        encomendas.add(encomenda2);
        encomendas.add(encomenda3);
    }
}
