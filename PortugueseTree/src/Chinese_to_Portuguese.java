import java.io.IOException;

public class Chinese_to_Portuguese {
	
	public static void main(String[] args) throws IOException {

		String chinese = chinese();
		
		
		String lines[] = chinese.split(System.getProperty("line.separator"));
		
		
		System.out.println(lines[4999]);

	}

}
