import javax.swing.JOptionPane;


public class TriangleRectangle {
    private double x;
    private double y;
    private double hypotenuse;
    
    TriangleRectangle(){
    	x = Double.parseDouble(JOptionPane.showInputDialog("Entrez la longueur du côté x"));
    	y = Double.parseDouble(JOptionPane.showInputDialog("Entrez la longueur du côté y"));
    	hypotenuse = Math.hypot(x,y );
    }
    
    public String toString(){
    	return ("Triangle rectangle côté x = "+ x + " , côté y = " + y + " , hypotenuse = " + hypotenuse);
    	
    }
}//fin class TriangleRectangle
