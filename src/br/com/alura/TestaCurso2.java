package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
       Curso javaCollecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaCollecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaCollecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaCollecoes.adiciona(new Aula("Modelando com coleções", 24));

        System.out.println(javaCollecoes.getAulas());

        List<Aula> aulasImutáveis = javaCollecoes.getAulas();

        List<Aula> aulas = new ArrayList<>(aulasImutáveis);

        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println("========================");
        System.out.println(javaCollecoes.getTempoTotal());

        System.out.println(javaCollecoes.toString());
    }
}
