package patterns;

public class InnerBuilder {
	private String sName;
	private int iNum;
			
	
	public String getsName() {
		return sName;
	}
	public int getiNum() {
		return iNum;
	}
	
	@Override
	public String toString() {
		return "Name : "+ sName + " value: "+iNum;
	}
	
	public static class Builder {
		private final InnerBuilder inner = new InnerBuilder();
				
		public Builder setsName(String in_sName) {
			inner.sName = in_sName;
			return this;
		}

		public Builder setiNum(int in_iNum) {
			inner.iNum = in_iNum;
			return this;
		}
		
		public InnerBuilder getInstance() {
			return inner;
		}
	}

	private InnerBuilder() {}	

	public static void main(String [] args)
	{
		InnerBuilder b = new InnerBuilder.Builder().setsName("Gogi").setiNum(1).getInstance();
		System.out.println(b.toString());
	}
}