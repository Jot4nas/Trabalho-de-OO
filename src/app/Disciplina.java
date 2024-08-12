package src.app;

public class Disciplina {
    private String nomeDaDisciplina,
                   professor,
                   codigoDaDisciplina;

    public Disciplina(String nomeDaDisciplina, String professor,  String codigoDaDisciplina) {
        this.nomeDaDisciplina = nomeDaDisciplina;
        this.professor = professor;
        this.codigoDaDisciplina = codigoDaDisciplina;
    }
    
    public String getnomeDaDisciplina() {
        return nomeDaDisciplina;
    }

    public String getProfessor() {
        return professor;
    }

    public String getcodigoDaDisciplina() {
        return codigoDaDisciplina;
    }

    public String toString() {
        String resposta;
        resposta = "NOME DA DISCIPLINA: " + nomeDaDisciplina + '\n';
        resposta += "PROFESSOR: " + professor + '\n';
        resposta += "CODIGO DA TURMA: " + codigoDaDisciplina + '\n';
        return resposta;
    }
}