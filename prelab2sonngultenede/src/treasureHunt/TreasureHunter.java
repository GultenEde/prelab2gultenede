package treasureHunt;
import java.util.Random;
public class TreasureHunter {
	private static final Random RAND= new Random(2024);
	private String name;
	private String excuse;
	
	
	public TreasureHunter(String name, String excuse) {
		this.excuse=excuse;
		this.name=name;
	}
	
	public static void inquire(String question, TreasureHunter treasureHunter) {
		System.out.print("Explorer:"+question);
		System.out.println(" ");
		System.out.print("Treasure Hunter "+ treasureHunter.name +"response:"+ treasureHunter.excuse);
		System.out.println(" ");
		boolean sonuc = RAND.nextBoolean();
		if (sonuc) {
			System.out.println("Treasure Hunter "+treasureHunter.name+"is guilty.");
			
		}else {
			System.out.println("Treasure Hunter "+treasureHunter.name+"is innocent.");
		}
		
	}
	public String getName() {
		return name;
	}

	public String getExcuse() {
		return excuse;
	}

}
