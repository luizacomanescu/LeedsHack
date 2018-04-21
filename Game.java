public class Game {

	int NoOfScenarios = 1;
	int chosenScenario;
	
	public static String encryption(String input)
	{
		String temp = input;
		for (int i = 0; i < input.size(); i++)
		{
			temp[i] -= 10;
			if (temp[i] == '.')
				temp[i]++;
		}
		return temp;
	} // encryption
	
	public static String decryption(String input, int propDecrypted)
	{
		String[] temp = propEncrypted.split("[.]");
		for (int i = 0; i < temp[propDecrypted].size(); i++)
			temp[propDecrypted][i] += 10;
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 4; i++)
			sb.append(temp[i]);
		
		return sb.toString();
	} // decryption
	
	public static void main(String[] args)
	{
		// make user choose a scenario and save in chosenScenario - fe
		
		String initialScenarioAsString = InitialScenerio.getInitialScenario(chosenScenario);
		String finalScenarioAsString = FinalScenario.getFinalScenario(scenarioChosen);
		 
		// show user the initial scenario - fe
		
		String []questions = Questions.getQuestions(chosenScenario);
		String []answers = Questions.getAnswers(chosenScenario);
		
		// show all questions to user with checkboxes - fe
		boolean selectedQuestions = new boolean[9];
		
		// show yes/no answer for the questions selected by the user - fe
		
		// user answers the other remaining question with yes/no checkboxes
		boolean userAnswerCorrect;
		int score = 0;
		String encryptedScenario = encryption(finalScenarioAsString);
		for (int i = 0; i < 8; i++)
		{
			if (selectedQuestions[i] == false)
			{
				// make user answer this question - fe
				// show the encrypted scenario - fe
				
				
				if (userAnswerCorrect == true)
				{
					score++;
					encryptedScenario = decryption(encryptedScenario, score);
					// show the partly decrypted scenarui - fe
				} // if
			}
			
		} // for
		if (score >= 4)
		{
			// tell user has won - fe
			
			
			// show user the final scenario - fe
			
		}
		else 
			//tell user lost - fe
	}
}
