package fooCorporation;

public class fooCorporation {
	public static void main(String[] args){
	int hoursworked = 40; 
	int basepay = 8;
	
	if(basepay< 8){
		System.out.println( "error" ); 
	}
	
	if(hoursworked > 60){
		System.out.println("error");
	}
	 
	if( hoursworked > 40 ){
		
		basepay = 12;
	}

	if( hoursworked <= 60 && basepay >= 8){
		System.out.println( hoursworked * basepay); 
		
	}
	
	}
}
