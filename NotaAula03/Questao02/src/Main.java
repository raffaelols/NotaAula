public class Main {
    public static void main(String[] args) {
        // Criando um cachorro
        Cachorro cachorro = new Cachorro("Pit");
        cachorro.caminha();
        cachorro.late();

        // Criando um gato
        Gato gato = new Gato("Balu");
        gato.caminha();
        gato.mia();
    }
}
