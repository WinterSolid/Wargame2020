/*This class holds the values of a ship on the Grid.

 * keeps track of the length, coordinate

 * of initial spot, and direction of the ship*/

public class Ship

{

    private int row;

    private int col;

    private int length;

    private int direction;
    private int direction;



    //Direction constants

    public static final int UNSET = -1;

    public static final int HORIZONTAL = 0;

    public static final int VERTICAL = 1;



/*This is the Ship constructor, it will create a ship of a

 * given length with a default location of (-1, -1) --which

 * will not be on the grid-- and an unset

 * direction @param length = length of ship*/
