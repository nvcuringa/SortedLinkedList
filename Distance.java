//Name: Nick Curinga
//Date: 10/15/2014



public class Distance implements Comparable{

	private int foot;
	private int inch;
	
	public Distance()
	{
		foot = 0;
		inch = 0;
		
	}
	
	public Distance(int f, int i)
	{
		foot = f+i/12;
		inch = i%12;
	}
	
	public String toString() 
	{
		String str = (foot+" feet "+inch+" inches");
		return str;
	}
	
	public int compareTo(Object d)
	{
	
		Distance x = (Distance)d;
		int s1 = foot*12+inch;
		int s2 = x.foot*12+x.inch;
		 if(s1 == s2)
			 return 0;
		 else if(s1<s2)
			 return -1;
		 else
			 return 1;
		 
	}
	
}
	
