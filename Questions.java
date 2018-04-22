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
public class Questions {
	
	public static String[] getQuestions(int chosenScenario) throws FileNotFoundException, IOException
	{
	  String[] setOfQuestions = new String[9]; 
	  String fileName = "/Users/luizacomanescu/NetBeansProjects/Game/src/game/questions" + String.valueOf(chosenScenario) + ".txt"; 
   	  BufferedReader br = new BufferedReader(new FileReader(fileName));	 
      int count = 0;
      String line = br.readLine();

       while (line != null) {
    	     count++;
    	     if (count % 2 == 1)
    	     {
                 
    	    	   setOfQuestions[count/2] = line;
    	     }
             if (count == 18) break;
         line = br.readLine();
       }
         return setOfQuestions;  	
	}
	
	public static String[] getAnswers(int chosenScenario) throws FileNotFoundException, IOException
	{
	  String[] setOfAnswers = new String[9]; 	
	  String fileName = "/Users/luizacomanescu/NetBeansProjects/Game/src/game/questions" + String.valueOf(chosenScenario) + ".txt"; 
   	  BufferedReader br = new BufferedReader(new FileReader(fileName));	 
      int count = 0;
      String line = br.readLine();

       while (line != null) {
    	     count++;
    	     if (count % 2 == 0)
    	     {
    	    	   setOfAnswers[count/2 - 1] = line;
    	     }
             if (count/2 == 9) break;
         line = br.readLine();
       }
         return setOfAnswers;  	
	}
	
	public static String getKeyword(int chosenScenario) throws FileNotFoundException, IOException
	{
	  String lastLine = new String(); 	
	  String fileName = "/Users/luizacomanescu/NetBeansProjects/Game/src/game/questions" + String.valueOf(chosenScenario) + ".txt"; 
   	  BufferedReader br = new BufferedReader(new FileReader(fileName));	 
      String line = br.readLine();

       while (line != null) {
    	     lastLine = line;
         line = br.readLine();
       }
         return lastLine;  	
	}
}

