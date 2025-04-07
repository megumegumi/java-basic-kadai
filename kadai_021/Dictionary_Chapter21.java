package kadai_021;
import java.util.Dictionary;
import java.util.HashMap;
public class Dictionary_Chapter21{
	public static void main(String[] args) {
		HashMap<String,String> Dictionary = new HashMap<String,String>();
		Dictionary.put("apple", "りんご");
        Dictionary.put("peach", "桃");
        Dictionary.put("banana", "バナナ");
        Dictionary.put("lemon", "レモン");
        Dictionary.put("pear", "梨");
        Dictionary.put("kiwi", "キウィ");
        Dictionary.put("strawberry", "いちご");
        Dictionary.put("grape", "ぶどう");
        Dictionary.put("muscat", "マスカット");
        Dictionary.put("cherry", "さくらんぼ");
	}
	{
	for (Map.Entry<String, String> entry : Dictionary.entrySet()) {
	    System.out.println(entry.getKey() + " : " + entry.getValue());
	}
	{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter an English fruit name:");
String input = scanner.nextLine();
if (Dictionary.containsKey(input)) {
    System.out.println("The Japanese word for " + input + " is " + Dictionary.get(input));
} else {
    System.out.println("Fruit not found in the dictionary.");
}
	}
	

	

	

	

	
        

