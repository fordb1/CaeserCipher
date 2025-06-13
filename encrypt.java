import java.util.*
import java.io.*

public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter text to encrypt: ");
  String inputText = scanner.nextLine();

  System.out.print("Enter shift key (0-25): ");
  int shiftKey = scanner.nextInt();

  String encrypted = encrypt(inputText, shiftKey);
  System.out.println("Encrypted text: " + encrypted);
}
public String encrypt(String text, int shift){
  StringBuilder result = new StringBuilder();
  for(char character : text.toCharArray()){
    if(Character.isLetter(character)){
      char base = Character.isLowerCase(character) ? 'a' : 'A';
      char shifted = (char) ((character - base + shift) % 26 + base);
      result.append(shifted);
    } else{
      result.append(character);
    }
  }
  return result.toString();
}
