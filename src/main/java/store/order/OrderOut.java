package store.order;

import java.util.List;

public record OrderOut(
        String id,
        List<ItemOut> items,
        Double preco) {
}