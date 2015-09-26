package exo;

public class Eleve1A extends EleveECTS
{

	public Eleve1A(String name) 
	{
		super(name);
	}

	@Override
	public int resultat() 
	{
		if(this.getMoyenne() >= 12) return 60;
		return 0;
	}
	
}
