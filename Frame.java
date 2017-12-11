import java.awt.Color;
/**
 * Draw a simple black frame around the image
 *
 * @author Matthew Schilling
 * @version (12.11.2017
 */
public class Frame extends Filter
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Frame
     */
    public Frame(String name)
    {
        super(name);
    }

    /**
     * Apply the filter to the current image
     * Used similar execution 
     *
     * @param image The image we are currently viewing/working with
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();

        for(int y = 0; y < height; y++) {
            for(int x = 0; x <12; x++) {
                image.setPixel(x, y, Color.BLACK);
            }
        }
        for(int y = 0; y < height; y++) {
            for(int x = width-12; x < width; x++) {
                image.setPixel(x,y, Color.BLACK);
            }
        }
        for(int y = 0; y < 12; y++) {
            for(int x = 0; x < width; x++) {
                image.setPixel(x,y, Color.BLACK);
            }
        }
        for(int y = height -12; y < height; y++) {
            for(int x = 0; x < width; x++) {
                image.setPixel(x,y, Color.BLACK);
            }
        }
    }
}