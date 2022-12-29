package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
    public static void main(String[] args) {
        Aula a1 = new Aula("revisitando as ArrayList", 21);
        Aula a2 = new Aula("Listas de Objetos", 20);
        Aula a3 = new Aula("Relacionamento de Listas e Objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        //aulas.add(new Aula("teste", 10));

        System.out.println(aulas.toString());

        Collections.sort(aulas);
        System.out.println(aulas.toString());

        //comparando por tempo.
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println(aulas.toString());

        //possui um método sort
        aulas.sort(Comparator.comparing(Aula::getTempo));

    }
}
