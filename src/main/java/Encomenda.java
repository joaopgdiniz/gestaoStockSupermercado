import java.util.Date;

public class Encomenda {
    private int codEncomenda;
    private Produto produto;
    private int quantidade;
    private Date dataEncomenda;

    public Encomenda(int codEncomenda, Produto produto, int quantidade, Date dataEncomenda) {
        this.codEncomenda = codEncomenda;
        this.produto = produto;
        this.quantidade = quantidade;
        this.dataEncomenda = dataEncomenda;
    }

    public int getCodEncomenda() {
        return codEncomenda;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Date getDataEncomenda() {
        return dataEncomenda;
    }

}
