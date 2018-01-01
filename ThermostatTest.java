package ejercicio2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThermostatTest {

	@Test
	public void Inicializacion_partOfDaytest() {
		assertTrue("wrong inicialization", Thermostat.partOfDay.equals("Wake"));
	}
	@Test
	public void Inicializacion_temptest() {
		assertTrue("wrong inicialization", Thermostat.temp.equals("Low"));
	}
	

}
