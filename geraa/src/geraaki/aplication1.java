package geraaki;

import java.util.Arrays;

public class aplication {


public static void main(String[] args){
	
	
			boolean b = true;
			char c = 'p';
			byte bt = 3;
			short s = 1;
			int i = 19;
			long l = 16;
			float f = 23.0f;
			double d = 42.0;
			
			System.out.println("Max values for basic data types:");
			System.out.println("boolean = " + Boolean.TRUE);
			System.out.println("byte = " + Byte.MIN_VALUE);
			System.out.println("short = " + Short.MAX_VALUE);
			System.out.println("int = " + Integer.MAX_VALUE);
			System.out.println("long = " + Long.MAX_VALUE);
			System.out.println("char = " + l);
			System.out.println("float = " + Float.MAX_VALUE);
			System.out.println("boolean = " + Boolean.FALSE);
			System.out.println("double = " + Double.MAX_VALUE);
			
			int [] array = {150, 12, 598, 32, 77, 45, 1, 56, 999, 78, 5, 89, 101};
			
			int max = array[0];
			int min = array[0];
			
			for (int j = 0; j < array.length; j++) {
				if(max < array[j])
					max = array[j];
				if(min > array[j])
					min = array[j];
			}
			
			System.out.println();
			System.out.println(" at array: " + Arrays.toString(array));
			System.out.println("max is " + max);
			System.out.println("min is " + min);

		}

	}
