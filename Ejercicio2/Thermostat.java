package ejercicio2;

public class Thermostat {
	static String partOfDay = "Wake";
	static String temp = "Low";
	
	public static void advance(){
		if (partOfDay.equals("Wake")){
			partOfDay = "Sleep";
		}else if (partOfDay.equals("Sleep")){
			partOfDay = "Wake";
		}
	}
	public static void up(){
		if (temp.equals("Low")){
			temp = "High";
		}
	}
	
	public static void down(){
		if (temp.equals("High")){
			temp = "Low";
		}
	}
	
}
