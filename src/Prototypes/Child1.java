package Prototypes;

public class Child1 implements Prototype, Command {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println(name() + " is known child");
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Child 1";
	}	

	public Prototype clone()
	{
		return new Child1();
	}
}
