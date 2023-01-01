package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {
    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");
        alunos.add("Nico");

        System.out.println("Imprimindo com ForEach");
        for (String aluno: alunos
             ) {
            System.out.println(aluno);
        }
        System.out.println("==================");
        System.out.println("Imprimindo com ForEach e lambda");
        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });
    }
}
