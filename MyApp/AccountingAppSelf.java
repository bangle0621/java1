
public class AccountingAppSelf {

	public static void main(String[] args) {

		double ValueofSupply = 10000.0;
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double VAT = ValueofSupply*vatRate;
		double Expense = ValueofSupply*expenseRate;
		double Total = ValueofSupply + VAT;
		double Income = ValueofSupply - Expense;
		double Dividend1 = Income*0.5;
		double Dividend2 = Income*0.3;
		double Dividend3 = Income*0.2;
		
		
		
		
	
		
		System.out.println("Value of Supply:" + ValueofSupply);
		System.out.println("VAT:" + VAT);
		System.out.println("Total:" + Total);
		System.out.println("Expense:" + Expense);
		System.out.println("Income:" + Income);
		System.out.println("Dividend 1:" + Dividend1);
		System.out.println("Dividend 2:" + Dividend2);
		System.out.println("Dividend 3:" + Dividend3);
		

	}

}
