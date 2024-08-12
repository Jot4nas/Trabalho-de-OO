package src.cadastros;

import src.app.Disciplina;
import java.util.ArrayList;
import java.util.List;

public class CadastroDisciplina {
    private List<Disciplina> disciplinas;

    public CadastroDisciplina() {
        disciplinas = new ArrayList<>();
    }

    public boolean cadastrarDisciplina(Disciplina d) {
        return disciplinas.add(d);
    }

    public Disciplina pesquisarDisciplina(String codigoDaDisciplina) {
        for (Disciplina d : disciplinas) {
            if (d.getcodigoDaDisciplina().equalsIgnoreCase(codigoDaDisciplina)) {
                return d;
            }
        }
        return null;
    }

    public boolean removerDisciplina(Disciplina d) {
        return disciplinas.remove(d);
    }

    public boolean atualizarDisciplina(String codigoDaDisciplina, Disciplina novaDisciplina) {
        Disciplina disciplina = pesquisarDisciplina(codigoDaDisciplina);
        if (disciplina != null) {
            disciplinas.remove(disciplina);
            return disciplinas.add(novaDisciplina);
        }
        return false;
    }
}