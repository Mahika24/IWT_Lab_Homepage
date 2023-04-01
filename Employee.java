package p_sks;
import static java.lang.System.exit;
import java.util.Scanner;
public class Employee 
{
    public static void main(String args[])
    {
        String EmpID, EmpName, Dept, Desgntn, YOJ;
        Scanner sc=new Scanner(System.in);
        //for 4 entries
        for(int i=1001; i<=1004 ;i++)
        {
                System.out.println("EmployeeID: "+i);
                System.out.println("Enter employee name: ");
                EmpName=sc.next();
                System.out.println("Enter Department name: ");
                Dept=sc.next();
                System.out.println("Enter Desination: ");
                Desgntn=sc.next();
                System.out.println("Enter Year of joining: ");
                YOJ=sc.next();
                System.out.println("Employees joining details are as follows: ");
                System.out.println(EmpName+"    "+Dept+"   "+Desgntn+"   "+YOJ);
        }        
    }
}

