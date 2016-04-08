package es.unileon.prg.date;
class MainDate {

	public static void main(String[] args) throws MyException {
		try{
			Date object = new Date(1,2,2016);
			System.out.println(object.getNumberOfDaysSinceFirstDay());
	} catch (Exception e) {
		
		e.getMessage();
	}

}
}
