package entities;

public class ProfessorEntity {
    private Integer matricula;
    private String nome;
    public ProfessorEntity(String nome, Integer matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    @Override
    public String toString() {
        return "Professor: " + nome + " - ID: " + matricula;
    }
}
