import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{
    String[] map;
     /** ********************      MAP LEGEND     *********************** */
    //      a = avatar       f = floor           b = brownblock
    //      c = brownblockL  g = Goldcoin        h = Bluecoin
    //      r = Redcoin      d = Brickblock      
    public void setFields()
    {
        map = new String[] { "  r                     ",
                             "  ddd           b       ",
                             "                        ",
                             "        grrhrrg         ",
                             "       ddddddddd        ",
                             "  gg                gg  ",
                             "  dd                dd  ",
                             "        g      r        ",
                             "       dd  b  dd        ",
                             "                        ",
                             "                        ",
                             "    gr             rh   ",
                             "   ddd            ddd   ",
                             "  a                     ",
                             "        g r   r  g      ",
                             "fffffffffffffffffffffffff" };
    }

    /**
     * Constructor for objects of class background.
     * 
     */
    public background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        //setBackground(new GreenfootImage("StartScreen.png")); // Splash Screen
        setFields();
        for (int i=0; i<map.length; i++) for (int j=0; j<map[i].length(); j++)
            {
                int kind = "afbcghrd".indexOf(""+map[i].charAt(j));
                if (kind < 0) continue;
                Actor actor = null;
                if (kind == 0) actor = new Avatar();
                if (kind == 1) actor = new Floor();
                if (kind == 2) actor = new brownblock();
                if (kind == 3) actor = new brownblockL();
                if (kind == 4) actor = new Goldcoin();
                if (kind == 5) actor = new Bluecoin();
                if (kind == 6) actor = new Redcoin();
                if (kind == 7) actor = new Brickblock();
                addObject(actor, 16+j*32, 16+i*32);
            }
        //Avatar avatar = new Avatar();
       // Floor floor = new Floor();
        
       // addObject( avatar, 350, 350);
        
       // addObject( floor, 600, 8);
    }
    
}

