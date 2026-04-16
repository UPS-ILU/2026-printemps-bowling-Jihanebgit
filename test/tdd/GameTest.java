package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {

	Game game;
	@BeforeEach
	void setup() {
		game=new Game();
	}
	
	@Test
	void test_Niveau1() {
		//vide
		assertEquals(0, game.score());
		
		//20 roll de 0
		game.nbLancers(20, 0);
		assertEquals(0, game.score());
		
		//20 roll de 1
		game.nbLancers(20, 1);
		assertEquals(20, game.score());
		
		//nouveau jeu
		game.score=0;
		
		//10 roll de 1 + 10 roll de 2
		game.nbLancers(10, 1);
		game.nbLancers(10, 2);
		
		assertEquals(30, game.score());
		
	}
	
	@Test
	void test_spare() {
		//spare
		game.nbLancers(1,7);
		game.nbLancers(1,3);
		//bonus
		game.spare(4);
		//autres tour
		game.nbLancers(17,0);
		assertEquals(18, game.score());
	}
	

	

}
