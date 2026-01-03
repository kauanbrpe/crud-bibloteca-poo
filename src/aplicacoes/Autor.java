package aplicacoes;

public class Autor {

    private static int ultimoId=0;

    private int id;
    private String nome;

    public Autor(String nome) {
        this.nome = nome;
        this.id = ++ultimoId;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
