import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class EX3 {
	
public static void main(String []args) throws IOException
 {
	int R;
	int SH=30;
	int SB=14;
	int I;
	int a=0;
	 int b=0;
	 BufferedImage image= ImageIO.read (new File("c:/Users/ayoub/eclipse-workspace/ITNITP1/filtreRoberts1.png")) ;
	 BufferedImage image2 = new BufferedImage(image.getWidth(),image.getHeight(), BufferedImage.TYPE_BYTE_BINARY);
	 for(int i=0;i<image.getHeight();i++)
	 {
		 for(int j=0;j<image.getWidth();j++)
		 {
			 Color color=new Color(image.getRGB(j, i));
			 
			 I=0;
			 R =color.getRed();
			 if(R>SH)
			 {
				I=255;
				a=i+1;
				b=j+1;
			 }
			 else if(R<=SH && R>SB)
			 {
				if ((i==a)||(j==b))
				I=255;
				else 
				I=0;
			 }
			 else if(R<SB)
			 I=0; 
			
			Color color_out =new Color((int)I,(int)I,(int)I);
			 image2.setRGB(j,i,color_out.getRGB());
			 }
	 }
	 try { ImageIO.write(image2, "png", new File("seuillageRoberts.png")); }
	 catch (Exception e) { e.printStackTrace() ;
	 }
}
}