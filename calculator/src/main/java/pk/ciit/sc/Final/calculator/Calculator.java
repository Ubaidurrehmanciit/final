package pk.ciit.sc.Final.calculator;

/**
 * @author Ubaid Ur Rehman
 *This is the Calculator class
 */
public class Calculator {
	
	/**
	 * @param num1:this is the first number
	 * @param num2:this is the second number
	 * @param num3:this is the third number
	 * @return
	 */
	public static int findMax(int num1,int num2,int num3){
		int[] arr={num1,num2,num3};
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
	
	/**
	 * @param num : This is the argument for claculating square
	 * @return : int value
	 * @throws IllegalArgumentException :when 0>values<10
	 */
	public int square(int num)throws IllegalArgumentException {
		int result = 0;
		if (num > 0 && num < 10) {
		result = num * num;
		} else
		throw new IllegalArgumentException();
		return result;
		}
	
	/**
	 * @param num : This is the argument for claculating cube
	 * @return :int value
	 */
	public static int cube(int num){
		int result=0;
		if(num >0 && num <10)
			result=num*num*num;
		else new IllegalArgumentException();
		return result;
	}
}
