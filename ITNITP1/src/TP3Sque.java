import java.awt.Color;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class TP3Sque {
	public static void main(String[]args) throws IOException
	{
		BufferedImage image=ImageIO.read(new File (""));
		BufferedImage image2= new BufferedImage(image.getWidth(),image.getHeight(), BufferedImage.TYPE_INT_RGB);;
		boolean b[][]=new boolean [image.getHeight()][image.getWidth()]; //tableau b
		Color Black=new Color(0,0,0);//couleur de fond
		
		//initialisation de b à false
		
		for (int i=0;i<image.getHeight();i++)
		{
			for(int j=0;j<image.getWidth();j++)
			{
				b[i][j]=false;
				
			}
		}
		
		
		
		
		for(int i=0;i<image.getWidth();i++)
		{
			for(int j=0;j<image.getHeight();j++)
			{
				
			}
		}
		
	}

}
