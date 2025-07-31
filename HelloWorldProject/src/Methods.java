public class Methods {
    static String classLevelVariable= "variable a nivel de clase";
    public static  void main(String[] args){
        displayMessage("Primer mensaje personalizado ");
        displayMessage(classLevelVariable);
    }

    public static void displayMessage( String message ){
        System.out.println(message);
    }
}
