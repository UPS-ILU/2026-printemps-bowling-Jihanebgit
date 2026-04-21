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
	void test_cas_vide() {
		assertEquals(0, game.score());
	}
	@Test
	void test_toutZero() {
		//cas 20 lancers de 0
		nbLancers(0, 20);
		assertEquals(0, game.score());
	}
	
	@Test
	void test_toutUn() {
		//cas 20 lancers de 1
		nbLancers(1, 20);
		assertEquals(20, game.score());
	}

	
	@Test
	void test_plusieurs_lancers() {
		//cas 10 lancers de 1 et 10 lancers de 2
		nbLancers(1, 10);
		nbLancers(2, 10);
		assertEquals(30, game.score());
	}
		
	
	@Test
	void test_Niveau2() {
		game.roll(7);
		game.roll(3); //spare
		game.roll(4);
		nbLancers(0, 17);
		assertEquals(18, game.score());
	}
	
	
	
	
	void nbLancers(int nbQuilles, int n) {
		for (int i=0; i<n;i++) {
			game.roll(nbQuilles);
		}
	}

}
