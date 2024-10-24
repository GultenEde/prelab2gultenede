package treasureHunt;

public class Explorer {

	private String name;
	private int explorerID ;
	
	
	public Explorer(String name, int explorerID) {
		this.explorerID = explorerID;
	    this.name = name;
	 
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getExplorerID() {
		return explorerID;
	}


	public void setExplorerID(int explorerID) {
		this.explorerID = explorerID;
	}
	
}
