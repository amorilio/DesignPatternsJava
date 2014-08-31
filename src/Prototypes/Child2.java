package Prototypes;

public class Child2 implements Prototype, Command {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println(name() + " is known child");
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Child 2";
	}
	
	public Prototype clone()
	{
		return new Child2();
	}

}
