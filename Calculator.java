public class Calculator {
    public void display() {
        System.out.println("\n Hello and welcome!");
    }

    public int Add(int num1, int num2) {
        int Addition = num1 + num2;
        System.out.println("\n Addition Is:" + Addition);
        return Addition;
    }

    public int Sub(int num1, int num2) {
        int Substraction = 0;
        if (num1 > num2) {
            Substraction = num1 - num2;
        } else {
            Substraction = num2 - num1;
        }
        System.out.println("\n Subtraction  Is:" + Substraction);
        return Substraction;
    }

    public int Mul(int num1, int num2) {
        int Multiplication = num1 * num2;
        System.out.println("\n Multiplication Is:"+Multiplication);
        return Multiplication;
    }

    public int Div(int num1,int num2){
        int Division = num1 / num2;
        System.out.println("\n Division Is:"+ Division);
        return Division;
    }
}
