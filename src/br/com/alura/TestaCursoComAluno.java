package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaCollecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaCollecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaCollecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaCollecoes.adiciona(new Aula("Modelando com coleções", 22));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaCollecoes.matricula(a1);
        javaCollecoes.matricula(a2);
        javaCollecoes.matricula(a3);

        System.out.println("Todos os alunos Matriculados: ");
        javaCollecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno.toString());
        });

        System.out.println("=====================");
        System.out.println("O aluno " +a1+ " está matriculado");
        System.out.println(javaCollecoes.estaMatriculado(a1));

        Aluno turini = new Aluno("Rodrigo Turini", 34672);
        System.out.println("==================");
        System.out.println("E esse Turini está matriculado?");
        System.out.println(javaCollecoes.estaMatriculado(turini));
        System.out.println("Utilizando equals");
        System.out.println(a1.equals(turini));

        System.out.println("================");
        System.out.println("Validando HashCode, sempre mudar o hashCode, quando mudar (@Override) o equals");
        System.out.println(a1.hashCode() == turini.hashCode());

        System.out.println("===============");
        System.out.println("Usado em Legado");
        System.out.println("===============");
        System.out.println("Usando Iterator");
        Set<Aluno> alunos = javaCollecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();
        while(iterador.hasNext()){
            Aluno proximo = iterador.next();
            System.out.println(proximo);
        }

        System.out.println("=============");
        System.out.println("Usando Vector");
        Vector<Aluno> vetor = new Vector<>();

    }
}
