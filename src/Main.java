import entities.AlunoEntity;
import entities.DisciplinaEntity;
import entities.ProfessorEntity;
import entities.TurmaEntity;

public class Main {
    public static void main(String[] args) {
        ProfessorEntity prof = new ProfessorEntity("Elberth Sulliman", 123);
        DisciplinaEntity disciplina = new DisciplinaEntity(1,"Engenharia de Requisitos");
        TurmaEntity turma = new TurmaEntity(1, disciplina, prof, 5);

        AlunoEntity aluno1 = new AlunoEntity(111,"Kleber Kauan" );
        AlunoEntity aluno2 = new AlunoEntity(232,"Carlos Eduardo Silva");

        System.out.println(turma.abrirTurma()?"Turma aberta":"Turma com alunos insuficientes");

        turma.addAluno(aluno1);
        turma.addAluno(aluno2);

        System.out.println(turma.abrirTurma()?"Turma aberta":"Turma com alunos insuficientes");
        System.out.println(turma.gerarPauta());

    }
}