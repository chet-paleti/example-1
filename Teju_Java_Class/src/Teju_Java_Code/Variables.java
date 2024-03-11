package Teju_Java_Code;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		float a = 22;
		float b = 7 ;
		float c ;
		
		c= (a/b);
		*/
		
		
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
		
		String[] player = new String[] {"Federer","Nadal","Djokovic"};
		
		//String p1 = player[0].toUpperCase();
		
		//p1 = p1.toUpperCase();
		
		
		//int len = player.length;
		/*
		System.out.println(player[0]);
		System.out.println(player[1]);
		System.out.println(player[2]);
		System.out.println(p1);
		System.out.println(len);
		*/
		
		for (int i=0; i < player.length ; i++) {
			
			if (player[i] == "Nadal") {
				
				System.out.println(player[i].toUpperCase());
				
			}
			else {
				System.out.println(player[i]);
			}		
			
		}
		
		
		
		
		

	}

}
