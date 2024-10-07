public class Gato extends Animal {

    // Construtor padrão
    public Gato() {
        super();
    }

    // Construtor com nome
    public Gato(String nome) {
        super(nome);
    }

    public void mia() {
        System.out.println(nome + " está miando.");
    }
}
