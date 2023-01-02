package br.com.alura;

public class TestaBuscaAlunosNoCurso {
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

        System.out.println("Quem é o aluno com matricula 5617");
        Aluno aluno = javaCollecoes.buscaMatriculado(56170);
        System.out.println("Aluno: " +aluno);

    }
}
