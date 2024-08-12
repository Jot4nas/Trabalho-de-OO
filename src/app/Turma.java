package src.app;

import java.util.List;
import java.util.ArrayList;

public class Turma {
    private String codigoDaTurma;
    private Disciplina nomeDaDisciplina;
    private Professor professor;
    private List<Aluno> alunos;

    public Turma (String codigoDaTurma, Disciplina nomeDaDisciplina, Professor professor) {
        this.codigoDaTurma = codigoDaTurma;
        this.nomeDaDisciplina = nomeDaDisciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public String getCodigoDaTurma() {
        return codigoDaTurma;
    }

    public Disciplina getNomeDaDisciplina() {
        return nomeDaDisciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Código da Turma: ").append(codigoDaTurma).append('\n');
        sb.append("Disciplina: ").append(nomeDaDisciplina.getnomeDaDisciplina()).append('\n');
        sb.append("Professor: ").append(professor.getNome()).append('\n');
        sb.append("Alunos:\n");
        for (Aluno aluno : alunos) {
            sb.append(" - Matricula: ").append(aluno.getMatricula()).append(", Nome: ").append(aluno.getNome()).append('\n');
        }
        return sb.toString();
    }
}