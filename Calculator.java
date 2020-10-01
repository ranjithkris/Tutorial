import java.util.*;

class Calculator{

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

    private static double getFirstNumber() throws NumberFormatException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        String b = sc.nextLine();

        if ("M1".equals(b.toUpperCase()))
            return firstLevelMemory;
        return Double.parseDouble(b);
    }

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

    public static double add(double c, double d)
    {
        return c+d;
    }

    public static double sub(double c, double d)
    {
        return c-d;
    }
    public static double mul(double c, double d)
    {
        return c*d;
    }
    public static double div(double c, double d)
    {
        return (double) c/d;
    }
    public static double mod(double c, double d)
    {
        return c%d;
    }


}