package src.app;

public class CampoEmBrancoException extends Exception {
    public CampoEmBrancoException(String args) {
        super("O campo " + args + " não pode ficar em branco.");
    }
}
