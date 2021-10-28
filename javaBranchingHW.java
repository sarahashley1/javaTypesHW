//  Create a small program that defines some fields. Try creating some illegal field names and see
//  what kind of error the compiler produces.Use the naming rules and conventions as a guide.
//  In the program you created, try leaving the fields uninitialized and print out their values.
//  Try the same with a local variable and see what kind of compiler errors you can produce.
//  Becoming familiar with common compiler errors will make it easier to recognize bugs in your code.

public class Main
{
    int num1;
    public int mymethod(){
        int num5=0;
        int _num3=20;
        int num4=(num1+num5+_num3);
        System.out.println(num1);//global variable for int without initialize it gives 0
        System.out.println(num4);
//int 9num4; error as not a statement(illegal declaration)
//branching
        for(int k=0;k<10;k++){
            if(k==7)
            {
                break;
            }
            else if(k==5)
            {
                System.out.println("This is five");
                continue;
            }
            System.out.println(k);
        }
        return 0;
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.mymethod();
    }
}