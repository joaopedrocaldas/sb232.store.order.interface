package store.order;

import store.product.ProductOut;

public record ItemOut(
        String id,
        ProductOut product,
        Integer quantia,
        Double price,
        Double total) {
}
