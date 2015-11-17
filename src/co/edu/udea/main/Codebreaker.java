package co.edu.udea.main;

import java.util.Iterator;
import java.util.List;

public class Codebreaker {
	
	public Codebreaker()
	{
		
	}
	
	public String numberAnalysis(String ans, String guess)
	{

		String[] temp1  = ans.split("");
		String[] temp2  = guess.split("");
		String answer = "";
		
		for(int i = 0; i < temp1.length; i++)
		{
			String temp = temp1[i];
			
			for(int j = 0; j < temp2.length; j++)
			{
				if(!temp2.equals("X"))
				{
					if(temp.equals(temp2[j]) && i == j)
					{
						answer = "X" + answer;
						temp2[j] = "X";
					}
					
					if(i < temp1.length - 1)
					{
						if(!temp1[i].equals(temp1[i+1]))
						{
							if(temp.equals(temp2[j]) && i != j)
							{
								answer  = answer + "-";
								temp2[j] = "X";
							}
						}
					}
					else
					{
						if(temp.equals(temp2[j]) && i != j)
						{
							answer  = answer + "-";
							temp2[j] = "X";
						}
					}
					
				}
		    }
			
		}
		
		return answer;
		
	}

}
