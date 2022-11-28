import java.util.Scanner;

public class TaxDeduction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salary;
		System.out.println("Enter your Salaray : ");
		salary = sc.nextDouble();
		double tax = 0;
		double tax_amount = 0.0;
		
		if((salary > 10000) && (salary <15000))
		{
			tax = 0.4 * salary;
		}
		else if((salary >= 15000) &&  (salary<20000))
		{
			tax = 0.06;
			tax_amount = 0.06 * salary;
		}
		else if((salary >= 20000) && (salary < 25000))
		{
			tax = 0.8;
			tax_amount = 0.08 * salary;
		}
		else if((salary >= 25000) && (salary < 30000))
		{
			tax = 0.10;
			tax_amount = 0.10 * salary;
		}
		else if(salary >= 30000)
		{
			tax = 0.12;
			tax_amount = 0.12 * salary;
		}
		System.out.println("Tax deduction from salary is : "+tax);
		System.out.println("The tax balance to be paid is : "+tax_amount);
		System.out.println("Salary after tax deduction is :"+(salary - tax_amount));
	}

}