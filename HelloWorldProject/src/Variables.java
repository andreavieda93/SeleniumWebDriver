public class Variables {
static String classLevelVariable= "variable a nivel de clase";
public static  void main(String[] args){
        String greeting ="Hello World";
        int number=5;
        boolean isJavaFun= true;

        System.out.println(greeting);
        System.out.println(number);
        System.out.println(isJavaFun);

        displayMessage();
        System.out.println(classLevelVariable);
    }

    public static void displayMessage( ){
        String  localMessage="esta es una variable local";
        System.out.println(localMessage);
    }
}
