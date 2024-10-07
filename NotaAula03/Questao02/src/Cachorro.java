public class Cachorro extends Animal {

    // Construtor padrão
    public Cachorro() {
        super();
    }

    // Construtor com nome
    public Cachorro(String nome) {
        super(nome);
    }

    public void late() {
        System.out.println(nome + " está latindo.");
    }
}
