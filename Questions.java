public class Questions {
	
	public static String getQuestions(int chosenScenario)
	{
	  String[] setOfQuestions = new String[9]; 	
	  String fileName = "/resources/questions" + chosenScenario.toString(); 
   	  BufferedReader br = new BufferedReader(new FileReader(fileName));	 
      int count = 0;
      String line = br.readLine();

       while (line != null) {
    	     count++;
    	     if (count % 2 == 1)
    	     {
    	    	   setOfQuestions[count/2] = line;
    	     }
         line = br.readLine();
       }
         return setOfQuestions;  	
	}
	
	public static String getAnswers(int chosenScenario)
	{
	  String[] setOfAnswers = new String[9]; 	
	  String fileName = "/resources/questions" + chosenScenario.toString(); 
   	  BufferedReader br = new BufferedReader(new FileReader(fileName));	 
      int count = 0;
      String line = br.readLine();

       while (line != null) {
    	     count++;
    	     if (count % 2 == 0)
    	     {
    	    	   setOfAnswers[count/2] = line;
    	     }
         line = br.readLine();
       }
         return setOfAnswers;  	
	}
	
	public static String getKeyword(int chosenScenario)
	{
	  String lastLine = new String(); 	
	  String fileName = "/resources/questions" + chosenScenario.toString(); 
   	  BufferedReader br = new BufferedReader(new FileReader(fileName));	 
      String line = br.readLine();

       while (line != null) {
    	     lastLine = line;
         line = br.readLine();
       }
         return lastLine;  	
	}
}
