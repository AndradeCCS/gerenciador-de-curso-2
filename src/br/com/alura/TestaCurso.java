package br.com.alura;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaCollecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        //List<Aula> aulas = javaCollecoes.getAulas();
        //System.out.println(aulas);
        //aulas.add(new Aula("Trabalhando com ArrayList", 21));
        //System.out.println(aulas == javaCollecoes.getAulas());
        //System.out.println(aulas.equals(javaCollecoes.getAulas()));
        //javaCollecoes.getAulas().add(new Aula("Trabalhando com ArrayList",21));

        javaCollecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaCollecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaCollecoes.adiciona(new Aula("Modelando com coleções", 22));

        System.out.println(javaCollecoes.getAulas());






    }

}
