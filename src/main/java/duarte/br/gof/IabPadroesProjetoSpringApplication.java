package duarte.br.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class IabPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(IabPadroesProjetoSpringApplication.class, args);
	}

}
