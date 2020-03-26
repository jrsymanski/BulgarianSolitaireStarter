import java.util.ArrayList;
import java.util.Random;
/**
 * A class that plays Bulgarian Solitare. 
 * Version 1: Implement the playRound and toString methods.
 */
public class Piles
{
   private ArrayList<Integer> piles;

   /**
      Create a set of piles with a known (non-random) configuration for testing.
      @param pileSizes an array of numbers whose sum is 45
   */
   public Piles(int[] pileSizes)
   {
      piles = new ArrayList<>();
      for (int s : pileSizes)
         piles.add(s);
   }

   /**
    * Return the string representation of the piles.
    * @return the string representation of the piles.
    */
   public String toString()
   {
      return "";
   }

   /**
      Play one round of the game.
   */
   public void playRound()
   {
      piles.add(0);
      for (int i=0; i<piles.size(); i++)
      {
          if (piles.get(i)==1){
            piles.remove(i);
            i=i-1;}
          else if (piles.get(i)>1)
            piles.set(i, piles.get(i)-1);
            
          piles.set(piles.size()-1, piles.get(piles.size()-1)+1);
   }
   System.out.println(piles);
}
}
