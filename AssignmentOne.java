/****************************************************************************
 *
 * Created by: Perry Martin
 * Created on: Sept 2016
 * This program asks the user for a string or a run and outputs the max run
 *     
 *
 ****************************************************************************/
import java.util.Scanner;
class maxRun {
       public static void main(String[] args) {

       // input
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string : ");
        String runString = input.nextLine();
    
    //Process
    //http://stackoverflow.com/users/705175/eric

    int maxRunCount = 0;
    int stringCount = 1;
    char nextTime = '\u0000';  
           for (int run=0; run<runString.length(); run++) {
               if ( runString.charAt(run) == nextTime ) {
              stringCount++;
       if (stringCount > maxRunCount) {  //if weve exceeded our max run now
            maxRunCount = stringCount;
        }
    } else {
        stringCount = 1;  
    }
    //reassign the previous before next iteration
    nextTime = runString.charAt(run);  
}
//output
System.out.println("Max run is: " + maxRunCount);
     }
}

