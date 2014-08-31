package Prototypes;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {

	private static List<String> childrenList = new ArrayList<String>();
	private static void initializePrototypes()
	{
		PrototypeFactory.register(new Child1());
		PrototypeFactory.register(new Child2());
	}
	private static void initializeChildrenNames()
	{
		childrenList.add("Child 1");
		childrenList.add("Child 2");
		childrenList.add("Child 3");
		childrenList.add("Child 4");
		childrenList.add("Child 5");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		initializePrototypes();
		initializeChildrenNames();
		for (String name : childrenList){
			Command obj = ((Command)PrototypeFactory.clone(name));
			if (obj != null) 
				obj.execute();
		}	
	}
}
