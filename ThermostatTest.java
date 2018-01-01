package ejercicio2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ThermostatTest {
	
	@Before
	public void InitStreams(){
		Thermostat.partOfDay = "Wake";
		Thermostat.temp = "Low";
	}
	
	@Test
	public void Init_partOfDaytest() {
		assertTrue("wrong init", Thermostat.partOfDay.equals("Wake"));
	}
	@Test
	public void Init_temptest() {
		assertTrue("wrong init", Thermostat.temp.equals("Low"));
	}
	@Test
	public void changePartOfDaytest(){
		Thermostat.advance();
		assertTrue("wrong change", Thermostat.partOfDay.equals("Sleep"));
	}
	
	@Test
	public void changeTemptest(){
		Thermostat.up();
		assertTrue("wrong change", Thermostat.temp.equals("High"));
	}

}
