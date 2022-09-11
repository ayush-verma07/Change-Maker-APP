//Name:
//Period:
import java.util.*;

public class ChangeMakerAPP
{
    public static void main(String[] args)
    {
        makeChange(20,13.44); 
}   
    public static void makeChange(double paid, double cost)
    {
        Scanner console = new Scanner(System.in); 
        double[] NUMBERS = {20.0, 10.0, 5.0, 1.0, 0.25, 0.1, 0.05, 0.01};
        double[] result = new double[NUMBERS.length];
        int change = (int)(paid - cost) * 100;
    while(change > 0.0)
    {
      
            for(int i = 0; i < NUMBERS.length; i++)
            {
                
              if (NUMBERS[i] <= change)
              { 
                  
                if (change - NUMBERS[i] >= NUMBERS[i])
                {
                    while (change >= NUMBERS[i])
                    {
                        result[i]++;
                        change -= NUMBERS[i];
                        
                    }
                }
                else
                {
                    change -= NUMBERS[i];
                }
              }
              System.out.println("$" + NUMBERS[i] + ": " + result[i]);
        }
        
    }

}
}