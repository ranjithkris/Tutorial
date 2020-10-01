import java.util.*;

/**
 * This class contains the simple command line calculator with the first level memory option.
 */
class Calculator{

    /*
    First level memory
     */
    private static double firstLevelMemory = 0.0;

    public static void main(String[] args) {

        System.out.println("------------------Welcome to Calculator----------------");

        double cache = 0.0;

        while(true){

            System.out.println(" ");
            System.out.println("Please select the operators:"+"\n"+"1. Addition" +"\n"+"2. Subtraction"+"\n"+"3. Multiplication"+
                    "\n"+"4. Division" + "\n" +"5. Modulus" +"\n" +
                    "6. Save previous result into memory\n" + "7. Exit");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your option: ");

            try {
                int op = Integer.parseInt(sc.nextLine());

                /* Switch statement is used for selecting the operator  */
                switch(op){
                    case 1 :
                        cache = add(getFirstNumber(),getSecondNumber());
                        System.out.print("Addition value:" + cache +"\n");
                        break;
                    case 2 :
                        cache = sub(getFirstNumber(),getSecondNumber());
                        System.out.print("Addition value:" + cache +"\n");
                        break;
                    case 3 :
                        cache = mul(getFirstNumber(),getSecondNumber());
                        System.out.print("Addition value:" + cache +"\n");
                        break;
                    case 4 :
                        cache = div(getFirstNumber(),getSecondNumber());
                        System.out.print("Addition value:" + cache +"\n");
                        break;
                    case 5 :
                        cache = mod(getFirstNumber(),getSecondNumber());
                        System.out.print("Addition value:" + cache +"\n");
                        break;
                    case 6:
                        firstLevelMemory = cache;
                        System.out.println(cache + " saved in M1. Use M1 to retrieve.");
                        break;
                    case 7 :
                        System.exit(0);
                    default :
                        System.out.println("Invalid option!!!");
                }
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    /**
     * Reads the first number from the user.
     * @return First number
     * @throws NumberFormatException If fails to convert user input into double.
     */
    private static double getFirstNumber() throws NumberFormatException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        String b = sc.nextLine();

        if ("M1".equals(b.toUpperCase()))
            return firstLevelMemory;
        return Double.parseDouble(b);
    }

    /**
     * Reads the second number from the user.
     * @return Second number
     */
    private static double getSecondNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the second number:");
        String b = sc.nextLine();

        if ("M1".equals(b.toUpperCase()))
            return firstLevelMemory;

        double temp = 0;
        try {
            temp = Double.parseDouble(b);
        } catch (NumberFormatException ex) {
            throw new NumberFormatException("Invalid First number");
        }

        return temp;
    }

    /**
     * Add two number
     * @param num1 First number
     * @param num2 Second number
     * @return Addition result
     */
    public static double add(double num1, double num2)
    {
        return num1 + num2;
    }

    /**
     * Sub two number
     * @param num1 First number
     * @param num2 Second number
     * @return Sub result
     */
    public static double sub(double num1, double num2)
    {
        return num1 - num2;
    }

    /**
     * Mul two number
     * @param num1 First number
     * @param num2 Second number
     * @return Mul result
     */
    public static double mul(double num1, double num2)
    {
        return num1 * num2;
    }

    /**
     * Div two number
     * @param num1 First number
     * @param num2 Second number
     * @return Div result
     */
    public static double div(double num1, double num2)
    {
        return num1 / num2;
    }

    /**
     * Mod two number
     * @param num1 First number
     * @param num2 Second number
     * @return Mod result
     */
    public static double mod(double num1, double num2)
    {
        return num1 % num2;
    }
}