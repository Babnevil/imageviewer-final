import java.awt.Color;
/**
 * This filter causes the left side of the image to be displayed on both
 * sides of the picture.
 *
 * @author Matthew Schilling
 * @version 12.11.2017
 */
public class SplitMirror extends Filter
{

    /**
     * Constructor for objects of class SplitMirror
     */
    public SplitMirror(String name)
    {
        super(name);
    }

    /**
     * apply this filter to the current image
     *
     * @param  image The image we are woking on
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        int middle = width /2;
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width / 2; x++) {
                Color left = image.getPixel(x, y);
                image.setPixel(x, y, image.getPixel(width - 1 - x, y));
                //image.setPixel(width - 1 - x, y, left);
            }
        }
    }
}