package patterns;

import java.util.Vector;


interface BaseComposit
{
	public void print();
}

class Leaf implements BaseComposit
{
	private int data;
	public Leaf(int i) {i = data;}
	@Override
	public void print() {
		System.out.println(" "+data+" ");
	}
	
}
class NonLeaf implements BaseComposit
{
	private Vector<BaseComposit> children;
	public NonLeaf(Vector iChildren) {children = iChildren;}
	
	@Override
	public void print() {
		for (BaseComposit bc : children)
		{
			print();
		}
	}
	
}

public class Composite {
	public static void main(String[] args) {
		Vector<BaseComposit> children = new Vector<BaseComposit>();
		Leaf l = new Leaf(6);
		children.add(new Leaf(6));
		children.add(new Leaf(5));
		children.add(new Leaf(5));
	}
}
