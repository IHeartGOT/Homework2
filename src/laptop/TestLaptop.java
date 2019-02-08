package laptop;


public class TestLaptop {


		public static void main(String[] args) {
		
		Laptop name = new Laptop();
		name.setname("I have an Apple Macbook Pro Laptop");
		name.displayname();
		
		Laptop age = new Laptop("My Laptop is " + 4 + " years old");
		
		Laptop usage = new Laptop("I use my laptop for Java Programming at PNT");
		
		
		Laptop Mac1 = new Laptop();
		Mac1.setLine("I Love my Mac");
		String Mac1LineBefore = Mac1.getLine();
		System.out.println("Prodip says: " + Mac1LineBefore);
		
		
		Laptop Mac2 = new Laptop();
		Mac2.setLine("I use my laptop to watch movies");
		String Mac2Line = Mac2.getLine();
		System.out.println("Raju says: " + Mac2Line);
		
		String Mac1LineAfter = Mac1.getLine();
		System.out.println("Prodip says: " + Mac1LineAfter + " too.");
		
		Laptop.MsgEveryone();
	}
}
