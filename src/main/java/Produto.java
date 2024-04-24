import java.util.Date;

public class Produto {
    private String marca;
    private int codProduto;
    private String categoria;
    private String nome;
    private float preco_unit;
    private String fornecedor;
    private Date DeletedAt;

    public Produto(String marca, int codProduto, String categoria, String nome, float preco_unit, String fornecedor, Date deletedAt) {
        this.marca = marca;
        this.codProduto = codProduto;
        this.categoria = categoria;
        this.nome = nome;
        this.preco_unit = preco_unit;
        this.fornecedor = fornecedor;
        DeletedAt = deletedAt;
    }

    public String getMarca() {
        return marca;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco_unit() {
        return preco_unit;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public Date getDeletedAt() {
        return DeletedAt;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco_unit(float preco_unit) {
        this.preco_unit = preco_unit;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
}
