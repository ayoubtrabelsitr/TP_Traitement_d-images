package TP1;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class tttt {
	
public static void main(String[] args) {
        
		BufferedImage image = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
				allumePixel(image,0,0,499,499);
				try { ImageIO.write(image, "png", new File("resultat.png")); 
				}
				
				catch (Exception e) { e.printStackTrace();}
		}
public static void allumePixel(BufferedImage image, int xa,int ya,int xb, int yb)
	{
				int x,y,sy,sx,sz,dx=0,dy=0;
				x=xa;
				y=ya;
				dx=xb-xa;
				dy=yb-ya;
				sx=signe(xb,xa);
				sy=signe(yb,ya);
				int erry=(2*dy)-dx;
						for(int i=0;i<dx;i++)
						{
						 x+=sx;
						 if(erry>=0)
						 {
							y+=sy; 
							erry-=2*dx;
						 }
						 erry+=2*dy;
						 image.setRGB( x, y,0xFFFF00);
						}
				
}
	public static int signe(int a,int b)
    {
    	if (a==b)
    		return 0;
    	else if (a>b)
    		return 1;
    	else 
    		return -1;
    }
}