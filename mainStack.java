
public class mainStack {
	
	
	public static void Even(StackInt <Integer> s1,StackInt <Integer> s2,StackInt <Integer> s3)//F1 סכום מספרים זוגיים ומדפיס אי זוגי שנשאר
	{
		int sum=0;
		int u;
		while(!s1.IsEmpty())
		{
			u=s1.Pop();
			if(u%2==0) {
				s2.Push(u);
				sum=sum+s2.Pop();
				
				
			}
			
			else {
				s3.Push(u);
			}
		}
		
		while(!s3.IsEmpty())
		{
			s2.Push(s3.Pop());
			
		}
		System.out.println("Sum Even="+sum);
	}
	
	public static int max2(StackInt <Integer> s1)//F2 למצוא מקסימום שני
	{
		
		StackInt <Integer> temp=new StackInt <Integer>();
		
		int temp1,max1=0,max2=0;
		while(!s1.IsEmpty())
		{	
			temp1=s1.Pop();
			temp.Push(temp1);
			if(max1<temp1) {
				max2=max1;
				max1=temp1;
			}
		
			else if(temp1>max2&&max1!=temp1) {
				max2=temp1;
			}
			
		}	
		
		
		while(!temp.IsEmpty())
			s1.Push(temp.Pop());
		return max2;
	}
	public static int min2(StackInt <Integer> s1)//F3 למצוא מינימום שני
	{
		
		StackInt <Integer> temp=new StackInt <Integer>();
		
		int temp1,min1=0,min2=0;
		while(!s1.IsEmpty())
		{	
			temp1=s1.Pop();
			temp.Push(temp1);
			if(min1<temp1) {
				
				min1=temp1;
			}
		
			else if(temp1>min2&&temp1!=min1) {
				min2=temp1;
			}
			
		}	
		
		
		while(!temp.IsEmpty())
			s1.Push(temp.Pop());
		return min2;
	}

	public static void Doubledigit(StackInt <Integer> s1,StackInt <Integer> s2,StackInt <Integer> s3)//F4 להעביר כל המספרים הדו ספרתיים לסוף המחסנית
	{
		
		int u;
		while(!s1.IsEmpty())
		{
			u=s1.Pop();
			if(u>9&&u<100) {
				s2.Push(u);
			}
			
			else {
				s3.Push(u);
			}

				
			
		}

		while(!s3.IsEmpty())
		{
			s2.Push(s3.Pop());
		}
		
	}
	
	public static void MiddleMove(StackInt <Integer> s1) {//F5 להעביר ספרה אמצעית לתחילת המחסנית
		
		StackInt <Integer> temp=new StackInt <Integer>();
		int i=0;
		int counter1=0,counter2=0;
		while(!s1.IsEmpty()) {
			temp.Push(s1.Pop());
			counter1++;
		}
		while(!temp.IsEmpty()) {
			if(counter1/2==counter2)
				i=temp.Pop();
			else
			{
				s1.Push(temp.Pop());
			}
			counter2++;
		}
		s1.Push(i);
	}
	
	public static void reverse(StackInt <Integer> s1) {//F6 להפוך סדר של המחסנית
		
		
		StackInt <Integer> temp1=new StackInt <Integer>();
		StackInt <Integer> temp2=new StackInt <Integer>();
		while(!s1.IsEmpty()) {
		temp1.Push(s1.Pop());
		}
		while(!temp1.IsEmpty()) {
		temp2.Push(temp1.Pop());
		}
		while(!temp2.IsEmpty()) {
		s1.Push(temp2.Pop());
		}	
			
	
		
		
		
	}
	public static int Countmax(StackInt <Integer> s1) {//F7 כמה תואמים למספר מקסימום
		
		StackInt <Integer> temp=new StackInt <Integer>();
		
		int count=1,max1=0,temp1;
		while(!s1.IsEmpty())
		{	
			temp1=s1.Pop();
			temp.Push(temp1);
			if(max1<temp1) {
				
				max1=temp1;
				count=1;
			}
			else if(temp1==max1) {
				count++;
			}
	
		}
		return count;
		
		
	}


	public static void RemoveNum (StackInt <Integer> s1,int d) {//F8 מוחק את כל המספרים לפי הספרה שבחרתי נניח 7 מוחק את כל השבעיות
		
		int i;
		StackInt <Integer> temp=new StackInt <Integer>();
		while(!s1.IsEmpty()) {
			i=s1.Pop();
			if(i!=d)
				temp.Push(i);
		}
		
		while(!temp.IsEmpty())
		{
			
			s1.Push(temp.Pop());
			
		}
		
		
		
	}
	public static int RemoveNum(StackInt <Integer> s1) {//F9 איזו סיפרה מופיעה הכי הרבה פעמים
	
		int i,count=0,place=0;
		int arr[]= {0,0,0,0,0,0,0,0,0,0};
		while(!s1.IsEmpty()) {
			i=s1.Pop();
			while (i>0)
			{
				arr[i%10]++;
				if (count<arr[i%10])
				{
					count=arr[i%10];
					place=i%10;
				}
				i=i/10;
			}
		}
		return place;
	}
	
	public static void PushTor(StackInt <Integer> s1,int d) {//F10 פונקציית עזר לתרגיל 10
		
		s1.Push(d);
	}
	
	public static int Poptour(StackInt <Integer> s1,StackInt <Integer> s2) {//F10 משתמש בעזרת מחסניות כדי להציג תור
		
		if(s2.IsEmpty()) {
			while(!s1.IsEmpty()) {
				s2.Push(s1.Pop());
			}
		}
		return s2.Pop();
	}
	
	public static boolean DifferentNum(StackInt <Integer> s1) {//F11 בודקת האם כל האיברים שונים זה מיזה.אם שונים תחזיר אמת,אחרת שקר
		
		
		int i,j;
		StackInt <Integer> temp=new StackInt <Integer>();
		StackInt <Integer> temp2=new StackInt <Integer>();
		while(!s1.IsEmpty()) {
			i=s1.Pop();
			while(!temp.IsEmpty()) {
			j=temp.Pop();
			if(j==i)
				return false;
			temp2.Push(j);
			}
			while(!temp2.IsEmpty()) {
			temp.Push(temp2.Pop());
			}
			temp.Push(i);
		}
		return true;
		
		
	}
	
public static void PrimeNum (StackInt <Integer> s1) {//F12 מוציא מהמחסנית כל המספרים הראשוניים
		
		int i,flag=1;
		StackInt <Integer> temp=new StackInt <Integer>();
		while(!s1.IsEmpty()) {
			flag=1;
			i=s1.Pop();
			for(int j=2;j<i;j++)
			if(i%j==0) {
				flag=0;
			}
	if (flag==1) {
		temp.Push(i);
	}
		}
		while(!temp.IsEmpty()) {
			s1.Push(temp.Pop());
		}
}
	public static void main(String[] args) {
		
		StackInt<Integer> s1=new StackInt<Integer>();
		StackInt<Integer> s2=new StackInt<Integer>();
		StackInt<Integer> s3=new StackInt<Integer>();
	
		s1.Push(2);
		s1.Push(8);
		s1.Push(5);
		s1.Push(8);
		s1.Push(9);
		s1.Push(7);
		System.out.println("Function 1 - סכום מספרים זוגיים ומדפיס אי זוגי שנשאר ");
		System.out.println();
		Even(s1,s2,s3);
		while (!s2.IsEmpty()) {
			System.out.println("odd number = "+s2.Pop());
		}
		System.out.println("=================");
		StackInt<Integer> s4=new StackInt<Integer>();
		s4.Push(10);
		s4.Push(88);
		s4.Push(5);
		s4.Push(8);
		s4.Push(22);
		System.out.println("Function 2 - למצוא מקסימום שני");
		System.out.println();
		System.out.println("Max 2 Is :"+max2(s4));
		System.out.println("=================");
		
		
		System.out.println("Function 3 - למצוא מינימום שני");
		System.out.println();
		StackInt<Integer> s5=new StackInt<Integer>();
		s5.Push(100);
		s5.Push(88);
		s5.Push(5);
		s5.Push(2);
		s5.Push(22);
		System.out.println("Min 2 Is :"+min2(s5));
		System.out.println("=================");
		
		
		
		System.out.println("Function 4 - להעביר כל המספרים הדו ספרתיים לסוף המחסנית");
		System.out.println();
		StackInt<Integer> s7=new StackInt<Integer>();
		StackInt<Integer> s8=new StackInt<Integer>();
		StackInt<Integer> s9=new StackInt<Integer>();
	
		s7.Push(2277);
		s7.Push(80);
		s7.Push(559);
		s7.Push(886);
		s7.Push(99);
		s7.Push(445);
		s7.Push(40);
		Doubledigit(s7,s8,s9);
		while (!s8.IsEmpty()) {
			System.out.println(s8.Pop());
		}
		System.out.println("=================");
		System.out.println("Function 5 - להעביר ספרה אמצעית לתחילת המחסנית");
		System.out.println();
		StackInt<Integer> s10=new StackInt<Integer>();
		s10.Push(6);
		s10.Push(5);
		s10.Push(4);
		s10.Push(3);
		s10.Push(2);
		s10.Push(1);
		MiddleMove(s10);
		while (!s10.IsEmpty()) {
			System.out.println(s10.Pop());
		}
		System.out.println("=================");
		System.out.println("Function 6 - להפוך סדר של המחסנית");
		System.out.println();
		StackInt<Integer> s11=new StackInt<Integer>();
		s11.Push(60);
		s11.Push(50);
		s11.Push(40);
		s11.Push(30);
		s11.Push(20);
		s11.Push(10);
		reverse(s11);
		while (!s11.IsEmpty()) {
			System.out.print(" "+s11.Pop());
	}
		System.out.println();
		System.out.println("=================");
		System.out.println("Function 7 - כמה תואמים למספר מקסימום");
		System.out.println();
		StackInt<Integer> s12=new StackInt<Integer>();
		s12.Push(600);
		s12.Push(50);
		s12.Push(40);
		s12.Push(600);
		s12.Push(200);
		s12.Push(60);
		s12.Push(100);
		s12.Push(80);
		s12.Push(600);
		
		System.out.println("Equal to Maximum : "+Countmax(s12));
		
		System.out.println("=================");
		System.out.println("Function 8 - מוחק את כל המספרים לפי הספרה שבחרתי נניח 7 מוחק את השבעיות");
		System.out.println();
		int d=7;
		StackInt<Integer> s13=new StackInt<Integer>();
		s13.Push(7);
		s13.Push(40);
		s13.Push(7);
		s13.Push(30);
		s13.Push(7);
		s13.Push(20);
		s13.Push(7);
		s13.Push(10);
		RemoveNum(s13,d);
		while (!s13.IsEmpty()) {
			System.out.println(s13.Pop());
	}
		System.out.println("=================");
		System.out.println("Function 9 - איזו סיפרה מופיעה הכי הרבה פעמים");
		System.out.println();
		StackInt<Integer> s14=new StackInt<Integer>();
		s14.Push(7);
		s14.Push(470);
		s14.Push(7);
		s14.Push(370);
		s14.Push(7);
		s14.Push(20);
		s14.Push(7);
		s14.Push(10);
		System.out.println("Digit of most Show :"+RemoveNum(s14));
		
		System.out.println("=================");
		System.out.println("Function 10 - משתמש בעזרת מחסניות כדי להציג תור");
		System.out.println();
		StackInt<Integer> s15=new StackInt<Integer>();
		StackInt<Integer> s16=new StackInt<Integer>();
		PushTor(s15,60);
		PushTor(s15,50);
		PushTor(s15,40);
		PushTor(s15,30);
		PushTor(s15,20);
		PushTor(s15,10);
		System.out.println(Poptour(s15,s16));
		System.out.println(Poptour(s15,s16));
		System.out.println(Poptour(s15,s16));
		System.out.println("=================");
		System.out.println("Function 11 - בודקת האם כל האיברים שונים זה מיזה.אם שונים תחזיר אמת,אחרת שקר");
		System.out.println();
		StackInt<Integer> s17=new StackInt<Integer>();
		s17.Push(8);
		s17.Push(470);
		s17.Push(8);
		s17.Push(370);
		s17.Push(8);
		s17.Push(20);
		s17.Push(8);
		s17.Push(10);
		System.out.println("Numbers Differens is :"+DifferentNum(s17));
		
		System.out.println("=================");
		System.out.println("Function 12 - מוציא מהמחסנית כל המספרים הראשוניים");
		System.out.println();
		StackInt<Integer> s18=new StackInt<Integer>();
		s18.Push(8);
		s18.Push(4);
		s18.Push(3);
		s18.Push(5);
		s18.Push(12);
		s18.Push(23);
		s18.Push(7);
		s18.Push(10);
		PrimeNum(s18);
		while (!s18.IsEmpty()) {
			System.out.println(s18.Pop());
	}
		
		
		
}
	
}	
		
	
	

