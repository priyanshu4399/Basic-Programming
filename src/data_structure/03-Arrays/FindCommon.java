package data_structure.arrays;

public class FindCommon {
	
	//TC : O(a*b) SC: O(1)
	public static boolean findCommon1(char[] arr1, char[] arr2) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0; i< arr2.length;i++) {
				if(arr1[i]==arr2[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	//TC : O(a+b) SC: O(n)
	public static boolean findCommon2(char[] arr1, char[] arr2) {
		boolean[] alphaMap = new boolean[26];
		
		//setting true for ascii value of each element in arr1
		int pos = 0;
		for(int i=0;i<arr1.length;i++) {
			pos = arr1[i]-'a';
			alphaMap[pos]=true;
			
		}
		pos = 0;
		for(int i=0;i<arr2.length;i++) {
			pos = arr2[i]-'a';
			if(alphaMap[pos]) {
				return true;
			}
			
		}
		return false;
	}
	
	public static void main(String[] args) {
		char[] arr1 = new char[] {'a','b','c','x','y'};
		char[] arr2 = new char[] {'p','r','z','i','j'};
		System.out.println(findCommon2(arr1, arr2));
		
		
	}

}
