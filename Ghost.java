import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ghost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Ghost extends Actor
{
    /**
     * Act - do whatever the Ghost wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int speed = 1;
    
    public void act() 
    {
        move();
    }    
    
    //Move ghost from side to side *400 & 500 coordinates*
    public void move()
    {
      if ((getX()>=500 && speed>0 || getX()<= 400 && speed <0)) speed = -speed;
      move(speed);
    }
    
}

