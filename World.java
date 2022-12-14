package World;

public class World {
	
	public void gettime() {
	//gives time of world
	}
	public void getweather() {
		//gives current weather
		}
	public void getLocation() {
		//gives location
		}
	
	int time ;
	String weather, loaction ; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}

class chars extends World {
	public void getPosition() {
		//gives position
		}
	public void speak() {
		//lets player speak
		}
	public void walk() {
		//walks in a direction
		}
	public void attack() {
		//gives position
		}
	public void die() {
		//kills player
		}
	public void isalive() {
		//tells if player is alive
		}
}

class player extends chars {
	public void getItem() {
		//gets items
		}
	public void levelUp() {
		//goes up level
		}
	public void useItem() {
		//walks in a direction
		}
}

class nonPlayer extends chars {

	public void reproduce() {
		//walks in a direction
		}
	public void giveQuest() {
		//walks in a direction
		}
	public void giveExp() {
		//walks in a direction
		}
}

