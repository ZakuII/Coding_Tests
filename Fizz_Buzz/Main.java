import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//Reads text file
//reads each line, first number is fizz, 2nd is buzz, 3rd is number to go up to for comparasion
//ex: 3 5 10
//This compares numbers 1 through 10 for fizz (3) and buzz (5)
public class Main {
	public static void main (String[] args) throws IOException {
		//Scanner var = new Scanner(System.in);
		//System.out.println(var.nextLine());
		//var.close();
		
	    File file = new File(args[0]);
	    BufferedReader in = new BufferedReader(new FileReader(file));
	    String line, final_output;
	    ArrayList<String> output_array = new ArrayList<String>();
	    int fizz, buzz, input_length;
	    while ((line = in.readLine()) != null) {
	        String[] lineArray = line.split("\\s+");
	        if (lineArray.length > 0) {
	        	fizz = Integer.valueOf(lineArray[0]);
	        	buzz = Integer.valueOf(lineArray[1]);
	        	input_length = Integer.valueOf(lineArray[2]);
	        	
	            //Process line of input Here
	        	output_array.clear();
	        	for (int i = 1; i <= input_length; i++) {
	        		if (i % fizz == 0 && i % buzz == 0) {
	        			output_array.add("FB");
	        		}
	        		else if (i % fizz == 0) {
	        			output_array.add("F");
	        		}
	        		else if (i % buzz == 0) {
	        			output_array.add("B");
	        		}
	        		else {
	        			output_array.add(Integer.toString(i));
	        		}
	        	}
	        	StringBuilder builder = new StringBuilder();
	        	for( String s : output_array) {
	        		builder.append(" ");
	        	    builder.append(s);
	        	}
	        	final_output = builder.toString();
	        	System.out.print(final_output + "\n");
	        }
	    }
	    in.close();
	}
}
