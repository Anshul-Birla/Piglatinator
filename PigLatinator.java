
/**
 * Write a description of class PigLatinator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class PigLatinator
{
   String myInput, pigLatin;
   int strLength;
   
   public PigLatinator(String str)
   {
       myInput = str;
       pigLatin = "";
       strLength = str.length();
       checkRoute();
    }
    
   private void checkRoute()
   {
       String lowertemp = myInput.toLowerCase();
       String temp, temp2 = "", upperTemp = "";
       int vovelCheck, vovelSpot;
       for (int x = 0; x<strLength;x++)
       {
            temp = lowertemp.substring(x, x+1);
            if  (temp.compareTo("a") >= 0 && temp.compareTo("z") <= 0)
            {
               temp2+=temp;
               upperTemp += myInput.substring(x, x+1);
            }
           else 
           {
               if (temp.equals(" "))
               {
                   vovelSpot = checkVovel(temp2);
                   if (vovelSpot == 0)
                   {
                     firstVovel(upperTemp);  
                      temp2 = "";
                      upperTemp = "";
                    }
                   else 
                       
                    {
                        if (vovelSpot <= -1)
                        {
                            noVovel(upperTemp);
                            temp2 = "";
                            upperTemp = "";
                        }
                        else 
                        {
                           //run method that occurs if there are vovels
                           temp2 = "";
                           upperTemp = "";
                        }
                    }
                
        }
    }
}
}

    private int checkVovel(String str)
    {
        int spot = -1, temp;
        spot = str.indexOf("a");
        temp = str.indexOf("e");
        if ((spot<=-1 && temp>=0)&&(temp>spot)||
            (spot>=0 && temp>=0)&&(spot>temp))
        {
            spot = temp;
        }
        temp = str.indexOf("i");
         if ((spot<=-1 && temp>=0)&&(temp>spot)||
            (spot>=0 && temp>=0)&&(spot>temp))
        {
            spot = temp;
        }
        temp = str.indexOf("u");
         if ((spot<=-1 && temp>=0)&&(temp>spot)||
            (spot>=0 && temp>=0)&&(spot>temp))
        {
            spot = temp;
        }
        temp = str.indexOf("o");
        if ((spot<=-1 && temp>=0)&&(temp>spot)||
            (spot>=0 && temp>=0)&&(spot>temp))
        {
            spot = temp;
        }
        return spot;
        
    }
    
    private void firstVovel(String str)
    {
        pigLatin += (str+"yay");
    }
    
    private void noVovel(String str)
    {
        pigLatin += (str+"ay");
    }
    
    private void vovel(Stirng str, int place)
    {
}




