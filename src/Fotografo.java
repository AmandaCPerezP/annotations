import java.util.List;
import java.util.ArrayList;

public class Fotografo extends Usuario {
    private List<Album> portfolio;

    public Fotografo(int idUsuario, String nome, String email, String senha, List<Album> portfolio) {
        super(idUsuario, nome, email, senha);

        if (portfolio == null) {
            throw new IllegalArgumentException("Portfólio não pode ser nulo.");
        }

        this.portfolio = new ArrayList<>(portfolio); // Cópia defensiva
    }

    public List<Album> getPortfolio() {
        return new ArrayList<>(portfolio); // Retorna uma cópia para evitar modificações externas
    }

    public void setPortfolio(List<Album> portfolio) {
        try {
            if (portfolio == null) {
                throw new IllegalArgumentException("Portfólio não pode ser nulo.");
            }
            this.portfolio = new ArrayList<>(portfolio); // Cópia defensiva
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao definir o portfólio: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }
    }
}
 
