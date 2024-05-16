package com.example.aluracursos.ScreenMatch;

import com.example.aluracursos.ScreenMatch.service.ConsumoAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenMatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi=new ConsumoAPI();
		var json = consumoApi.obtenerDatos("http://www.omdbapi.com/?t=rick+and+morty&apikey=33fb69eb");
		System.out.println(json);
	}
}
