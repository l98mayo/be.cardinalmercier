import javax.swing.JOptionPane;


public class Livre {
	private String titre;
	private String auteur;
	private int isbn;
	
	Livre(String titre,String auteur, int isbn){
		this.titre = titre;
		this.auteur = auteur;
		this.isbn = isbn;
	}
	Livre(){
		this.titre = JOptionPane.showInputDialog("Entrez le titre" );
		this.auteur = JOptionPane.showInputDialog("Entrez l'auteur");
		this.isbn = Integer.parseInt(JOptionPane.showInputDialog("Entrez l'isbn"));
		
	}
	Livre(String titre , String auteur){
		this.titre = titre;
		this.auteur = auteur;
		this.isbn = 111;
		
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	public String toString(){
		return("Titre : " + this.titre + "\nAuteur: " + this.auteur + "\nisbn: " + this.isbn);		
	}
}//fin class Livre
