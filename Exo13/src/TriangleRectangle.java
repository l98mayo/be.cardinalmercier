import javax.swing.JOptionPane;


public class TriangleRectangle {
    private double x;
    private double y;
    private double hypotenuse;
    
    TriangleRectangle(){
    	x = Double.parseDouble(JOptionPane.showInputDialog("Entrez la longueur du c�t� x"));
    	y = Double.parseDouble(JOptionPane.showInputDialog("Entrez la longueur du c�t� y"));
    	hypotenuse = Math.hypot(x,y );
    }
    
    public String toString(){
    	return ("Triangle rectangle c�t� x = "+ x + " , c�t� y = " + y + " , hypotenuse = " + hypotenuse);
    	
    }
}//fin class TriangleRectangle
