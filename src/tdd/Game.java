package tdd;

public class Game {

	int score=0;
	//chaque fois que le joueur lance boule appel
	void roll(int nbQuilles) {
		score+=nbQuilles;
	}
	
	//score total partie 
	int score() {
		return score;
	}
	
	void nbLancers(int nbLancers, int nbQuilles) {
		for (int i=0; i<nbLancers; i++) {
			roll(nbQuilles);
		}
	}
	
	void spare(int nbQuilles) {
		score+=2*nbQuilles;
	}
	
	void strike(int nbQuillesTour1, int nbQuillesTour2) {
		score+=2*nbQuillesTour1+2*nbQuillesTour2;
	}
	
}
