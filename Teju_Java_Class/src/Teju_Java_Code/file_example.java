package Teju_Java_Code;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file_example {
	
	  public static void main(String[] arguments) {
	        try {
	            FileReader file = new FileReader("C:\\Users\\chetp\\eclipse-workspace\\Teju_Java_Class\\files\\inputfile.txt");
	            BufferedReader buff = new
	                BufferedReader(file);
	            boolean tmp = true;
	            while (tmp) {
	                String line = buff.readLine();
	                if (line == null)
	                {
	                    tmp = false;	
	                	
	                
            	    }
	                else 
	                    System.out.println(line);
	                }
	            buff.close();
	        } catch (IOException e) {
	            System.out.println("Error -- " + e.toString());
	        }
	    }
	  
	  
}

	
	


