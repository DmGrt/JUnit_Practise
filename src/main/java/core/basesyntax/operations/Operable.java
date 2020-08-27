package core.basesyntax.operations;

import core.basesyntax.entries.FruitPack;
import core.basesyntax.entries.Order;
import java.util.List;

public interface Operable {
    List<FruitPack> perform(Order order, List<FruitPack> totalPacks);
}
