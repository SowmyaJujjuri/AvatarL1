import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DemonExplosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Congratulation extends BlueDemon
{
    /**
     * Act - do whatever the DemonExplosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage image = getImage(); 
        image.scale(400,400);
        setImage(image);

        if (GameOver = true)
        {
            Greenfoot.stop();
        }

        if (touchingBullet())
        {      
            Lvl2BkgDesert myWorld = (Lvl2BkgDesert)getWorld();
            int n = myWorld.GetAvailDarts();
            System.out.println(n); 

            if (n < 1) 
            {
                getWorld().addObject(new DemonExplosion(), getWorld().getWidth()/2, getWorld().getHeight()/2);
                GameOver = true;
                getWorld().removeObject(this);
            }
        }    
    }
}
