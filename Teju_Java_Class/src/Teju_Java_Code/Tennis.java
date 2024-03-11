package Teju_Java_Code;

import java.util.ArrayList;
import java.util.List;

public class Tennis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tennis_Player tp1 = new Tennis_Player("Djokovic",21,35);
		Tennis_Player tp2 = new Tennis_Player("Nadal",22,36);
		System.out.println(tp1.get_name()) ;
		System.out.println(tp2.get_name()) ;
		
		/*
		tp1.name = "Djokovic";
		tp1.titles = 20 ;
		tp1.age = 35 ;
		
		tp2.name = "Nadal";
		tp2.titles = 22 ;
		tp2.age = 36 ;
		*/
		
		List<Tennis_Player> tp_list = new ArrayList<Tennis_Player>();
		
		tp_list.add(tp1);
		tp_list.add(tp2);
		
		/*
		System.out.println("Tennis Player 1 is " + tp1.name) ;
		System.out.println(tp1.name + " has " +  tp1.titles + " titles") ;
		System.out.println(tp1.name + " is " + tp1.age + " years old") ;
		System.out.println();
		System.out.println("Tennis Player 2 is " + tp2.name) ;
		System.out.println(tp2.name + " has " +  tp2.titles + " titles") ;
		System.out.println(tp2.name + " is " + tp2.age + " years old") ;
		*/
		
		for(Tennis_Player tp : tp_list) {
			
			System.out.println(tp.get_name());
			System.out.println(tp.age);
			System.out.println(tp.titles);
		}
		
		
		String greater_player ;
		greater_player = compare(tp1,tp2);
		
		
		System.out.println("The greater of the 2 players is " + greater_player);
	}
	
	public static String compare(Tennis_Player t1, Tennis_Player t2) {
		if (t1.titles > t2.titles) {
			return t1.get_name();
		} else {
			return t2.get_name() ;
		}
	
	}

}
