class Rectangle{
  int length;
  int breadth;

  public Rectangle(int length, int breadth){
   this.length = length;
    this.breadth = breadth;
  }

  public void area(){
	  int s = length*breadth;
    System.out.println(s);
  }

  public void perimeter(){
	
	  int result = 2*(length+breadth);
      System.out.println(result);
      
  }
}

class Square extends Rectangle{
	  
	int side;
	 
	 Square(int s){
	    super(s,s);
	  }
	}
public class Q3 {
	public static void main(String[] args){
	    
		Rectangle obj = new Rectangle(9,8);
	    obj.area();
	    obj.perimeter();

	    Square s = new Square(9);
	    s.area();
	    s.perimeter();

}}
