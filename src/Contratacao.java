import java.util.Date;

public class Contratacao {
    private int idContratacao;
    private Cliente cliente;
    private Fotografo fotografo;
    private Date data;
    private String local;
    private String estiloFotografia;
    private Album album;

    public Contratacao(int idContratacao, Cliente cliente, Fotografo fotografo, Date data, String local, String estiloFotografia) {
        this.idContratacao = idContratacao;
        this.cliente = cliente;
        this.fotografo = fotografo;
        this.data = data;
        this.local = local;
        this.estiloFotografia = estiloFotografia;
    }

    public int getIdContratacao() {
        return idContratacao;
    }

    public void setIdContratacao(int idContratacao) {
        this.idContratacao = idContratacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Fotografo getFotografo() {
        return fotografo;
    }

    public void setFotografo(Fotografo fotografo) {
        this.fotografo = fotografo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getEstiloFotografia() {
        return estiloFotografia;
    }

    public void setEstiloFotografia(String estiloFotografia) {
        this.estiloFotografia = estiloFotografia;
    }
    public Album getAlbum(){
        return album;
    }
    public void setAlbum(Album album) {
        this.album = album;
        
    }
}
