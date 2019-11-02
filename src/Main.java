public class Main {

	public static void main(String[] args) {
		FibSeries(18);
		System.out.println();
		FibSeries2(18);
	}
	public static void FibSeries(int limit){
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");

		for(int i=0;i<limit;i++){
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
	public static void FibSeries2(int limit){
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");

		int c=0;
		while ((a+b)<=limit){
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;

		}
	}
}


