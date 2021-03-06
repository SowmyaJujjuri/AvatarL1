import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.*;

/**
 * Write a description of class SurpriseBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerUp extends Actor
{
    HealthBar timeRem;
    private GreenfootSound soundapp = new GreenfootSound("applause.wav");
    //     private Timer timer;

    public PowerUp(HealthBar tr)
    {
        timeRem = tr;
    }

    /**
     * Act - do whatever the SurpriseBox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(foundAvatar())
        {
            int delta = getFun();
            timeRem.addTime(delta);
            getWorld().removeObject(this);
            //             setLocation(Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        }

    }

    public int getFun()
    {
        int d = Greenfoot.getRandomNumber(2);
        return d = 10;

    }

    public boolean foundAvatar()
    {
        //  Actor Avatar = getOneObjectAtOffset(0, 0, Avatar.class);
        if(isTouching(Avatar.class)) 
        {
            soundapp.play ();
            timeRem.addTime(10);
            return true;
        }
        else 
        {
            return false;
        }
    }

}