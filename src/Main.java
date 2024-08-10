import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try{
            // Criando uma instância da classe Cliente e da classe Fotografo
            Cliente cliente = new Cliente(1, "João", "joao@gmail.com", "123456", new ArrayList<>());
            Fotografo fotografo = new Fotografo(1, "Maria", "maria@gmail.com", "654321", new ArrayList<>());
            
            // Criando uma instância da classe Contratacao
            Contratacao contratacao = new Contratacao(1, cliente, fotografo, new Date(), "Parque", "Retratos");

            // Acessando os atributos da contratação
            int idContratacao = contratacao.getIdContratacao();
            Cliente clienteContratacao = contratacao.getCliente();
            Fotografo fotografoContratacao = contratacao.getFotografo();
            Date data = contratacao.getData();
            String local = contratacao.getLocal();
            String estiloFotografia = contratacao.getEstiloFotografia();

            // Imprimindo os dados da contratação
            System.out.println("ID da Contratação: " + idContratacao);
            System.out.println("Cliente: " + clienteContratacao.getNome());
            System.out.println("Fotógrafo: " + fotografoContratacao.getNome());
            System.out.println("Data: " + data);
            System.out.println("Local: " + local);
            System.out.println("Estilo de Fotografia: " + estiloFotografia);
        } catch (NullPointerException e) {
            System.err.println("Erro: Um dos objetos não foi inicializado corretamente.");
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: Argumento inválido passado ao criar a contratação.");
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }

    }
}
