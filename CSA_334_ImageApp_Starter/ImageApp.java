/*
  ImageApp:
 */

public class ImageApp
{
  public static void main(String[] args)
  {

    // use any file from the lib folder
    String pictureFile = "lib/beach.jpg";

    // Get an image, get 2d array of pixels, show a color of a pixel, and display the image
    Picture origImg = new Picture(pictureFile);
    Pixel[][] origPixels = origImg.getPixels2D();
    System.out.println(origPixels[0][0].getColor());
    origImg.explore();

    // Image #1 Using the original image and pixels, recolor an image by changing the RGB color of each Pixel
    Picture recoloredImg = new Picture(pictureFile);
    Pixel[][] recoloredPixels = recoloredImg.getPixels2D();

    /* to be implemented */

    // Image #2 Using the original image and pixels, create a photographic negative of the image
    Picture negImg = new Picture(pictureFile);
    Pixel[][] negPixels = negImg.getPixels2D();

    /* to be implemented */

    // Image #3 Using the original image and pixels, create a grayscale version of the image
    Picture grayscaleImg = new Picture(pictureFile);
    Pixel[][] grayscalePixels = grayscaleImg.getPixels2D();

    /* to be implemented */

    // Image #4 Using the original image and pixels, rotate it 180 degrees
    Picture upsidedownImage = origImg.rotate180();
    Pixel[][] upsideDownPixels = upsidedownImage.getPixels2D();
    System.out.println("This window is 180 degrees rotated image");
    upsidedownImage.explore();

    // Image #5 Using the original image and pixels, rotate image 90 counterclockwise (-90)
    Picture rotateImg = origImg.rotate90CounterClockwise();
    Pixel[][] rotatePixels = rotateImg.getPixels2D();
    System.out.println("This window is 90 degrees counterclockwise rotated image");
    rotateImg.explore();

    // Image #6 Using the original image and pixels, rotate image 90 clockwise
    Picture rotateImg2 = origImg.rotate90Clockwise();
    Pixel[][] rotatePixels2 = rotateImg2.getPixels2D();
    System.out.println("This window is 90 degrees clockwise rotated image");
    rotateImg2.explore();


    // Final Image: Add a small image to a larger one
    Picture compositeImage = new Picture(pictureFile);
    Picture balloon = new Picture("lib2/balloon.png");
    Picture bird = new Picture("lib2/bird.png");
    Picture cat = new Picture("lib2/cat.png");
    compositeImage.copy(balloon, 10, 10);
    compositeImage.copy(bird, 100, 100);
    compositeImage.copy(cat, 200, 200);
    System.out.println("This window has 3 small images pasted on a large image");
    compositeImage.explore();




    // for testing  2D algorithms
    int[][] test1 = { { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 } };
    int[][] test2 = new int[4][4];


  }
}
