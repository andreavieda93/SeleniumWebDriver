public class Main {
    public static void  main (String[] args){
        //deshabilitar codigo de  lecturas anteriores para enfocarnos en el ejemplo actual
        /*
        System.out.println("Hello World!");
        Greeting greeting = new Greeting();
        greeting.hello();
        */

        Messenger messenger = new Messenger();
        messenger.sendMessage();

        Calculator calculator = new Calculator();
        int sum = calculator.add(18,5);
        System.out.println(sum);
        int difference =calculator.subtract(18,5);
        System.out.println(difference);
    }
    public static  int addNumbers(int number1, int number2){
        return number1 + number2;
    }
}
