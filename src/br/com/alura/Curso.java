package br.com.alura;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {
    //tempoTotal poderia ser atributo
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<Aula>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public List<Aula> getAulas() {
        //Collections.unmodifiableList cria uma segurança no código, cópia defensiva, imutável
        return Collections.unmodifiableList(aulas);
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    /*
    public int getTempoTotal() {
        int tempoTotal = 0;
        for (Aula aula : aulas) {
            tempoTotal += aula.getTempo();
        }
        return tempoTotal;
    }
    */
     public int getTempoTotal() {
         return this.aulas.stream()
                 .mapToInt(Aula:: getTempo)
                 .sum();
     }

    @Override
    public String toString() {
        return "[Curso: " + nome + ", Tempo Total: " + this.getTempoTotal()
                + " aulas: "+ this.aulas + "]";
    }
}
