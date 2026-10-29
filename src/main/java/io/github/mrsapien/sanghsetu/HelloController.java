package io.github.mrsapien.sanghsetu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class HelloController {
    private final GreetingProperties props;
    public HelloController(GreetingProperties props) {
        this.props = props;
    }
    @GetMapping("/hello")
    Map<String, String> hello() {
        return Map.of("message", props.message(), "environment", props.environment());
    }
}
