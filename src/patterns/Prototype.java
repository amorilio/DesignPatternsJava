package patterns;

import java.awt.List;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Prototype
{
	interface clonnable	{
		clonnable clone();
	}
	
	static class Child1 implements clonnable
	{
		public clonnable clone()
		{
			return new Child1();
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub			
			return "This is Child1";
		}
	}
	
	static class Child2 implements clonnable
	{
		public clonnable clone()
		{
			return new Child2();
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub			
			return "This is Child2";
		}
	}
	
	static class PrototypeFactory
	{
		private static Map prototypesMap = new HashMap<String, clonnable>();
		static {
			prototypesMap.put("Child1", new Child1());
			prototypesMap.put("Child2", new Child2());
		}
		public static clonnable getClonnable( String name )
		{
			return ((clonnable)prototypesMap.get(name)).clone();
		}		
	}
	
	public static void main(String[] args) {
		System.out.println(PrototypeFactory.getClonnable("Child1").toString());
		System.out.println(PrototypeFactory.getClonnable("Child2").toString());		
	}
}