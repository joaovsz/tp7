package entities;

public class DisciplinaEntity {
    private Integer codigo;
    private String nome;

    public DisciplinaEntity(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Disciplina: " + nome;
    }
}
