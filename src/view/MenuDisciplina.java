package src.view;

import javax.swing.JOptionPane;
import src.app.Disciplina;
import src.cadastros.CadastroDisciplina;

public class MenuDisciplina {

    public static Disciplina dadosNovaDisciplina() {
        String nome = lerNome();
        String professor = lerProfessor();
        String codigoDaDisciplina = lerCodigo();
        return new Disciplina(nome, professor, codigoDaDisciplina);
    }
    
    private static String lerNome() {
        return JOptionPane.showInputDialog("Informe o nome da disciplina: ");
    }
    
    private static String lerProfessor() {
        return JOptionPane.showInputDialog("Informe o professor da disciplina: ");
    }

    private static String lerCodigo() {
        return JOptionPane.showInputDialog("Informe o código da disciplina: ");
    }

    public static void menuDisciplina(CadastroDisciplina cadDisciplina) {
        String txt = "Informe a opção desejada \n"
                + "1 - Cadastrar disciplina\n"
                + "2 - Pesquisar disciplina\n"
                + "3 - Atualizar disciplina\n"
                + "4 - Remover disciplina\n"
                + "0 - Voltar para menu anterior";

        int opcao = -1;
        do {
            String strOpcao = JOptionPane.showInputDialog(txt);
            opcao = Integer.parseInt(strOpcao);

            switch (opcao) {
                case 1:
                    Disciplina novaDisciplina = dadosNovaDisciplina();
                    cadDisciplina.cadastrarDisciplina(novaDisciplina);
                    break;

                case 2:
                    String codigo = lerCodigo();
                    Disciplina d = cadDisciplina.pesquisarDisciplina(codigo);

                    if (codigo != null) {
                        if (d != null) {
                            JOptionPane.showMessageDialog(null, d.toString());
                        } else {
                            JOptionPane.showMessageDialog(null, "Disciplina não encontrada.");
                        }
                    }
                    break;

                case 3:
                    codigo = lerCodigo();
                    Disciplina novaCadastro = dadosNovaDisciplina();
                    boolean atualizado = cadDisciplina.atualizarDisciplina(codigo, novaCadastro);

                    if (codigo != null) {
                        if (atualizado) {
                            JOptionPane.showMessageDialog(null, "Cadastro atualizado.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Falha ao atualizar cadastro.");
                        }
                    }
                    break;

                case 4:
                    codigo = lerCodigo();
                    Disciplina remover = cadDisciplina.pesquisarDisciplina(codigo);
                    boolean removido = cadDisciplina.removerDisciplina(remover);

                    if (codigo != null) { 
                        if (remover != null) {
                            if (removido) {
                                JOptionPane.showMessageDialog(null, "Disciplina removida do cadastro");
                            } else {
                                JOptionPane.showMessageDialog(null, "Falha ao remover disciplina.");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Disciplina não encontrada.");
                        }
                    }
                    break;

                default:
                    break;
            }
        } while (opcao != 0);
    }
}