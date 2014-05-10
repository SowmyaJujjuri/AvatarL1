import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Startroom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Startroom extends World
{
    //Music Constructor
    private GreenfootSound L1music = new GreenfootSound("Nehal_MainStreet (1).mp3");  
    /**
     * Constructor for objects of class Startroom.
     * 
     */
    public Startroom()
    {    
        // Create a new world with 800x485 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
      
        Start startButton = new Start();
        addObject (startButton, 525, 440);

        help helpButton = new help();
        addObject (helpButton, 250, 440);
    }
    
    public void act()
    {
        // Loops Music
        L1music.playLoop();
    } 

    public void stopmusic()  
    {  
        L1music.stop();  
    } 
}
