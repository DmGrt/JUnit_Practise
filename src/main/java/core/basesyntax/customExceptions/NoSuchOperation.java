package core.basesyntax.customExceptions;

public class NoSuchOperation extends RuntimeException {
    public NoSuchOperation(String message) {
        super(message);
    }
}
