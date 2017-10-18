package it.unical.test;

import java.time.Instant;

import org.junit.Assert;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {
	
/*
aggiungere un test per testare il metodo addArrival(String participant, Instant arrival). 
In questo test verificare che, aggiungendo un nuovo arrivo, la taglia della mappa arrivals 
diventi pari ad 1
*/
 @Test
 public void addArrivalTest()
 {
	AthleticGame G = new AthleticGame("Calcio");
	G.addArrival("Gabriele", Instant.now());
	Assert.assertEquals(1, G.getArrivals().size());
 }
	
	
/*
aggiungere un test per verificare che getParecipiantTime(String participant) lanci 
un'eccezione in caso di partecipante non valido
 */
 
 @Test(expected = IllegalArgumentException.class)
 public void getPartecipantTimeTest()
 {
	 AthleticGame G = new AthleticGame("Calcio");
	 G.getParecipiantTime("232.2323");
 }

}
