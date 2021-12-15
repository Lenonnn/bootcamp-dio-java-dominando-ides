package br.com.dio;

import br.com.dio.model.Gato;

// ctrl + SHIFT + /  PARA COMENTAR OU DESCOMENTAR
// ctrl + ALT + O    PARA APAGAR IMPORTS NÃO USADOS
// ALT + ENTER       PARA FAZER AUTO IMPORT
// ctrl + Y          PARA deletar linha
// ctrl + D          PARA duplicar linha
// ctrl + alt + L    PARA identação de código
// ctrl + shift + seta PARA Mover linha

public class PrimeiroPrograma {

    public static void main(String[] args) {

        Gato gato = new Gato();

        System.out.println(gato);

        Livro livro1 = new Livro("Os três mosqueteiros",300);
        Livro livro2 = new Livro("Minha primeria viagem",280);
        Livro livro3 = new Livro("Minha primeira Visita",500);

        System.out.println(livro1 + "\n" + livro2 + "\n" + livro3);

        /*
        int a = 5;
        int b = 3;
        System.out.println("Hello World " + ( a + b )) ;
        */
    }
}

class  Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}

