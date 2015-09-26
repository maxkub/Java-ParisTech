package exo;

public class EleveMaster extends EleveECTS
{

	public EleveMaster(String name) 
	{
		super(name);
	}

	@Override
	public int resultat() 
	{
		int sum = 0;
		for( int x : this.getListNotes())
		{
			if(x >= 10) 
				sum += 6;
			else if (x >= 8)
				sum += 3;
		}
		return sum;
	}
	

}
