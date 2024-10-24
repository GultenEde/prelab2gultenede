package treasureHunt;

public class TreasureLocation {
	private String location;
	private String[] clues;
	private int numOfClues;
	private static final int MAX_CLUES= 5 ;
	
	
	public TreasureLocation(String location) {
		this.location=location;
		clues = new String[MAX_CLUES];
		
	}
	
	public void addClue(String clue) {
		if (numOfClues < MAX_CLUES) {
			
            clues[numOfClues] = clue;
            numOfClues=numOfClues+1;
            
        } else  {
            System.out.println("Clue limit reached for this location.");
            System.out.println("Cannot add more quests. Maximum limit reached.");
            System.out.println(" ");
            System.out.println("--------------------- New Quest -------------------");
            System.out.println(" ");
        }
		
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String[] getClues() {
		return clues;
	}

	public void setClues(String[] clues) {
		this.clues = clues;
	}

	public int getNumOfClues() {
		return numOfClues;
	}

	public void setNumOfClues(int numOfClues) {
		this.numOfClues = numOfClues;
	}

	public static int getMaxClues() {
		return MAX_CLUES;
	}

	public void displayLocation() {
		System.out.println("Treasure Location: " + location);
        System.out.println("Clues:" );
        
        if (numOfClues>0) {
        	for (String clue : clues) {
        		if (clue != null ){     			
        			System.out.println("-"+clue);
        		}
        	
                
        	}
        System.out.println(" ");
        	
        }
    	
    
        
        
            
        
		
	}

}
