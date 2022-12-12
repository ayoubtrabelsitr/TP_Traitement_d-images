package TP1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.math.*;
import javax.imageio.ImageIO;

public class EX1a {
public static void main(String []args)
{
	BufferedImage image = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
	allumePixel(image,0,200,150,200);
	try { ImageIO.write(image, "png", new File("pente.png")); 
	}
	
	catch (Exception e) { e.printStackTrace();}
}
public static void allumePixel(BufferedImage image,int xa,int ya,int xb,int yb )
{
float x=xa,y=ya;
image.setRGB(Math.round(x), Math.round(y), 0xFFFF00);
int dy=yb-ya;
int dx=xb-xa;
if(dx<dy)
{
for(int i=0;i<dy;i++)
{  
	y++;
	x=y/pente(xa,ya,xb,yb);
	
	image.setRGB(Math.round(x), Math.round(y), 0xFFFF00);
}
}
else 
{
for(int i=0;i<dx;i++)
{
x++;
y=pente(xa,ya,xb,yb)*x;
image.setRGB(Math.round(x), Math.round(y), 0xFFFF00);
}
}
}
public static float pente(int xa,int ya,int xb,int yb  )
{
	return (yb-ya)/(xb-xa);
}

}
