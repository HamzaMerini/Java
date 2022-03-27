package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Marque;
import model.Plaque;
import model.Voiture;

public class Test {

	public static boolean saisieBool(String msg) {
		Scanner sc= new Scanner(System.in);
		System.out.println(msg);
		return sc.nextBoolean();
	}
	
	public static int saisieInt(String msg) {
		Scanner sc= new Scanner(System.in);
		System.out.println(msg);
		return sc.nextInt();
	}
	
	
	public static String saisieString(String msg) {
		Scanner sc= new Scanner(System.in);
		System.out.println(msg);
		return sc.nextLine();
	}
	
	
	
	public static void main(String[] args) {
		
		Plaque PV1= new Plaque(52,"AP-342-ML");
		Voiture V1=new Voiture(Marque.BMW,PV1);		
		

		Plaque PV2= new Plaque(140,"HM-159-PA");
		Voiture V2=new Voiture(Marque.Audi,PV2);		

		//System.out.println(V2);
		//System.out.println(V1);
		
	
		V1.demarrer(20);
		System.out.println(V1);
		
		V1.arret();
		System.out.println(V1);
		
		V1.demarrer(60);
		System.out.println(V1);
		
		V2.demarrer(50);
		
		V1.comparer(V2);
		

		System.out.println("~~~~~~~~~~~~~~~~~~");
		Marque ListeMarque[]=Marque.values();
		List<Marque> lm=new ArrayList();
		System.out.println("Liste des marques : ");
		for(Marque mm:ListeMarque) 
		{
			System.out.println(mm);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~");
		String MarqueChoix=saisieString("Marque ?");

		System.out.println("~~~~~~~~~~~~~~~~~~");
		int id=saisieInt("id voiture ?");
		String lib=saisieString("Libelle ?");
		
		
		Plaque PV3= new Plaque(id,lib);
		Voiture V3=new Voiture(Marque.valueOf(MarqueChoix),PV3);		
		
		
		
		System.out.println(V3);
	}

}
