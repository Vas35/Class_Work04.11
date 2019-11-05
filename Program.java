package ua.univer.classWork;

public class Program {

	public static void main(String[] args) {
//Task1		
		int [] myArr = new int [10];
		MyLib.array(myArr);
		MyLib.printArr(myArr);
		
//Task2		
		int n = 10;
		int [] masN = new int [n];
		MyLib.createMas(masN);
	    MyLib.masMin(masN);
	    
//Task3
	    MyLib.masMax(masN);
	    
//Task4
int [] array = {4, -5, 0, 6, 8};
MyLib.minMax(array);
for (int i = 0; i < array.length; i++) {
	System.out.print(array[i]+", ");	
}
//Task5
int average = MyLib.sumArr(array)/array.length;
System.out.print("\n"+"average = "+average+";");

		

	}
}


