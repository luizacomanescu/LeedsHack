/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author luizacomanescu
 */
public class FinalScenario {

    public static String getFinalScenario(int chosenScenario) throws FileNotFoundException, IOException
    {
    	 String fileName = "/Users/luizacomanescu/NetBeansProjects/Game/src/game/finalscenario" + String.valueOf(chosenScenario) + ".txt"; 
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
    
    public static String getFinalScenarioEncrypted(int chosenScenario) throws FileNotFoundException, IOException
    {
    	 String fileName = "/Users/luizacomanescu/NetBeansProjects/Game/src/game/finalScenarioEncrypted" + String.valueOf(chosenScenario) + ".txt"; 
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


