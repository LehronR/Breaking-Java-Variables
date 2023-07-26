public class variableTesting {
    public static void main(String[] args) {
//        COMMENTED OUT VARIABLES TO TEST EACH INDIVIDUALLY AND SEE WHAT TYPES OF ERRORS I WOULD RECEIVE.

//        int number;
//        Still blows my mind that String isn't a reserved keyword and can be used as a variable name lol.
//        String String = "some text";
//        byte num = 150;
//        byte double;
//        String &word;
//        String sameName = "First definition of this name.";
//        String varWithinTwoParentScopes = "First definition of this variable name";
//        int 2seven = 8;

//        System.out.println(number);
//        System.out.println(byte);
//        System.out.println(num);
//        System.out.println(String);
//        System.out.println(2seven);

        for(int i = 0; i < 3; i++) {
            String sameName = "Testing if different scoped variables can have the same name.";
            System.out.println(sameName);
            if(true) {
                String varWithinTwoParentScopes = "Still throws an error, I'm guessing due to variables being able to access variables all the way the the global scope.";
                System.out.println(varWithinTwoParentScopes);
            }
        }
    }
}
