package exo;

import java.util.ArrayList;
import java.util.Collections;

public class GroupeEleves 
{
	private ArrayList<Eleve> listeEleves = new ArrayList<Eleve>();
	
	public GroupeEleves()
	{
	}
	
	public int nombre()
	{
		return listeEleves.size();
	}
	
	public ArrayList<Eleve> getListe()
	{
		return listeEleves;
	}
	
	public void ajouterEleve(Eleve eleve)
	{
		listeEleves.add(eleve);
	}
	
	public Eleve chercher(String nom)
	{
		Eleve eleve = null;
		
		for(Eleve el : listeEleves)
		{
			if(el.getName().equals(nom))
			{
				eleve = el;
				break;
			}
		}
		
		return eleve;
	}
	
	public void lister()
	{
		for(Eleve el : listeEleves)
		{
			System.out.println(el);
		}
	}
	
	public Eleve meilleurEleve()
	{
		return Collections.max(listeEleves);
	}
	
	public void trierEleves()
	{
		Collections.sort(listeEleves);
	}

}
