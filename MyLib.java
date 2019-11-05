package ua.univer.classWork;

public class MyLib {
	//Task1	
	public static void array(int[] mas) {
		int count = 0;
		int index = 0;
		while (true) {
			count++;
			if (count % 2 != 0) {
				index++;
				mas[index] = count;
			}
			if (index == 9) {
				break;
			}
		}
	}

	public static void printArr(int[] printArr) {
		for (int i = 0; i < printArr.length; i++) {
			System.out.print(printArr[i] + ", ");
		}
	}

	//Task2
	public static void createMas (int[] mas) {
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			count++;
			mas[i] = count;
		
	    	System.out.print("\nmas[" + i + "]=" + mas[i]+"\n");
		}
	}
	//Task3
	public static int masMin (int[] mass) {
	int min = mass[0];
	int count = 1;
	for (int i = 0; i < mass.length; i++) {
		if (min>mass[i]) { 
			min = mass[i];
			count++;
		}
			
	}
	System.out.println("min="+min);
	System.out.println("Совпадений min = " + count);
	return min;
	}
	//Task3
	public static int masMax(int[] mass) {
		int max = mass[0];
		for (int i = 0; i < mass.length; i++) {
			if (max < mass[i]) {
				max = mass[i];
			}
		}
		System.out.println("max="+max);
		return max;
	}
	
	//Task4
	
	public static void minMax(int[] mass) {
		int min = MyLib.masMin(mass);
		int max = MyLib.masMax(mass);
		for (int i = 0; i < mass.length; i++) {
			if(mass[i] == min ) mass[i] = max;
			else if(mass[i] == max) mass[i]= min;
		}
	}
	//Task5
	public static int sumArr (int[] mass) {
		int temp = 0;
		for (int i = 0; i < mass.length; i++) {
			temp += mass[i] ;	
		} 
	return temp;
	}
}
