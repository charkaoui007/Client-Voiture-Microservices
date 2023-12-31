package ma.emsi.Client;

import ma.emsi.Client.model.Client;
import ma.emsi.Client.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;


@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

	@Bean
	CommandLineRunner initialiserBaseH2 (ClientRepository clientRepository) {
		return args -> {
			clientRepository.save(new Client( "Rabab", "FAHSSI", Float.parseFloat("23")));
			clientRepository.save(new Client( "Houda", "EL KORAINI", Float.parseFloat("22")));
			clientRepository.save(new Client( "Saad", "BAKANZIZE", Float.parseFloat("22")));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

}
