package pkg_abc;

public class Def_class {

	public static void main(String[] args) {
		 display();
           Def_class d1 =new Def_class();
            d1.show();
                                   //calling Abc class methods
            Abc_class.test2();
            Abc_class a1 =new Abc_class();
            		a1.test1();

	}
	public static void display() {
		System.out.println("display method of Def class");
	}
public void show() {
	System.out.println("show method of Def class");
}
}
