package es.unileon.prg.date;
public class MainDate {

	public static void main(String[] args) {
		
		Date object = new Date(3,4,2016);
		System.out.println("Quedan "+object.getMesesHastaFinAño()+" meses hasta fin de año");
	}

}
