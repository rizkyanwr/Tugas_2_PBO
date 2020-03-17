// RIZKY DWI AMALIA - 13020180138 (B2)


public class Coba{
	int a; double b;

	//Constructor Default
	public Coba(){
	a = 100;
	b = 3.14;
	}

	//constructor parameter
	public Coba(int y){
	a = y;
	}

public static void main(String[] args){
	Coba cb1 = new Coba();
	Coba cb2 = new Coba(50);

	System.out.println(cb1.a);
	System.out.println(cb1.b);
	System.out.println(cb2.a);
	}
}