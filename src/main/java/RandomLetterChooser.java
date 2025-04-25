public class RandomLetterChooser extends RandomStringChooser
{
	
	public RandomLetterChooser(String str)
	{ 
		/* to be implemented in part (b) */

		super(getSingleLetters(str)); // i know, super, you're here but i have no clue where to put you
		b = new ArrayList <String>();
		for(int i = 0; i < str.length; i++){
			b.add(a.get(i));
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
