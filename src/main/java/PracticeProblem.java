public class PracticeProblem {

	public static void main(String args[]) {
		System.out.print(getAge(new String[]{"Rachel"}, new int[]{24}, "Rachel"));
	}
public static boolean isPalindrome(String word){

word = word.replace(" ", "");
word = word.toLowerCase();
for (int i = 0; i<word.length(); i++){
	if (word.charAt(i)!=(word.charAt(word.length()-1-i))){
		return false;
	}
}
return true;
}

public static int getAge(String[] names, int[] ages, String name){
	int age = 0;
	for (int i=0; i<names.length; i++){
		if (names[i].equals(name)){
age =  ages[i];
		}
	}
return age;
}

public static int countWords(String word, char letter){
	int count = 0;
	String[] wordArr1 = word.split(" ");
	for (int i = 0; i<wordArr1.length; i++){
		for (int j = 0; j<wordArr1[i].length(); j++){
					if (wordArr1[1].charAt(j)==letter){
			count+=1;
		}
		}

	}
	return count;
}

}
