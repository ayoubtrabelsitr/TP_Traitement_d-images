import java.awt.Color;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class ex2 {
	public static void main(String []args) throws IOException
	 {
		int R,G,B;
		double I2;
		
		
		 BufferedImage image= ImageIO.read (new File("D:/coursM1/TP-TNI/building.png")) ;
		 BufferedImage image2 = new BufferedImage(image.getWidth(),image.getHeight(), BufferedImage.TYPE_INT_RGB);
		 
		 double dldx[][]= {{0,-1},{1,0}};
		 double dldy[][]= {{-1,0},{0,1}};
		
		int dlx[][]=new int [image.getWidth()][image.getHeight()];
		int dly[][]=new int [image.getWidth()][image.getHeight()];
		 for(int i=0;i<image.getHeight()-1;i++)
		 {
			 for(int j=0;j<image.getWidth()-1;j++)
			 {
				
				 
				 int dx=0;
				 int dy=0;
				 for(int k=0;k<2;k++)
				 	{
					 
				 	
					 for (int l=0;l<2;l++)
					{
						 Color color=new Color(image.getRGB(j+l, i+k));
						 dx+=dldx[k][l]*(color.getRed());
						 dy+=dldy[k][l]*(color.getRed());
					}
					}
				 	I2=Math.sqrt((dx*dx)+(dy*dy));
				 
				 Color color_out=new Color((int)I2,(int)I2,(int)I2);
				 image2.setRGB(j,i,color_out.getRGB());
				 
		
		    
	
	}
		 }		
		 try { ImageIO.write(image2, "png", new File("filtreRoberts1.png")); }
		 catch (Exception e) { e.printStackTrace() ;
		 }
}
}
