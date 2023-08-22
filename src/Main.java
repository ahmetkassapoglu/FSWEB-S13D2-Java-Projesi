import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1002));
        System.out.println(isPerfect(6));
        System.out.println(numberToString(-21));
    }

    public static boolean isPalindrome(int num1){
    num1= Math.abs(num1);
   char[] digits = String.valueOf(num1).toCharArray();
    String reversed = "";
    for (int i = digits.length -1; i>= 0; i--){
    reversed += digits[i];
    }
    return Integer.parseInt(reversed) == num1;
    }
    public static boolean isPerfect(int num31){
        if (num31 <= 0){
            return false;
        }
        int sum = 0;
      for(int i=1; i<= num31/2; i++){

          if(num31 % i == 0){
              sum = sum +i;
          }
      }
      if(sum == num31){
          return true;
      }
      else {
          return false;
      }
    }
    public static String numberToString(int num2){
        if (num2 < 0){
            System.out.println("invalid");
        }
        char[] digits = String.valueOf(num2).toCharArray();
        String text = " ";
        for(char digit : digits){
            switch( digit) {
                case '0':
                    text += "Zero ";
                    break;
                case '1':
                    text += "One ";
                    break;
                case '2':
                    text += "Two ";
                    break;
                case '3':
                    text += "Three ";
                    break;
                case '4':
                    text += "Four ";
                    break;
                case '5':
                    text += "Five ";
                    break;
                case '6':
                    text += "Six ";
                    break;
                case '7':
                    text += "Seven ";
                    break;
                case '8':
                    text += "Eight ";
                    break;
                case '9':
                    text += "Nine ";
                    break;
                default:
                    // code block
            }
        }
   return text; }

}