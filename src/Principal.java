package src;

import javax.swing.JOptionPane;

import src.app.CampoEmBrancoException;
import src.app.DisciplinaNaoAtribuidaException;
import src.app.ProfessorNaoAtribuidoException;
import src.cadastros.CadastroAluno;
import src.cadastros.CadastroProfessor;
import src.cadastros.CadastroTurmas;
import src.cadastros.CadastroDisciplina;
import src.view.MenuAluno;
import src.view.MenuProfessor;
import src.view.MenuTurma;
import src.view.MenuPrincipal;
import src.view.MenuDisciplina;

public class Principal {

	static CadastroAluno cadAluno;
	static CadastroProfessor cadProfessor;
	static CadastroDisciplina cadDisciplina;
	static CadastroTurmas cadTurmas;
	
	public static void main(String[] args) throws ProfessorNaoAtribuidoException, CampoEmBrancoException, DisciplinaNaoAtribuidaException {	
		cadAluno = new CadastroAluno();
		cadProfessor = new CadastroProfessor();
		cadDisciplina = new CadastroDisciplina();
		cadTurmas = new CadastroTurmas();

		int opcao = 0; 
		
		do {
			opcao = MenuPrincipal.menuOpcoes(); 
			switch (opcao) {
				case 1: 
					MenuAluno.menuAluno(cadAluno); 
				break;

				case 2: 
					MenuProfessor.menuProfessor(cadProfessor);
				break;

				case 3: 
					MenuDisciplina.menuDisciplina(cadDisciplina);
				break;

				case 4: 
					MenuTurma.menuTurma(cadTurmas,cadProfessor,cadDisciplina, cadAluno);
				break;

				case 0: 
				break;
				
				default: 
					JOptionPane.showMessageDialog(null, "Opcao invalida");
					opcao = -1;
				break;
			}
		} while (opcao != 0);
		return;
	}


}
