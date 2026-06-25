
public class Livro {
    private int id;
    private String nome;
    private String categoria;
    private String autor;
    private Status status;

    public Livro(int id, String nome, String categoria, String autor, Status status) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.autor = autor;
        this.status = status;
    }

    public void avancarStatus() {
        switch (this.status) {
            case DISPONIVEL:
                this.status = Status.RESERVADO;
                break;
            case RESERVADO:
                this.status = Status.INDISPONIVEL;
                break;
            case INDISPONIVEL:
                this.status =Status.DISPONIVEL;
                break;

            default:
                System.out.println("Status inválido");
        }
    }
    public void cancelarReserva() {
        if (this.status == Status.RESERVADO) {
            this.status = Status.DISPONIVEL;
            System.out.println("Reserva cancelada com sucesso. O livro está disponível.");
        } else {
            System.out.println("Não é possível cancelar: o livro não está reservado.");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
