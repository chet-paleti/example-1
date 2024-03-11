package Teju_Java_Code;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class file_write_example {

	public static void main(String[] args) {
	
		String line_1 = "Hello ... from Tejas" ;
		
		 try {
			FileWriter fw = new FileWriter("output_file");
			 BufferedWriter out = new BufferedWriter(fw) ;
			 
			 out.write(line_1);
			 
			 		 
			 System.out.println("Wrote the line !");
			 
			 out.close();
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
