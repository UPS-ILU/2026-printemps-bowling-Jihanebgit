package tdd;

public class Game {
	int nbLancerTotal=21;
	int rolls[]=new int[nbLancerTotal];
	int indiceLancers=0;
	
	void roll(int nbQuilles) {
		rolls[indiceLancers++]=nbQuilles;
	}
	
	int score() {
		int score=0;
		int i=0;
		for (int frame=0; frame < (nbLancerTotal/2) ;frame++) {
			if (rolls[i]==10) { //strike
				score+=10+rolls[i+1]+rolls[i+2];
				i+=1;
			}else if(rolls[i]+rolls[i+1]==10){ //spare
				score+= 10 +rolls[i+2];
				i+=2;
			}
			else{
				score+=rolls[i]+rolls[i+1];
				i+=2;
			}
		}
		return score;
	
	}
}
