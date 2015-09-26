package exo;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args)
	{
	
		Eleve eleve = new Eleve("max");
		
		eleve.ajouterNote(15);
		eleve.ajouterNote(10);
		eleve.ajouterNote(9);
		
		System.out.println(eleve);
		
		
		Eleve eleve2 = new Eleve("robert");
		eleve2.ajouterNote(10);
		eleve2.ajouterNote(20);
		
		Eleve eleve3 = new Eleve("eude");
		eleve3.ajouterNote(8);
		
		System.out.println(eleve.compareTo(eleve2));
		
		
		GroupeEleves groupe = new GroupeEleves();
		
		groupe.ajouterEleve(eleve);
		groupe.ajouterEleve(eleve2);
		groupe.ajouterEleve(eleve);
		groupe.ajouterEleve(eleve3);
		
		System.out.println("cherche : " + groupe.chercher("max"));
		
		groupe.lister();
		
		
		System.out.println(groupe.meilleurEleve());
		
		groupe.trierEleves();
		System.out.println();
		groupe.lister();
		
		//commentaire
		System.out.println(eleve3.getName());
		
		
		ArrayList<EleveECTS> listeEleves = new ArrayList<EleveECTS>();
		EleveECTS unEleve = new Eleve1A("Marie");
		unEleve.ajouterNote(12);
		unEleve.ajouterNote(17);
		unEleve.ajouterNote(8);
		listeEleves.add(unEleve);


		unEleve = new EleveMaster("Hugues");
		unEleve.ajouterNote(11);
		unEleve.ajouterNote(7);
		unEleve.ajouterNote(9);
		unEleve.ajouterNote(18);
		listeEleves.add(unEleve);

		unEleve = new EleveMaster("Sophie");
		unEleve.ajouterNote(15);
		unEleve.ajouterNote(14);
		unEleve.ajouterNote(19);
		unEleve.ajouterNote(12);
		listeEleves.add(unEleve);

		for (EleveECTS el : listeEleves)
			System.out.println("Nombre de credits de " + el.getName() + " : " +
					el.resultat());
	}

}
