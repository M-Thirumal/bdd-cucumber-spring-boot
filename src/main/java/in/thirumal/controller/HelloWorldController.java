/**
 * 
 */
package in.thirumal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Thirumal
 *
 */
@RestController
public class HelloWorldController {

	@GetMapping("/hello")
    public String getHello() {
        return "Hello World";
    }
	
}
