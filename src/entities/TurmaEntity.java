package entities;

import java.util.ArrayList;
import java.util.List;

public class TurmaEntity {
    private Integer codigo;
    private DisciplinaEntity disciplina;
    private ProfessorEntity professor;
    private List<AlunoEntity> alunos;
    private Integer capacidadeMaxima;

    public TurmaEntity(Integer codigo, DisciplinaEntity disciplina, ProfessorEntity professor, Integer capacidadeMaxima) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.capacidadeMaxima = capacidadeMaxima;
        this.alunos = new ArrayList<>();
    }

    public String addAluno(AlunoEntity aluno) {
        if (alunos.size() < capacidadeMaxima) {
            alunos.add(aluno);
            return "Aluno adicionado";
        } else {
            return "Turma cheia";
        }


}
    public boolean abrirTurma() {
        return !alunos.isEmpty();
    }

    public String gerarPauta() {
        StringBuilder pauta = new StringBuilder();
        pauta.append("Código da Turma: ").append(codigo).append("\n");
        pauta.append(disciplina.toString()).append("\n");
        pauta.append(professor.toString()).append("\n");
        pauta.append("Lista de Alunos Inscritos:\n");
        for (AlunoEntity aluno : alunos) {
            pauta.append(aluno.toString()).append("\n");
        }
        return pauta.toString();
    }
}
