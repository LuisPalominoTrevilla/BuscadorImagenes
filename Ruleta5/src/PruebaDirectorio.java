import java.awt.image.BufferedImage;
import java.io.File;

public class PruebaDirectorio {

    public static void main(String[] args) {
        myCV cv = new myCV();
        String[] files = {"C:\\Users\\Luis Palomino\\Desktop\\img.jpg", "C:\\Users\\Luis Palomino\\Desktop\\img3.jpg"};
        
        //New hash
        for(String file:files){
            BufferedImage img = cv.readImage(file);
            img = cv.resizeImage(cv.convertToGrayScale(img, BufferedImage.TYPE_BYTE_GRAY), 40, 40);
            int q1 = 0;
            for(int y = 0; y < img.getHeight()/2; y++){
                for(int x = 0; x < img.getWidth()/2; x++){
                    q1 += cv.getGrayPixel(img, x, y);
                }
            }
            int q2 = 0;
            for(int y = 0; y < img.getHeight()/2; y++){
                for(int x = img.getWidth()/2; x < img.getWidth(); x++){
                    q2 += cv.getGrayPixel(img, x, y);
                }
            }
            int q3 = 0;
            for(int y = img.getHeight()/2; y < img.getHeight(); y++){
                for(int x = 0; x < img.getWidth()/2; x++){
                    q3 += cv.getGrayPixel(img, x, y);
                }
            }
            int q4 = 0;
            for(int y = img.getHeight()/2; y < img.getHeight(); y++){
                for(int x = img.getWidth()/2; x < img.getWidth(); x++){
                    q4 += cv.getGrayPixel(img, x, y);
                }
            }
            System.out.println(q1+q2+q3+q4);
        }
    }

}
