import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Ex1 {
	
public static void main(String []args) throws IOException
 {
	int R,G,B;
	
	
	
	 BufferedImage image= ImageIO.read (new File("D:/coursM1/TP-TNI/hand.jpg")) ;
	 BufferedImage image2 = new BufferedImage(image.getWidth(),image.getHeight(), BufferedImage.TYPE_INT_RGB);

	 
	 for(int i=0;i<image.getHeight();i++)
	 {
		 for(int j=0;j<image.getWidth();j++)
		 {
			 Color color=new Color(image.getRGB(j, i));
			 
			 
			 R =color.getRed();
			 
	         G = color.getGreen();
	         B = color.getBlue();
	         float  I=(float) ((R+G+B)/3);
	        Color color_out =new Color((int)I,(int)I,(int)I);
			 image2.setRGB(j,i,color_out.getRGB());
			 
			 
		   
		   
		 }
	 }
	 try { ImageIO.write(image2, "png", new File("resultat1.png")); }
	 catch (Exception e) { e.printStackTrace() ;
	 }
}
}