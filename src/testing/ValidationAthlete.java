package testing;

public class ValidationAthlete {
public int convert(String ageStr)
{
return Integer.parseInt(ageStr);	
}
public boolean verifAge(int age)
{
return age>16 && age<35;	

}
public boolean verifNom(String nom)
{
return nom.contains("admin");	

}
}
