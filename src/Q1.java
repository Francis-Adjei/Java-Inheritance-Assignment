class Parentclass{
  
	public void parentmethod(){
    System.out.println("This is parent class");
    
  }
	
}

class Childclass extends Parentclass{
 
	public void childmethod(){
    System.out.println("This is child class");
    
  }
}
public class Q1 {

	public static void main(String[] args){
		
		Parentclass parent = new Parentclass();
	    Childclass child = new Childclass();
	    parent.parentmethod();
	    child.childmethod();
	    child.parentmethod();
	    
	  }
	}		