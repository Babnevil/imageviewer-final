import java.awt.Color;
import java.util.Random;
/**
 * This filter attempts to make the picture look like a video feed
 * that was being disrupted. Actually pretty proud of how this one turned out.
 *
 * @author Matthew Schilling
 * @version 12.11.2017
 */
public class Scramble extends Filter
{
    /**
     * Constructor for objects of class Scramble.
     * @param name The name of the filter.
     */
    public Scramble(String name)
    {
        super(name);
    }

    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     * We look ahead a few pixels and store the color value of that pixel, and
     * then set the current pixel to that value. This is done on vertical rows jumping
     * a few spaces between rows to preserve some of the image to make it still 
     * recognizable.
     */
    public void apply(OFImage image)
    {
        Random roll = new Random();
        int height = image.getHeight();
        int width = image.getWidth();
        //had to set the pixel stamps to a default color or it wouldnt let me compile
        Color stamp1 = Color.BLACK;
        Color stamp2 = Color.BLACK;
        Color stamp3 = Color.BLACK;

        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x+=10) {
                if(x +6 <= width){
                    stamp1 = image.getPixel(x+4, y);
                    stamp2 = image.getPixel(x+5, y);
                    stamp3 = image.getPixel(x+6, y);
                }

                image.setPixel(x, y, stamp1);
                image.setPixel(x+1, y, stamp2);
                image.setPixel(x+2, y, stamp3);
                //image.setPixel(x, y, image.getPixel((roll.nextInt(width)), (roll.nextInt(height))));
            }
        }
    }
}

