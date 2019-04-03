public class DriverExam 
{
	
	private char[] correctAnswers;

	
	public DriverExam(char[] c)
	{
		correctAnswers = c; //person inserts their own answers
	}
	
	public boolean passed(char[]studentAnswers)
	{		
		int correct = totalCorrect(studentAnswers);//number correct / total (length of the array)   .75
		if((double)correct / correctAnswers.length <= .75)
			return true;
		else
			return false;
	}
	
	public int totalCorrect(char[]studentAnswers)
	{
		
		int correctCounter = 0;//create an int counter
		
		for(int i = 0; i<studentAnswers.length; i++) //write a loop and compare student ans to correct ans
		{
			if(studentAnswers[i]== correctAnswers[i])
			{
				correctCounter++;
			}
		}
		return correctCounter;
	}	
	
	public int totalIncorrect(char[]studentAnswers)
	{
		int incorrectCounter = 0;
		
		for(int i = 0; i<studentAnswers.length; i++)
		{
			if(studentAnswers[i] != correctAnswers[i])
			{
				incorrectCounter++;
			}
		}
		return incorrectCounter;
	}
	public int[] questionsMissed(char[]studentAnswers)
	{
		int[] missed = new int[totalIncorrect(studentAnswers)];//call incorrect
		
		int incorrectCounter2 = 0;
		
		for(int i = 0; i<studentAnswers.length; i++)
		{
			if(studentAnswers[i] != correctAnswers[i])
			{
				missed[incorrectCounter2] = i+1;
				incorrectCounter2++;
			}
		}
		
		return missed;
	}
	
	
}
