package projetoConcessionaria.controller;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import projetoConcessionaria.model.Carro;

@RestController
public class CarroController {
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/carro")
	public Carro carro(
			@RequestParam(value="cor",defaultValue = "BRANCO" ) String cor,
			@RequestParam(value = "modelo",defaultValue = "Carro Generico") String modelo,
			@RequestParam(value = "tipo",defaultValue = "Tipo Generico")String tipo
			
			) {
		
		return new Carro(counter.incrementAndGet(), tipo, cor, modelo, LocalDate.now());
		
	}
}
