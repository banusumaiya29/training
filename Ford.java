package Com.sonata;


public class Ford extends Inheritance{
	
   	  
	private int year;
	 private int manufacturerDiscount;

	 public Ford (int Speed,double regularPrice,String color, int year, int
	manufacturerDiscount) {
	 super (Speed,regularPrice,color);
	 this.year = year;
	 this.manufacturerDiscount = manufacturerDiscount;
	 }

	 public double getSalePrice() {
	 return (super.getSalePrice() - manufacturerDiscount);
   	 
     }
}
