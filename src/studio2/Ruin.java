package studio2;

public class Ruin {

	public static void main(String[] args) {
		int startAmount = 50;
		double winChance = 0.5;
		double winLimit = 100;
		int money;
		money = startAmount;
		int totalSimulations = 20;
		int days = 1;
		int plays = 0;

		while(days <= totalSimulations) {
			plays++;
			if (money > 0 && money < winLimit) {
				double random = Math.random();
				if(random <= winChance) {
					money++;
				} else {
					money--;
				}
			} else if (money == 0) {
				System.out.println("You Lost! :(");
				System.out.println("Day: " + days);
				System.out.println("Plays: " + plays);
				plays = 0;
				money = startAmount;
				days++;
			} else if (money == winLimit) {
				System.out.println("You Won!");
				System.out.println("Day: " + days);
				System.out.println("Plays: " + plays);
				plays = 0;
				days = totalSimulations + 1;
			}
		}
	}
}


