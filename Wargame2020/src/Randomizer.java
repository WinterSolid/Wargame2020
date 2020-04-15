/**

 * Class obtains random values for Battleship game
 * Author: Iram

 */

import java.util.*;



public class Randomizer{



    public static Random theInstance = null;



    public Randomizer(){

    }
    public static Random getInstance(){

        if(theInstance == null)

            theInstance = new Random();

        return theInstance;

    }

    public static int nextInt(){

        return Randomizer.getInstance().nextInt();

    }


}