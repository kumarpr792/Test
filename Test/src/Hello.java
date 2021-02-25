import java.util.*;
/*class Patient{
	private int id;
	private String name;
	private String ssn;
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSsn(String ssn) {
		this.ssn=ssn;
	}
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getSsn() {
		return this.ssn;
	}
}*/
class Hello implements Comparator<String>{

	public static void main(String[] args){
		/*Patient p=new Patient();
		p.setId(1);
		p.setName("ABCD");
		p.setSsn("qwe");
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getSsn());*/
		Scanner s=new Scanner(System.in);
		/*String a[]=("she sells sea shells on sea shore").split(" ");
		
		int[] res = new int[10];/*
		for(int i=0;i<a.length;i++) {
			res[i]=Integer.parseInt(a[i]);
		}*/
		int[] result = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		for (int i:result) {
			System.out.println(i);
		}
		/*int c=0;
		for(int i=0;i<a.length();i++) {
			if(Character.isWhitespace(a.charAt(i))) {
				
				c+=1;
			}
		}
		System.out.println(c);*/
		Object o="kumar";
		String s1=(String)o;
		Hello o2=new Hello();
		//Integer i=Integer.parseInt(s1);
		//String s2=i.toString();
		//Long l=new Long(1000);
		String s3="kumar77777";
		String s4="kumar7777";
		String s2=new String(s4);
		System.out.println(s2.equals(s4));
		System.out.println(s2==s4);
		System.out.println(o2.compare(s3,s4));
		System.out.println(s3.compareTo(s4));
		Set<String> t=new TreeSet<>(new Hello());
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		System.out.println(t);
		System.out.println(s1.startsWith("k"));
		System.out.println(s1.endsWith("r"));
		System.out.println(s1.regionMatches(2, "mar", 0, 3));
		
		StringBuffer s5=new StringBuffer(s1);
		StringBuffer s6=new StringBuffer(s5);
		s5.reverse();
		if(s6.equals(s5)) {
			System.out.println("Strings are palindrome");
		}
	}

	@Override
	public int compare(String o1, String o2) {
		if(o1.length()>o2.length())
			return 1;
		else if(o1.length()<o2.length())
			return -1;
		else
			return o1.compareTo(o2);
	}
}