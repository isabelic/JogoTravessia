package exception;

import java.util.InputMismatchException;

public class EntradaInvalida extends InputMismatchException {
    public EntradaInvalida() {
        super("Entrada inválida.");
    }
}
