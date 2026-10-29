package io.github.mrsapien.sanghsetu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {
    @GetMapping("/hello")
    String hello() {
        return props.message();
    }
    private final GreetingProperties props;
    public HelloController(GreetingProperties props) {
        this.props = props;
    }
}
