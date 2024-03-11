package Teju_Java_Code;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class file_write_example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String line_1 = "\nHello ... from Tejas" ;
		
		 try {
			FileWriter fw = new FileWriter("inputfile", true);
			 BufferedWriter out = new BufferedWriter(fw) ;
			 
			 out.append(line_1);
			 
			 		 
			 System.out.println("Wrote the line !");
			 
			 out.close();
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
