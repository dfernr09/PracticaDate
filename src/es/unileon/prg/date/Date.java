package es.unileon.prg.date;
class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year)throws MyException{
		StringBuffer excep = new StringBuffer();
		if((day > 31) || (day < 1)){
			excep.append("El dia no puede ser negativo ni mayor que 31");
		}
		if((month > 12) || (month < 1)){
			excep.append("El dia no puede ser negativo ni mayor que 12");
		}
		if(year < 1){
			excep.append("El año no puede ser negativo");
		}
		if(excep.length()!=0){
			throw new MyException (excep.toString());
			
		}
		else{
			this.day=day;
			this.month=month;
			this.year=year;
		}
	}
	public Date(){
		this.day=0;
		this.month=0;
		this.day=0;
	}
	

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	boolean isSameYear(Date other){
		boolean smYear=true;
		if(this.year==other.getYear())
			smYear=true;
		else
			smYear=false;
		return smYear;
		
	}
	
	boolean isSameMonth(Date other){
		boolean smMonth=true;
		if(this.month==other.getMonth())
			smMonth=true;
		else
			smMonth=false;
		return smMonth;
		
	}
	boolean isSameDay(Date other){
		boolean smDay=true;
		if(this.day==other.getDay())
			smDay=true;
		else
			smDay=false;
		return smDay;
			
	}
	boolean isSame(Date other){
		boolean same=true;
		if(this.year==other.getYear() && this.month==other.getMonth() && this.day==other.getDay())
			same=true;
		else
			same=false;
		return same;
		
	}
	String getMonthName(){
		String mes="";
		switch(this.month){
		case 1: mes="Enero";
			break;
		case 2: mes="Febreo";
			break;
		case 3: mes="Marzo";
			break;
		case 4: mes="Abril";
			break;
		case 5: mes="Mayo";
			break;
		case 6: mes="Junio";
			break;
		case 7: mes="Julio";
			break;
		case 8: mes="Agosto";
			break;
		case 9: mes="Septiembre";
			break;
		case 10: mes="Octubre";
			break;
		case 11: mes="Noviembre";
			break;
		case 12: mes="Diciembre";
			break;
	
		}
		return mes;
	}
	int monthDay(){
		int day=0;
		switch(this.month){
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day=31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day=30;
			break;
		case 2:
			day=29;
			break;
			}
		return day;
		
		
	}
	boolean CheckMonthDay(){
		boolean checkDay=false;
		switch(this.month){
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if(this.day<=31)
				checkDay=true;
			else
				checkDay=false;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if(this.day<=30)
				checkDay=true;
			else
				checkDay=false;
			break;
		case 2:
			if(this.day<=29)
				checkDay=true;
			else
				checkDay=false;
		
			}
		return checkDay;
	}
	
	
	String getEstacion(){
		String estacion="";
		switch(this.month){
		case 12:
		case 1:
		case 2:
				estacion="Estas en invieron";
				break;
		case 3:
		case 4:
		case 5:
				estacion="Estas en primavera";
				break;
		case 6:
		case 7:
		case 8:
				estacion="Estas en verano";
				break;
		case 9:
		case 10:
		case 11:
				estacion="Estas en otoño";
				break;
		}
		
		return estacion;	
	}
	String getMesesHastaFinAño(){
		Date aux = null;
		try {
			aux = new Date(4,3,2016);
		} catch (MyException e) {
			
			e.getMessage();
		}
		StringBuffer monthsLeft = new StringBuffer();
		for(int i=this.month+1;i<12;i++){
			aux.setMonth(i);
			monthsLeft.append(aux.getMonthName());
		}
		return monthsLeft.toString();
	}
	String mostrarFecha(){
		return String.format("%d/%d/%d",this.day,this.month,this.year);
		
	}
	String mostrarFechasHastaFinMes(){
		Date aux = null;
		try {
			aux = new Date(4,2,2016);
		} catch (MyException e) {
			e.getMessage();
		}
		StringBuffer fechas = new StringBuffer();
		
			if(aux.monthDay()==31){
				for(int i=this.day+1;i<=31;i++){
				aux.setDay(i);
				fechas.append(aux.mostrarFecha());
				}
			}
			if(aux.monthDay()==30){
				for(int i=this.day+1;i<=30;i++){
					aux.setDay(i);
					fechas.append(aux.mostrarFecha());
				}
			}
			if(aux.monthDay()==29){
				for(int i=this.day+1;i<=29;i++){
					aux.setDay(i);
					fechas.append(aux.mostrarFecha());
				}
			}
				
			
		return fechas.toString();	
	}		
}


