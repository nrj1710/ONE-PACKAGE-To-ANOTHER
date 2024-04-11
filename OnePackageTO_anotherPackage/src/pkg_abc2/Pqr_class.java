package pkg_abc2;

import pkg_abc.Abc_class;
import pkg_abc.Def_class;

public class Pqr_class {

	public static void main(String[] args) {
    pkg_abc.Abc_class.test2();
    
    Abc_class a1 = new Abc_class();
    a1.test1();
    
    Def_class d1 =new Def_class();
    d1.show();

	}

}
