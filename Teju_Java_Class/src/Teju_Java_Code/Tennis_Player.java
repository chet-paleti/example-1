package Teju_Java_Code;

public class Tennis_Player {
	
	private String name;
	public int titles ;
	public int age ;
	
	public String get_name() {
		return this.name;
	}
	
	

	
	public Tennis_Player(String name, int titles, int age) {
		// TODO Auto-generated constructor stub
		
		this.name= name;
		this.age=age;
		this.titles=titles;
	}

}
