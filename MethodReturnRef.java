class Main
{
	int a;
	Main(int x)
	{
		a=x;
	}
	Main IncByTen()
	{
		Main obj=new Main(a+10);
		return obj;
	}
}
class MethodReturnRef
{
	public static void main(String args[])
	{
		Main obj1=new Main(10);
		Main obj2;
		obj2=obj1.IncByTen();
		System.out.println(obj2);
	}
}