public class Game {

	int NoOfScenarios = 1;
	int chosenScenario;
	
	public static void main(String[] args)
	{
		// make user choose a scenario and save in chosenScenario - fe
		
		String scenarioAsString = InitialScenerio.getInitialScenario(chosenScenario);
		
		// show user the initial scenario - fe
		
		String []questions = Questions.getQuestions(chosenScenario);
		String []answers = Answers.getAnswers(chosenScenario);
		
		// show all questions to user with checkboxes - fe
		boolean selectedQuestions = new boolean[9];
		
		// show yes/no answer for the questions selected by the user - fe
		
		// user answers the other remaining question with yes/no checkboxes
		boolean userAnswerCorrect;
		int score = 0;
		for (int i = 0; i < 8; i++)
		{
			if (selectedQuestions[i] == false)
			{
				// make user answer this question - fe
				
				
				if (userAnswerCorrect == true)
					score++;
			}
			
		} // for
		if (score >= 4)
		{
			// tell user has won - fe
			
			String finalScenarioAsString = FinalScenario.getFinalScenario(scenarioChosen);
			// show user the final scenario - fe
			
		}
		else 
			//tell user lost - fe
	}
}
