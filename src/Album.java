import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Album {
    private int idAlbum;
    private Cliente cliente;
    private String descricao;
    private Date dataInicio;
    private Date dataFinal;
    private double  valor;
    private List<Foto> fotos;

    public Album(int idAlbum, List<Foto> fotos) {
        if (idAlbum <= 0) {
            throw new IllegalArgumentException("ID do álbum deve ser positivo.");
        }
        if (fotos == null || fotos.isEmpty()) {
            throw new IllegalArgumentException("Lista de fotos não pode ser nula ou vazia.");
        }
        this.idAlbum = idAlbum;
        this.fotos = new ArrayList<>(fotos); // Cópia defensiva
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        if (idAlbum <= 0) {
            throw new IllegalArgumentException("ID do álbum deve ser positivo.");
        }
        this.idAlbum = idAlbum;
    }

    public List<Foto> getFotos() {
        return new ArrayList<>(fotos); // Retorna uma cópia para evitar modificações externas
    }

    public void setFotos(List<Foto> fotos) {
        if (fotos == null || fotos.isEmpty()) {
            throw new IllegalArgumentException("Lista de fotos não pode ser nula ou vazia.");
        }
        this.fotos = new ArrayList<>(fotos); // Cópia defensiva
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Date getDatainicio(){
        return new Date(dataInicio.getTime()); // Cópia defensiva
    }

    public void setDatainicio(Date datainicio) {
        if (dataInicio == null) {
            throw new IllegalArgumentException("Data de início não pode ser nula.");
        }
        this.dataInicio = new Date(dataInicio.getTime()); // Cópia defensiva
    }
    public Date getDatafinal(){
        return new Date(dataFinal.getTime()); // Cópia defensiva
    }

    public void setCliente(Date datafinal) {
        if (dataFinal == null) {
            throw new IllegalArgumentException("Data final não pode ser nula.");
        }
        this.dataFinal = new Date(dataFinal.getTime()); // Cópia defensiva
    }
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor não pode ser negativo.");
        }
        this.valor = valor;
    }
}
 