public class RandomLetterChooser extends RandomStringChooser
{
	
	public RandomLetterChooser(String str)
	{ 
		/* to be implemented in part (b) */
		super(a);
		super(b);
		a = getSingleLetters(str);
		b = new ArrayList <String>();
		for(int i = 0; i < wordArray.length; i++){
			b.add(wordArray[i]);
		}
		
	}
	
	
	public static String[] getSingleLetters(String str)
	{ 
		String[] letterArray = new String[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			letterArray[i] = ""+str.charAt(i);
		}
		return letterArray;
	}
}
