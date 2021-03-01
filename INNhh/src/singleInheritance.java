class  parent{
	void  bike() {
		System.out.println("hero honda");
	}
}
class child extends parent{
	void cycle() {
		System.out.println("atlas");
	}
}
public class singleInheritance {
	public static void main(String args[]) {
	child obj = new child();
	obj.cycle();
	obj.bike();

}}