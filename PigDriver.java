import chn.util.*;
/**
 * PigLatin driver
 *
 * @Anshul
 * @V1
 */
public class PigDriver
{
    public static void main(String args[])
    {
        //initialization 
        ConsoleIO keyboard = new ConsoleIO();
        String input;
        String contin = "y";
        
        //instruction to user
        System.out.println("This turns your English phrase into PigLatin!");
        System.out.println("Note: Enter y if you wish to continue at the end");
        
        System.out.print("\n");
        
        //loop to give control to user for program
        while (contin.equals("y"))
        {
        System.out.print("\n");
        
        //accept user input
        System.out.print("Enter the phrase you want to be translated and press <Enter>: ");
        System.out.print("\n");
        
        input = keyboard.readLine();
        
        System.out.print("\n");
        
        //constructor initialized later because of necessary info
        PigLatinator pig = new PigLatinator(input);
        
        //output to user
        System.out.print("PigLatin: "+pig.run());
        System.out.print("\n");
        System.out.print("\n");
        
        //prompt to keep program running
        System.out.print("Do you wish to continue? ");
        contin = keyboard.readToken();
    }
    
        
    
}
}
