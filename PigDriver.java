import chn.util.*;
/**
 * Write a description of class PigDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PigDriver
{
    public static void main(String args[])
    {
        ConsoleIO keyboard = new ConsoleIO();
        String input, contin = "y";
        
        
        
        System.out.println("This turns your English phrase into PigLatin!");
        System.out.println("Note: Enter y if you wish to continue at the end");
        System.out.print("\n");
        while (contin.equals("y"))
        {
        System.out.print("\n");
        System.out.print("Enter the phrase you want to be translated and press <Enter>: ");
        System.out.print("\n");
        
        input = keyboard.readLine();
        System.out.print("\n");
        PigLatinator pig = new PigLatinator(input);
        
        System.out.print("PigLatin: "+pig.run());
        System.out.print("\n");
        System.out.print("\n");
        
        System.out.print("Do you wish to continue? ");
        contin = keyboard.readToken();
    }
    
        
    
}
}
