package testing;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valueAge="33a";
		String nom="administrateur";
		ValidationAthlete va=new ValidationAthlete();
		Athlete a=new Athlete();
		if(va.verifNom(nom)==false)
		{
			a.setNom(nom);
		}
		else
		{
			System.out.println("verifiez le nom");
			
		}
		try
		{ 
			int ag=va.convert(valueAge);
			
			if(va.verifAge(ag))
				a.setAge(ag);
			else
			{
				System.out.println("l'age doit être entre 17 et 34");
			}
		
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("l'age doit être numérique");
		}

	}

}
