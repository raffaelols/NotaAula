public class Animal {
    protected String nome;
    protected String raca;

    // Construtor padrão
    public Animal() {
        this.nome = "Desconhecido";
        this.raca = "Desconhecida";
    }

    // Construtor com nome
    public Animal(String nome) {
        this.nome = nome;
        this.raca = "Desconhecida";
    }

    public void caminha() {
        System.out.println(nome + " está caminhando.");
    }
}
