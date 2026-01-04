package aplicacoes;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private static int ultimoId=0;

    private int id;
    private String nome;
    private String local;
    private List<Livro> livros = new ArrayList<>();

    public Biblioteca(String nome, String local) {
        this.nome = nome;
        this.local = local;
        this.id = ++ultimoId;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void adicionarLivro(Livro livro){
        if (livros.contains(livro)) {
            System.out.println("Livro não adicionado!");
            return;
        }

        livros.add(livro);
        System.out.println(livro + " adicionado com sucesso!");
    }

    public void removerLivro(Livro livro){
        if (livros.isEmpty()){
            System.out.println("Você não tem livros cadastrados");
            return;
        } else if (!livros.contains(livro)){
            System.out.println("Esse livro não existe!");
            return;
        }

        livros.remove(livro);
        System.out.println(livro + " removido com sucesso!");
    }

    public void verLivrosCadastrados(){
        if (livros.isEmpty()){
            System.out.println("Você não tem livros cadastrados");
            return;
        }

        System.out.println("Livros cadastrados: ");
        for (int i = 0; i < livros.size(); i++){
            System.out.println("[" + (i+1) + "] " + livros.get(i));
        }

        System.out.println("Fim da lista");
    }

    public void atualizarLivros(int id, String nome){
        if (livros.isEmpty()){
            System.out.println("Você não tem livros cadastrados!");
            return;
        }

        System.out.println("Livros cadastrados: ");
        for (int i = 0; i < livros.size(); i++){
            System.out.println("[" + (i+1) + "] " + livros.get(i));
        }

        for (Livro livro : livros){
            if (livro.getId() == id){
                livro.setNome(nome);
                System.out.println("Livro atualizado: " + livro);
                return;
            };
        }
    }
}
