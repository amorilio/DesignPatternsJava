package Prototypes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class PrototypeFactory {
	private static ArrayList< Prototype > listPrototypes = new ArrayList<Prototype>();
	
	public static void register(Prototype prototype)
	{
		listPrototypes.add(prototype);
	}
	
	public static Prototype clone(String name)
	{		
		ListIterator<Prototype> it = listPrototypes.listIterator();
		while (it.hasNext())
		{
			Prototype p = it.next(); 
			if (p.name().equals(name))
				return p.clone(); 
		}
	    System.out.println( name + " not found" );
	    return null;
	}
}
