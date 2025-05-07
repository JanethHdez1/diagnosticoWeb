package utez.edu.mx.diagnosticoBack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DiagnosticoBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiagnosticoBackApplication.class, args);
	}

}

@RestController
class HelloController {

    @CrossOrigin(origins = "*")
    @GetMapping("/api")
    public String retorno() {
        return "Hola desde mi backend";
    }
}
