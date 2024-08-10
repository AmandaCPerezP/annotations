import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {
    private List<Contratacao> historicoContratacoes;

    public Cliente(int idUsuario, String nome, String email, String senha, List<Contratacao> historicoContratacoes) {
        super(idUsuario, nome, email, senha);
        if (historicoContratacoes == null) {
            throw new IllegalArgumentException("Histórico de contratações não pode ser nulo.");
        }
        this.historicoContratacoes = new ArrayList<>(historicoContratacoes);// Defensivo contra modificações externas
    }

    public List<Contratacao> getHistoricoContratacoes() {
        return new ArrayList<>(historicoContratacoes); // Retorna uma cópia para evitar modificações externas
    }

    public void setHistoricoContratacoes(List<Contratacao> historicoContratacoes) {
        try {
            if (historicoContratacoes == null) {
                throw new IllegalArgumentException("Histórico de contratações não pode ser nulo.");
            }
            this.historicoContratacoes = new ArrayList<>(historicoContratacoes);
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao definir o histórico de contratações: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }
    }
}
