package InterfeceStudy;

public class childClass implements interfacestudy2
{

	public static void main(String[] args) 
	{
		childClass cc= new childClass();
		cc.mymethod1();
		cc.mymethod2();
		cc.mymethod3();
		cc.mymethod4();

	}

	@Override
	public void mymethod1() {
		System.out.println("this is from  interfacestudy1 1st method");
		
	}

	@Override
	public void mymethod2() 
	{
		System.out.println("this is from interrfacestudy1 2nd method"); 
		
	}

	@Override
	public void mymethod3() {
		System.out.println("this is interfacestudy2 1st method ");
		
	}

	@Override
	public void mymethod4() 
	{
		System.out.println("this interfaceatudy2 2nd method");
		
	}

}
