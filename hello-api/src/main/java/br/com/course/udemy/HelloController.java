package br.com.course.udemy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {

    @RequestMapping(value = "/hello{nome}", method = RequestMethod.GET)
    @ResponseBody
    public String helloWorld(@RequestParam("nome") String nomeCliente){
        return String.format("Hello %s ", nomeCliente);
    }
}
