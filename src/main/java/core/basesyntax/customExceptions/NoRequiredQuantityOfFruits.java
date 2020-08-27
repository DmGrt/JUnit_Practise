package core.basesyntax.customExceptions;

public class NoRequiredQuantityOfFruits extends RuntimeException {
    public NoRequiredQuantityOfFruits(String message) {
        super(message);
    }
}
