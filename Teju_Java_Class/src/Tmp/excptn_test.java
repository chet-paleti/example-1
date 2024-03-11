package Tmp;

public class excptn_test {

	public static void main(String[] args)   {
		
		int i = 8 ;
		int j = 0 ;
		
		try {
			System.out.println(i/j);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
		    System.out.println(e);
		} finally {
			System.out.println("all is good !");
		}

	}

}
