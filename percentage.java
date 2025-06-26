import java.util.Scanner;
public class percentage {
    public static void main(String[]args){
        Scanner src= new Scanner(System.in);
        String grade;
        System.out.println("enter the marks of the subject out of 100");
        System.out.println("maths");
        int m = src.nextInt();
        System.out.println("english");
        int e = src .nextInt();
        System.out.println("physics");
        int p= src.nextInt();
        System.out.println("chemistry");
        int c= src.nextInt();
        System.out.println("hindi");
        int h = src.nextInt();
        int av= m+e+p+c+h;
       //68 System.out.println("your mark percentage");
        double pre=( m+e+p+c+h)*100/500;
        System.out.println("your mark percentage"+pre+"%");
		String grade;
        if(pre==100||pre>90||pre>80){
            grade="A";
            System.out.println("Grade"+grade);
        } else if (pre>70||pre>50) {
            grade="B";
            System.out.println("Grade"+grade);
        } else if (pre>35) {
            grade="C";
           System.out.println("Grade"+grade);
        }
        else{
            System.out.println("you failed ");
        }
        System.out.println("your total marks are"+av);
        System.out.println("your percentage are"+pre+"%");
		System.out.println("your grade are"+ grade);

    }
}
