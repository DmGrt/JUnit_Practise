package core.basesyntax.customExceptions;

public class BadFileFormatting extends RuntimeException {
    public BadFileFormatting(String message) {
        super(message);
    }
}
