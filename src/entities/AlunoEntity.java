package entities;

public class AlunoEntity {
    private Integer matricula;
    private String nome;

    public AlunoEntity(Integer matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
        public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
