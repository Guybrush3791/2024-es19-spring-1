package org.java.spring_boot_test1;

import org.java.spring_boot_test1.testClass.Square;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTest1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTest1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Square s1 = new Square(5);
		System.out.println(s1);

		// TODO:
		// implementare la classe Rectangle con getArea e getPerimetro all'interno
		// di un sotto-package della classe principale
		// testare la classe Rectangle
	}
}
