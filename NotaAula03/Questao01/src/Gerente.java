import java.time.LocalDate;

public class Gerente extends Funcionario {
    private String projeto;

    public Gerente(String nome, LocalDate nasc, double salario, String projeto) {
        super(nome, nasc, salario);
        this.projeto = projeto;
    }

    public void informarProjeto() {
        System.out.println("Projeto atual: " + projeto);
    }
}
