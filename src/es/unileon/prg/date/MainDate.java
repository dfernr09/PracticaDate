package es.unileon.prg.date;
class MainDate {

	public static void main(String[] args) throws MyException {
		try{
			Date object = new Date(23,1,2016);
			System.out.println(object);
	} catch (Exception e) {
		
		e.getMessage();
	}

}
}

