//This the Location class, it defines a spot on a standard board for Battleship

 //Authored on by Zakee T/

 public class Location {

 //instance variables

 private boolean occupied;

 private int status;


 //status constants

 public static final int UNGUESSED = 0;

 public static final int HIT = 1;

 public static final int MISSED = 2;

  /*This is the Location constructor it gives a location a status (hit,
  miss, or unguessed) and whether or not there is a ship at that location*/


  public Location() {

   occupied = false;

   status = UNGUESSED;

  }

  public boolean checkHit(){

   return status == HIT;

  }


