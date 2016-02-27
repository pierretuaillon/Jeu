import java.awt.Image;
import java.awt.Point;



public class Personnage {
/*
 Personnage liant par une image et une position, points de vie,
 get et set sur les 3
 3 constructeurs avec les points vie et la position
 La position c'est un point
 
 */
	private Image image;
	private int pointdevie;
	private Point position;

	public Personnage (int pPointdevie, Point pPosition){
		this.pointdevie=pPointdevie;
		this.position=pPosition;
	}
	public Personnage (){
		this.pointdevie=1;
		this.position=new Point(0,0);
	}
}
