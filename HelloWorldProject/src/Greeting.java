public class Greeting {
    public void hello (){
        System.out.println("Helllo from the Greetingg class!");
    }
   public static void main (String[] args ){
        String greeting= getGreeting();
        System.out.println(greeting);
        int result= addNumbers(2,3);
       System.out.println(result);
   }
    public static String getGreeting (){
        return "Hello, welcome to java";
    }

    public static int addNumbers (int number1, int number2){
        return number1 + number2;

    }
}
