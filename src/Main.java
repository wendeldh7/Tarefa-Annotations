import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Class<Cliente> clienteClass = Cliente.class;

        if (clienteClass.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = clienteClass.getAnnotation(Tabela.class);
            String nomeTabela = tabela.value();
            System.out.println("Nome da tabela: " + nomeTabela);
        } else {
            System.out.println("A classe Cliente não está anotada com @Tabela.");
        }
    }
}