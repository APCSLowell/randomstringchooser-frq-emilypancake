import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
  private ArrayList <String> b;
  public RandomStringChooser(String[] a){
    b = new ArrayList <String>();
    for(int i = 0; i < a.length; i++){
      b.add(a[i]);
    }
  }
  public String getNext(){
    String c;
    if(b.size() != 0){
      c = b.remove((int)(Math.random() * b.size()));
      return c;
    }else{
      return "NONE";
    }
  }

}
