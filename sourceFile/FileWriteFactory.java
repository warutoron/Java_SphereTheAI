package sphereParts;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteFactory {

	public void stringWriter(String addless,String str) {

		try {
			File file = new File(addless);
			FileWriter filewriter = new FileWriter(file, true);
			filewriter.write(str + "¥r¥n");
			filewriter.close();

	    } catch (IOException e) {
	    	System.out.println(e);
	    	
	    }

	}
}
