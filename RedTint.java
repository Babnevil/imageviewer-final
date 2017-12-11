import java.awt.Color;

/**
 * A very basic filter that increases the red rgb level of all the 
 * pixels of an image, giving a red tint
 *
 * @author Matthew Schilling
 * @version 12.10.2017
 */
public class RedTint extends Filter
{
    /**
     * Constructor for objects of class RedTint
     * @param name The name of the filter
     */
    public RedTint(String name)
    {
        super(name);
    }

    /**
     * apply this filter to the displayed image
     * @param image The image we are currently working with
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pixel = image.getPixel(x, y);
                int redLevel = pixel.getRed();
                int greenLevel = pixel.getGreen();
                int blueLevel = pixel.getBlue();
                //check to make sure we wont try to bring the level out of bounds
                if (redLevel<200){
                    redLevel +=45;
                    image.setPixel(x, y, new Color(redLevel, greenLevel, blueLevel));
                }
            }
        }
    }

}
