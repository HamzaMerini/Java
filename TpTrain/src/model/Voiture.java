package model;

public class Voiture {

	private Marque marque;
	private Plaque plaque;
	private int vitesse=0;
	private boolean statut=false;
	
	
	public Voiture(Marque marque, Plaque plaque) {
		super();
		this.marque = marque;
		this.plaque = plaque;
	}
	
	public Marque getMarque() {
		return marque;
	}
	public void setMarque(Marque marque) {
		this.marque = marque;
	}
	public Plaque getPlaque() {
		return plaque;
	}
	public void setPlaque(Plaque plaque) {
		this.plaque = plaque;
	}
	public int getVitesse() {
		return vitesse;
	}
	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	public boolean isStatut() {
		return statut;
	}
	public void setStatut(boolean statut) {
		this.statut = statut;
	}
	
	
	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", plaque=" + plaque + ", vitesse=" + vitesse + ", statut=" + statut + "]";
	}
	
	
	
	
	public void demarrer(int vitesse) 
	{
		this.statut=true;
		this.vitesse=vitesse;
	}
	
	public void arret()
	{
		this.statut=true;
		this.vitesse=0;
	}
	
	public void comparer(Voiture V)
	{
		String msg="";
		if(this.vitesse>V.vitesse) {
			msg=" plus vite ";
		}else if(this.vitesse<V.vitesse) {
			msg=" moins vite ";
		}else {msg=" à la meme vitesse ";}
		
		System.out.println("La voiture "+this.marque+" ("+this.vitesse+" Km/h) roule"+msg+"que la voiture "+V.marque+" ("+V.vitesse+" Km/h)");
	}
	
	
	
}
