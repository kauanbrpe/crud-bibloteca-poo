import aplicacoes.Autor;
import aplicacoes.Biblioteca;
import aplicacoes.Livro;

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Machado de Assis");
        Autor autor2 = new Autor("Ariano Suassuna");
        Livro livro1 = new Livro("Memórias Postúmas de Brás Cubas", autor1);
        Livro livro2 = new Livro("Auto da Compadecida", autor2);
        Livro livro3 = new Livro("Dom Casmurro", autor1);
        Biblioteca b1 = new Biblioteca("Mons. Romeu da Fonte", "Torre");

        b1.adicionarLivro(livro1);
        b1.adicionarLivro(livro2);
        System.out.println("=================================");
        b1.verLivrosCadastrados();
        System.out.println("=================================");
        b1.removerLivro(livro2);
        System.out.println("=================================");
        b1.verLivrosCadastrados();
        System.out.println("=================================");
        b1.adicionarLivro(livro1);
        b1.removerLivro(livro2);
        System.out.println("=================================");
        b1.verLivrosCadastrados();
    }
}