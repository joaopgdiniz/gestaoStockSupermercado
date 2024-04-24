import java.util.Date;

public class Lote {
    private int codLote;
    private Date validade;
    private int quantidade;
    private Date dataEntrada;
    private String localizacao;
    private String estado;
    private Date DeletedAt;

    public Lote(int codLote, Date validade, int quantidade, Date dataEntrada, String localizacao, String estado) {
        this.codLote = codLote;
        this.validade = validade;
        this.quantidade = quantidade;
        this.dataEntrada = dataEntrada;
        this.localizacao = localizacao;
        this.estado = estado;
    }

    public int getCodLote() {
        return codLote;
    }

    public Date getValidade() {
        return validade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public String getEstado() {
        return estado;
    }

    public Date getDeletedAt() {
        return DeletedAt;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
