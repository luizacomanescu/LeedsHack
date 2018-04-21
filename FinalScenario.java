import java.io.BufferedReader;
import java.io.FileReader;

public class FinalScenario {

    public String getFinalScenario(int chosenScenario)
    {
    	 String fileName = "/resources/finalscenario" + chosenScenario.toString(); 
    	 BufferedReader br = new BufferedReader(new FileReader(fileName));	 
     StringBuilder sb = new StringBuilder();
     String line = br.readLine();

        while (line != null) {
          sb.append(line);
          sb.append("\n");
          line = br.readLine();
        }
          return sb.toString();  
     }
    
    public String getFinalScenarioEncrypted(int chosenScenario)
    {
    	 String fileName = "/resources/finalScenarioEncrypted" + chosenScenario.toString(); 
    	 BufferedReader br = new BufferedReader(new FileReader(fileName));	 
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

