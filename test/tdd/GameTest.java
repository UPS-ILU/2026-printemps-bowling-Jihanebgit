package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {

	Game game;
	
	@BeforeEach
	void setUp() throws Exception {
		game= new Game();
	}

	@Test
	void test_Niveau1() {
		assertEquals(0, game.score());
		
		//cas 20 lancers de 0
		game.nbLancers(0, 20);
		assertEquals(0, game.score());
		
		//cas 20 lancers de 1
		game.nbLancers(1, 20);
		assertEquals(20, game.score());
		
		//cas 10 lancers de 1 et 10 lancers de 2
		game.score=0;
		game.nbLancers(1, 10);
		game.nbLancers(2, 10);
		assertEquals(30, game.score());
		
	}

}
