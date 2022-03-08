package testing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class UnitTest {
Athlete a;
ValidationAthlete va;

@Before
public void init()
{
va= new ValidationAthlete();
a=new Athlete("administrateur",22);	

}
@Test(expected = Exception.class)
public void verifAge()
{
va.convert("22a");	
}
@Test
public void testerAge()
{
assertTrue(va.verifAge(a.getAge()));	
}
@Test
public void VerifNom()
{
assertFalse(va.verifNom(a.getNom()));	
}

}
