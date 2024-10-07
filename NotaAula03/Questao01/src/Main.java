import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando um Gerente
        Gerente gerente = new Gerente("Roberto Souza", LocalDate.of(1982, 12, 3), 10500.00, "Projeto de Expansão Internacional");
        System.out.println("Gerente:");
        System.out.println("Nome: " + gerente.nome);
        System.out.println("Idade: " + gerente.calcularIdade() + " anos");
        gerente.informarSalario();
        gerente.informarProjeto();

        // Criando um Programador
        Programador programador = new Programador("Juliana Mendes", LocalDate.of(1995, 4, 15), 7200.00, "C#");
        System.out.println("\nProgramador:");
        System.out.println("Nome: " + programador.nome);
        System.out.println("Idade: " + programador.calcularIdade() + " anos");
        programador.informarSalario();
        programador.informarLinguagem();
    }
}
