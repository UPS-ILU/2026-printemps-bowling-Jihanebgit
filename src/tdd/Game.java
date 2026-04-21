package tdd;

public class Game {

	int score=0;
	
	void roll(int nbQuilles) {
		score+=nbQuilles;
	}
	
	int score() {
		return score;
	}
	
	void nbLancers(int nbQuilles, int n) {
		for (int i=0; i<n;i++) {
			roll(nbQuilles);
		}
	}
}
