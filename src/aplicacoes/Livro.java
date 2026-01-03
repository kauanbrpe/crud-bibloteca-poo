package aplicacoes;

import java.util.Objects;

public class Livro {

    private static int ultimoId=0;

    private int id;
    private String nome;
    private Autor autor;

    public Livro(String nome, Autor autor) {
        this.nome = nome;
        this.autor = autor;
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

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return id == livro.id && Objects.equals(nome, livro.nome) && Objects.equals(autor, livro.autor);
    }

    @Override
    public String toString() {
        return "Livro " + nome + " do autor " + autor;
    }
}
