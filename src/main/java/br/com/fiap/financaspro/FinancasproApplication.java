package br.com.fiap.financaspro;
	
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller //requisições de web serão atendidas por ele
public class FinancasproApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancasproApplication.class, args);
	}

	@RequestMapping //requisição para que esse método seja executado
	@ResponseBody
	public String home() {
		return "Finanças Pro";
	}

}
