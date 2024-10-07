import java.time.LocalDate;
import java.time.Period;

public class Funcionario {
    protected String nome;
    protected LocalDate nasc; // Data de nascimento
    protected double salario;

    public Funcionario(String nome, LocalDate nasc, double salario) {
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;
    }

    public void informarSalario() {
        System.out.println("Salário: R$ " + salario);
    }

    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        return Period.between(nasc, hoje).getYears();
    }
}
