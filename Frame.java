import java.awt.Color;
/**
 * Draw a simple black frame around the image
 *
 * @author Matthew Schilling
 * @version (12.11.2017
 */
public class Frame extends Filter
{
    /**
     * Constructor for objects of class Frame
     * @param name The name of the filter
     */
    public Frame(String name)
    {
        super(name);
    }

    /**
     * Apply the filter to the current image
     * Used similar execution of the box ball project to draw the lines
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