public class App {
    public static void main(String[] args) {
        Class<?> clazz = UsandoTabela.tabela.class;

        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = clazz.getAnnotation(Tabela.class);
            System.out.println("Nome da Tabela: " + tabela.valor());
        }

        UsandoTabela.usarTabela(UsandoTabela.tabela.class);
    }
}
