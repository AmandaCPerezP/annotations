import java.util.Date;

public class Foto {
    private int idFoto;
    private Cliente cliente;
    private String url;
    private Date dataUpload;
    private String descricao;

    public Foto(int idFoto, String url, Date dataUpload, String descricao) {
        if (idFoto <= 0) {
            throw new IllegalArgumentException("ID da foto deve ser positivo.");
        }
        if (url == null || url.isEmpty()) {
            throw new IllegalArgumentException("URL não pode ser nula ou vazia.");
        }
        if (dataUpload == null) {
            throw new IllegalArgumentException("Data de upload não pode ser nula.");
        }
        if (descricao == null || descricao.isEmpty()) {
            throw new IllegalArgumentException("Descrição não pode ser nula ou vazia.");
        }


        this.idFoto = idFoto;
        this.url = url;
        this.dataUpload = dataUpload;
        this.descricao = descricao;
    }

    public int getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(int idFoto) {
        try {
            if (idFoto <= 0) {
                throw new IllegalArgumentException("ID da foto deve ser positivo.");
            }
            this.idFoto = idFoto;
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao definir o ID da foto: " + e.getMessage());
        }
    }
    

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        if (url == null || url.isEmpty()) {
            throw new IllegalArgumentException("URL não pode ser nula ou vazia.");
        }
        this.url = url;
    }

    public Date getDataUpload() {
        return new Date(dataUpload.getTime()); // Cópia defensiva
    }

    public void setDataUpload(Date dataUpload) {
        if (dataUpload == null) {
            throw new IllegalArgumentException("Data de upload não pode ser nula.");
        }
        this.dataUpload = new Date(dataUpload.getTime()); // Cópia defensiva
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.isEmpty()) {
            throw new IllegalArgumentException("Descrição não pode ser nula ou vazia.");
        }
        this.descricao = descricao;
    }

}