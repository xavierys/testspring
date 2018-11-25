package essai;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MontreTest {

    @Test
    public void test() {
	Montre montre = new Montre(10, 10);

	assertEquals(montre.afficheHeure(), "10:10");
    }

    @Test
    public void testAffichageMontre() {
	assertEquals("Montre [heure=10, minute=10]", new Montre(10, 10).toString());
    }

}
