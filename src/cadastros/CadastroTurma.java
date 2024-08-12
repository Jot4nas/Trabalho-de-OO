package src.cadastros;
import src.app.Turma;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class CadastroTurma {
    private List<Turma> turmas;

    public CadastroTurma() {
        turmas = new ArrayList<>();
    }

    public boolean cadastrarTurma(Turma t) {
        return turmas.add(t);
    }

    public Turma pesquisarTurma(String codigoDaTurma) {
        for (Turma t : turmas) {
            if (t.getCodigoDaTurma().equalsIgnoreCase(codigoDaTurma)) {
                return t;
            }
        }
        return null;
    }

    public boolean removerTurma(Turma t) {
        return turmas.remove(t);
    }

    public boolean atualizarTurma(String codigoDaTurma, Turma novaTurma) {
        Turma turma = pesquisarTurma(codigoDaTurma);
        if (turma != null) {
            turmas.remove(turma);
            return turmas.add(novaTurma);
        }
        return false;
    }

    public void listarTurmas() {
        for (Turma turma : turmas) {
            JOptionPane.showMessageDialog(null, turma);
        }
    }
}