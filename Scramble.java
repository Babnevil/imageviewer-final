import java.awt.Color;
import java.util.Random;
/**
 * Write a description of class Scramble here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scramble extends Filter
{

    public Scramble(String name)
    {
        super(name);
    }


    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        Random roll = new Random();
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x+=2) {
                image.setPixel(x, y, image.getPixel((roll.nextInt(width)), (roll.nextInt(height))));
            }
        }
    }
}
