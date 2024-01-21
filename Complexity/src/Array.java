import java.util.Arrays;

public class Array {
	
public static int example1(int[] arr) {
	int n = arr.length, total = 0;
	for(int j = 0; j<n; j++)
		total +=arr[j];
	return total; 
}
public static int example2(int[] arr) {
	int n = arr.length, total = 0;
	for(int j = 0; j<n; j+=2)
		total +=arr[j];
	return total; 
}
public static int example3(int[] arr) {
	int n = arr.length, total = 0;
	for(int j = 0; j<n; j++)
		for(int k = 0; k<n; k++)
		total +=arr[j];
	return total; 
}
public static int example4(int[] arr) {
	int n = arr.length, prefix =0, total = 0;
	for(int j = 0; j<n; j++) {
		prefix +=arr[j];
		total +=prefix;
	}
		
	return total; 
}
//fini
public static int example5(int[] first, int[] second) {
	int n = first.length, count = 0;
	for(int i = 0; i<n; i++) {
		int total =0;
		for(int j = 0; j<n; j++) {
			for(int k = 0; k<n; k++) {
				total +=first[k];
				if(second[i]==total)count++; 
			}
		} 
	}
	return count; 
}

public static void main(String[] args) {
	int arrayUsed[]; 
	//int second[]; 
	
	/*for (int i =10; i<=1000; i+=10) {
		first = new int[i];
		Arrays.fill(first, 2);
		second = new int[i];
		Arrays.fill(second, 2);
		long startTime = System.nanoTime(); 
		example5(first,second);
		long stopTime = System.nanoTime(); 
		//System.out.println(i); 
		//System.out.println( ((i)+ "," +(stopTime - startTime)));
		
		System.out.println( stopTime - startTime);
	}
	*/
	for (int i =100; i<=100000; i+=100) {
		arrayUsed = new int[i];
		Arrays.fill(arrayUsed, 2);
		long startTime = System.nanoTime(); 
		example2(arrayUsed);
		long stopTime = System.nanoTime(); 
		//System.out.println(i); 
		//System.out.println( ((i)+ "," +(stopTime - startTime)));
				
		System.out.println( stopTime - startTime); 
	}
	
	
}
}


