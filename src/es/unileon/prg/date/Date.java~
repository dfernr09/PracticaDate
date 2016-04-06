package es.unileon.prg.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year){
		this.day=((day >= 1 && day <= 31) ? day : 0);
		this.month=((month >= 1 && month <= 12) ? month : 0);
		this.year=((year > 0) ? year : 0);
		
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
	boolean checkMonthDay(){
		boolean checkDay=false;
		switch(this.month){
		case 1: 
				if(this.day<=31)
					checkDay=true;
				else
					checkDay=false;
			break;
		case 2: 
				if(this.day<=29)
					checkDay=true;
				else
					checkDay=false;
			break;
		case 3:
			if(this.day<=31)
				checkDay=true;
			else
				checkDay=false;
			break;
		case 4: 
			if(this.day<=30)
				checkDay=true;
			else
				checkDay=false;
			break;
		case 5:
			if(this.day<=31)
				checkDay=true;
			else
				checkDay=false;
			break;
		case 6:
			if(this.day<=30)
				checkDay=true;
			else
				checkDay=false;
			break;
		case 7: 
			if(this.day<=31)
				checkDay=true;
			else
				checkDay=false;
			break;
		case 8:
			if(this.day<=31)
				checkDay=true;
			else
				checkDay=false;
			break;
		case 9: 
			if(this.day<=30)
				checkDay=true;
			else
				checkDay=false;
			break;
		case 10: 
			if(this.day<=31)
				checkDay=true;
			else
				checkDay=false;
			break;
		case 11: 
			if(this.day<=30)
				checkDay=true;
			else
				checkDay=false;
			break;
		case 12:
			if(this.day<=31)
				checkDay=true;
			else
				checkDay=false;
			break;
	
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
	int getMesesHastaFinAño(){
		int i,cont=0;
		for(i=this.month;i<12;i++){
				cont++;
			}
		
		return cont;
	}
}
