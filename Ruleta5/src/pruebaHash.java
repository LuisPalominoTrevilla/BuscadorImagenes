import java.awt.image.BufferedImage;
import java.io.File;

public class pruebaHash {
	public static void main(String[] args){
		myCV cv=new myCV();
		String[] files=new String[2];
		files[0]="C:\\Users\\oscar\\Desktop\\Imagenes\\218979_1997196005248_4383480_o.jpg";
		files[1]="C:\\Users\\oscar\\Desktop\\Imagenes\\16106664_10206167791473885_576685811_o.jpg";
		for(String file:files){
            BufferedImage img = cv.readImage(file);
            img = cv.resizeImage(cv.convertToGrayScale(img, BufferedImage.TYPE_BYTE_GRAY), 40, 40);
            int q1 = 0;
//            for(int y = 0; y < img.getHeight()/2; y++){
//                for(int x = 0; x < img.getWidth()/2; x++){
//                    q1 += cv.getGrayPixel(img, x, y);
//                }
//            }
//            int q2 = 0;
//            for(int y = 0; y < img.getHeight()/2; y++){
//                for(int x = img.getWidth()/2; x < img.getWidth(); x++){
//                    q2 += cv.getGrayPixel(img, x, y);
//                }
//            }
//            int q3 = 0;
//            for(int y = img.getHeight()/2; y < img.getHeight(); y++){
//                for(int x = 0; x < img.getWidth()/2; x++){
//                    q3 += cv.getGrayPixel(img, x, y);
//                }
//            }
//            int q4 = 0;
//            for(int y = img.getHeight()/2; y < img.getHeight(); y++){
//                for(int x = img.getWidth()/2; x < img.getWidth(); x++){
//                    q4 += cv.getGrayPixel(img, x, y);
//                }
//            }
//            System.out.println(q1+":"+q2+":"+q3+":"+q4);
            int q=0;
            for(int y=0;y<img.getHeight();y++){
            	for(int x=0;x<img.getWidth();x++){
            		q += cv.getGrayPixel(img, x, y);
            	}
            }
            System.out.println(q);
        }
	}
}
