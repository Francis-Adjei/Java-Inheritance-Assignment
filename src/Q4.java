
public class Q4 {
	public static void main(String[] args){
			
    Square[] obj = new Square[10];
	    int j = 1 ;
	    for( int i = 0 ; i < 10 ; i++ ){
	    	
	    	obj[i] = new Square(j);
	        j++;
	    }
	    

	    for( int i = 0 ; i < 10 ; i++ ){
	    	
	    	obj[i].area();
	    	
	    }

	 
	  }
	}		


