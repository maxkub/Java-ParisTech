package exo;

import java.util.ArrayList;

public class Eleve implements Comparable<Eleve>
{	
	private String nom;
	private ArrayList<Integer> listeNotes = new ArrayList<Integer>();
	private double moyenne;
	
	public Eleve(String name)
	{
		nom = new String(name);
	}
	
	public double getMoyenne()
	{
		return moyenne;
	}
	
	public String getName()
	{
		return nom;
	}
	
	public ArrayList<Integer> getListNotes()
	{
		return listeNotes;
	}
	
	public void ajouterNote(int note)
	{
		if (note<0)
			listeNotes.add(0);
		else if (note>20)
			listeNotes.add(20);
		else
			listeNotes.add(note);
		
		int a = 0;
		for(int el : listeNotes)
		{
			a += el;
		}
		
		moyenne = a/(float) listeNotes.size();
	}
	
	public String toString()
	{
		return nom + "(" + moyenne + ")";
	}
	
	public int compareTo(Eleve autreEleve)
	{
		if(this.moyenne < autreEleve.moyenne)
			return -1;
		else if (this.moyenne > autreEleve.moyenne)
			return 1;
		else
			return 0;
	}

}
