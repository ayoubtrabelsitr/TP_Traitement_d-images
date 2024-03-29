import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class TP2ouverture {
	public static void main(String []args) throws IOException
 	{
	
	
	 BufferedImage image= ImageIO.read (new File("C:/Users/ayoub/eclipse-workspace/ITNITP1/Erosion2.png")) ;
	 BufferedImage image2 = new BufferedImage(image.getWidth(),image.getHeight(), BufferedImage.TYPE_INT_RGB);
	 double masque[][]= {{0,255,0},{255,255,255},{0,255,0}};
	 
	 
	 for(int i=1;i<image.getHeight()-1;i++)//ligne
	 {
		 
		 for(int j=1;j<image.getWidth()-1;j++)//colone
		 		{	
			 Color colorgauche=new Color(image.getRGB(j-1, i));
			 Color colordroite=new Color(image.getRGB(j+1, i));
			 Color colorhaut=new Color(image.getRGB(j, i-1));
			 Color colorbas=new Color(image.getRGB(j, i+1));
			 Color Blanc =new Color(255,255,255);
			 Color Black=new Color(0,0,0);
			 
		if(colorgauche.getRed()==255||colordroite.getRed()==255||colorbas.getRed()==255||colorhaut.getRed()==255)
			image2.setRGB(j, i,Blanc.getRGB());
		else 
			image2.setRGB(j, i, image.getRGB(j,i));
				}
	 }
	 
	 try { ImageIO.write(image2, "png", new File("ouverture.png")); }
	 catch (Exception e) {
		 e.printStackTrace() ;
	 					 }
}
}
