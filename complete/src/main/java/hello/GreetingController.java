package hello;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GreetingController {
    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    String getName(@PathVariable String name) {
        return ("Hello " + name);
    }
}
