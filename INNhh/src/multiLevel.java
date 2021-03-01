class handbag{
   void bag()
   {
	System.out.println("Class bag");
   }
    void bagType()
   {
	System.out.println("bag Type: sling bag");
   }
}
class leather extends handbag{
   void leather()
   {
	System.out.println("leather bag");
   }
   void material() {
	   System.out.println("leather");
   }
    void brand()
   {
	System.out.println("Brand: capress");
   }
    void price()
   {
	System.out.println("price: 1500");
   }
}
class silicon extends leather{

   void silicon()
   {
	System.out.println("material: silicon");
   }
   public void quality()
   {
	System.out.println("low");
   }
  
}
public class multiLevel {
	 public static void main(String args[])
	   {
		 silicon obj=new silicon();
		 obj.material();
		 obj.brand();
		 obj.price();
		 
	   }

}
