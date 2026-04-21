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

	void nbLancers(int nbQuilles, int n) {
		for (int i=0; i<n;i++) {
			game.roll(nbQuilles);
		}
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
	void test_spare() {
		game.roll(7);
		game.roll(3); //spare
		game.roll(4);
		nbLancers(0, 17);
		assertEquals(18, game.score());
	}
	
	@Test
	void test_strike() {
		game.roll(10);
		game.roll(3);
		game.roll(4);
		nbLancers(0, 16);
		assertEquals(24, game.score());
	}
	
	@Test
	void test_casGeneral() {
		game.roll(1);
		game.roll(2);
		game.roll(10);
		game.roll(0);
		game.roll(10);
		game.roll(4);
		game.roll(2);
		game.roll(0);
		game.roll(10);
		game.roll(6);
		game.roll(2);
		game.roll(0);
		game.roll(10);
		game.roll(6);
		game.roll(4);
		game.roll(8);
		game.roll(2);
		game.roll(2);
		game.roll(7);
		assertEquals(122, game.score());
	}
	
	

}
