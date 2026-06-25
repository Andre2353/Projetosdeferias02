public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro(1, "O Senhor dos Anéis", "Fantasia", " Tolkien", Status.DISPONIVEL);

        System.out.println("livro criado " + livro.getStatus());

        livro.avancarStatus();
        System.out.println("status atualizado " + livro.getStatus());

        livro.avancarStatus();
        System.out.println("status atualizado " + livro.getStatus());

        livro.cancelarReserva();

        System.out.println("status final " + livro.getStatus());
    }
}