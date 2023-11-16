package store.order;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("store-order")
public interface OrderController {
    @GetMapping("/")
    public List<OrderOut> list();

    @GetMapping("/{id}")
    public OrderOut get(@PathVariable(required = true) String id);

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(required = true) String id);

    @PostMapping("/")
    public ResponseEntity<Object> create(@RequestBody OrderIn in);
}