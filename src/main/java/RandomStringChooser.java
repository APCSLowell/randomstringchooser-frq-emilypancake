import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
  private String[] wordArray;
  private ArrayList <String> b;
  public RandomStringChooser(String[] a){
    wordArray = new String[a.length];
    b = new ArrayList <String>();
    for(int i = 0; i < a.length; i++){
      wordArray[i] = a[i];
      b.add(wordArray[i]);
    }
  }
  public String getNext(){
    String c;
    if(b.size() != 0){
      c = b.remove((int)(Math.random * b.size()));
      return c;
    }else{
      return "NONE";
    }
  }

}
