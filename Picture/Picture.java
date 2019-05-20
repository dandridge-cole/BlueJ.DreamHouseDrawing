
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square chimney;
    private Square doorBottom;
    private Square doorTop;
    private Square window;
    private Square window2;
    private Square window3;
    private Triangle roof;
    private Triangle treeBottom;
    private Triangle treeTop;
    private Triangle treeBottom2;
    private Triangle treeTop2;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
       this.draw(); // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-30);
        sun.changeSize(60);
        sun.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-10);
        wall.moveVertical(40);
        wall.changeSize(200);
        wall.makeVisible();

        window = new Square();
        window.changeColor("red");
        window.moveHorizontal(30);
        window.moveVertical(180);
        window.makeVisible();
        
        window2 = new Square();
        window2.changeColor("blue");
        window2.moveHorizontal(30);
        window2.moveVertical(75);
        window2.makeVisible();
        
                
        window3 = new Square();
        window3.changeColor("blue");
        window3.moveHorizontal(120);
        window3.moveVertical(75);
        window3.makeVisible();
        
        doorBottom = new Square();
        doorBottom.changeColor("yellow");
        doorBottom.moveHorizontal(100);
        doorBottom.moveVertical(205);
        doorBottom.makeVisible();
        
        doorTop = new Square();
        doorTop.changeColor("yellow");
        doorTop.moveHorizontal(100);
        doorTop.moveVertical(175);
        doorTop.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 250);
        roof.moveHorizontal(100);
        roof.moveVertical(25);
        roof.changeColor("black");
        roof.makeVisible();
                
        treeBottom = new Triangle();
        treeBottom.changeSize(30, 20);
        treeBottom.moveHorizontal(180);
        treeBottom.moveVertical(245);
        treeBottom.changeColor("green");
        treeBottom.makeVisible();
        
        treeTop = new Triangle();
        treeTop.changeSize(20, 20);
        treeTop.moveHorizontal(180);
        treeTop.moveVertical(235);
        treeTop.changeColor("green");
        treeTop.makeVisible();
        
                        
        treeBottom2 = new Triangle();
        treeBottom2.changeSize(30, 20);
        treeBottom2.moveHorizontal(210);
        treeBottom2.moveVertical(245);
        treeBottom2.changeColor("green");
        treeBottom2.makeVisible();
        
        treeTop2 = new Triangle();
        treeTop2.changeSize(20, 20);
        treeTop2.moveHorizontal(210);
        treeTop2.moveVertical(235);
        treeTop2.changeColor("green");
        treeTop2.makeVisible();
                
        chimney = new Square();
        chimney.changeColor("black");
        chimney.makeVisible();

    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
