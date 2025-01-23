package com.hari.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hari.spring.game.GameRunner;
import com.hari.spring.game.GamingConsole;
import com.hari.spring.game.MarioGame;
import com.hari.spring.game.PacmanGame;
import com.hari.spring.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		// MarioGame game = new MarioGame();
		// SuperContraGame game = new SuperContraGame();

		// GamingConsole game = new PacmanGame();// new MarioGame();
		
		// GameRunner runner = new GameRunner(game);

		GameRunner runner = context.getBean(GameRunner.class);

		runner.run();
	}

}
