
public class MyString {

	public static String reverse(String str)
	{
		String rev="";
		for(int i=length(str)-1;i>=0;i--)
		{
			rev=rev+(str.charAt(i));
		}
		return rev;
	}
	
	public static int length(String str)
	{
		int i=0;
		try
		{
			while(i>=0)
			{
			char ch=str.charAt(i);
			i++;
			}
		
		}
		catch(Exception e)
		{
			return i;
		}
		return 0;
	}
	
	public static String append(String str1,String str2)
	{
		String res="";
		for(int i=0;i<length(str1);i++)
		{
			res=res+str1.charAt(i);
		}
		for(int i=0;i<length(str2);i++)
		{
			res=res+str2.charAt(i);
		}
		return res;
	}
	
	public static String insert(String str,String str1,int i)
	{
		String res="";
		try
		{
			int l=0;
			while(l<length(str))
			{
				if(l==i)
				{
					for(int k=0;k<length(str1);k++)
					{
						res=res+str1.charAt(k);
					}
					i--;
				}
				else
				{
					res=res+str.charAt(l);
					l++;
				}
			}
			str.charAt(i);
		}
		catch(Exception e)
		{
			return "Please enter the index within the length of first String";
		}
		return res;
	}
	
	public static String erase(String str,char ch)
	{
		String res="";
		for(int i=0;i<length(str);i++)
		{
			if(str.charAt(i)!=ch)
			{
				res=res+str.charAt(i);
			}
		}
		return res;
	}
	
	public static String replace(String str,String str1,String str2)
	{
		String res="";
		int s=0;
		int e=0;
		int check=0;
		for(int j=0;j<length(str);j++)
		{
			if(str.charAt(j)==str1.charAt(0))
			{
				check=1;
				s=j;
				if(length(str1)>1)
				{
					for(int k=1;k<length(str1);k++)
					{
						j=j+1;
						if(str.charAt(j)==str1.charAt(k));
						else
							return "Invalid Input";
						
					}
				}
				e=j;
				break;
			}
			else
				res=res+str.charAt(j);
		}
		if (check==0)
			return "Invalid Input";
		for(int x=0;x<length(str2);x++)
			res=res+str2.charAt(x);
		int i=e+1;
		while(i<length(str))
		{
			res=res+str.charAt(i);
			i++;
		}
		return res;
	}
	public static String swap(String str,String str1)
	{
		String temp=str;
		str=str1;
		str1=temp;
		return str+" "+str1;
	}
	
	public static int find(String str,String str1)
	{
		int s=0;
		int e=0;
		int check=0;
		for(int j=0;j<length(str);j++)
		{
			if(str.charAt(j)==str1.charAt(0))
			{
				check=1;
				s=j;
				if(length(str1)>1)
				{
					for(int k=1;k<length(str1);k++)
					{
						j=j+1;
						if(str.charAt(j)==str1.charAt(k));
						else
						{
							check=0;
							continue;
						}
						
					}
				}
				if(check==1)
				{
					e=j;
					break;
				}
			}
		}
		if (check==0)
			return -1;
		return s;
	}
	
	public static int rfind(String str,String str1)
	{
		int s=0;
		int e=0;
		int check=0;
		for(int j=0;j<length(str);j++)
		{
			if(str.charAt(j)==str1.charAt(0))
			{
				check=1;
				s=j;
				if(length(str1)>1)
				{
					for(int k=1;k<length(str1);k++)
					{
						j=j+1;
						if(str.charAt(j)==str1.charAt(k));
						else
						{
							check=0;
							continue;
						}
						
					}
				}
				if(check==1)
				{
					e=j;
					continue;
				}
			}
		}
		if (check==0)
			return -1;
		return s;
	}
	
	public static char[] toCharArray(String str)
	{
		char ch[]=new char[length(str)];
		for(int y=0;y<length(str);y++)
		{
			ch[y]=str.charAt(y);
		}
		return ch;
	}
	public static void main(String[] args)
	{
		String s="aswan";
		String s1="kumar";
		System.out.println("reverse() method------");
		System.out.println(reverse(s));
		System.out.println("length() method------");
		System.out.println(length(s));
		System.out.println("append() method------");
		System.out.println(append(s,s1));
		System.out.println("insert() method------");
		System.out.println(insert(s,s1,4));
		System.out.println("erase() method------");
		System.out.println(erase(s,'n'));
		System.out.println("replace() method------");
		System.out.println(replace("aswan","n","snigdha"));
		System.out.println("swap() method------");
		System.out.println(swap("aswan","snigdha"));
		System.out.println("find() method------");
		System.out.println(find("snigdha padhi","dh"));
		System.out.println("rfind() method------");
		System.out.println(rfind("snigdha padhi","dh"));
		System.out.println("toCharArray() method------");
		System.out.println(toCharArray("snigdha padhi"));
	}
}
