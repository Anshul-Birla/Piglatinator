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
        String input;
        
        System.out.println("This turns your English phrase into PigLatin!");
        System.out.print("Enter the phrase you want to be translated:");
        input = keyboard.readLine();
        PigLatinator pig = new PigLatinator(input);
        
        System.out.print("PigLatin - "+pig.run());
    }
}
