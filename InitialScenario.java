import java.io.BufferedReader;
import java.io.FileReader;

public class InitialScenario {

    public String getInitialScenario(int chosenScenario)
    {
    	 String fileName = "/resources/initialscenario" + chosenScenario.toString(); 
    	 BufferedReader br = new BufferedReader(new FileReader("fileName"));	 
     StringBuilder sb = new StringBuilder();
     String line = br.readLine();

        while (line != null) {
          sb.append(line);
          sb.append("\n");
          line = br.readLine();
        }
          return sb.toString();  
     }     
}
