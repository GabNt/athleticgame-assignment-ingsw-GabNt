package it.unical.test;

import java.time.Instant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import it.unical.asde.AthleticGame;


public class AthleticGameWinnersTest {

//- utilizzare @BeforeClass per istanziare un campo privato statico di tipo AthleticGame
//su cui effettuare i test
	
	private static AthleticGame Calcio;
	
	@BeforeClass
	public static void instanceAG()
	{
		Calcio = new AthleticGame("Calcio");
	}
	
	
// - utilizzare @After per richiamare il metodo reset()
	
	@After
	public void resetta()
	{
		Calcio.reset();
	}
	
//   - utilizzare @Before per richiamare il metodo start()
	@Before
	public void inizializza()
	{
		Calcio.start();
	}
	
// - aggiungere due metodi di test per la funzione getWinner 
//	 (scegliere i test in modo significativo, ma a piacere)	
	
	@Test
	public void testWinner()
	{
		Calcio.addArrival("Gabriele", Instant.now());
		Calcio.addArrival("Francesco", Instant.now().plusMillis(1));
		Calcio.addArrival("Simone", Instant.now().plusMillis(7));
		Assert.assertEquals("Gabriele",Calcio.getWinner());
	}
	
}
