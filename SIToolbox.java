import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("########Simple Interest Toolbox########");
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Simple Interest & Amount. ");
        System.out.println("2. Principal. ");
        System.out.println("3. Time. ");
        System.out.println("4. Rate. ");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();
        if (choice==1 ){
            System.out.print("Enter principal: ");
            double p = sc.nextDouble();
            System.out.print("Enter time: ");
            double t = sc.nextDouble();
            System.out.print("Enter rate of interest: ");
            double r = sc.nextDouble();
            double si = (p*r*t)/100;
            double amt = p+si;
            System.out.println("Simple Interest: "+si);
            System.out.println("Amount: "+amt);
        }
        if (choice==2){
            System.out.print("Enter time: ");
            double t = sc.nextDouble();
            System.out.print("Enter rate of interest: ");
            double r = sc.nextDouble();
            System.out.print("Enter Interest: ");
            double si = sc.nextDouble();
            double p = (si*100)/(r*t);
            System.out.println("Principal: "+p);
        }
        if (choice == 3) {
            System.out.print("Enter principal: ");
            double p=sc.nextDouble();
            System.out.print("Enter interest: ");
            double si = sc.nextDouble();
            System.out.print("Enter rate of interest: ");
            double r= sc.nextDouble();
            double t = (si*100)/(p*r);
            System.out.println("Time: "+t);
        }
        if (choice==4) {
            System.out.print("Enter principal: ");
            double p=sc.nextDouble();
            System.out.print("Enter interest: ");
            double si = sc.nextDouble();
            System.out.print("Enter time: ");
            double t= sc.nextDouble();
            double r = (si*100)/(t*p);
            System.out.println("Rate: "+r);
        }
    }    
}
