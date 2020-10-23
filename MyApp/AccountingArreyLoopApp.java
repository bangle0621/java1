
public class AccountingArreyLoopApp {

	public static void main(String[] args) {

		double ValueofSupply = 10000.0;
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double VAT = ValueofSupply*vatRate;
		double Expense = ValueofSupply*expenseRate;
		double Total = ValueofSupply + VAT;
		double Income = ValueofSupply - Expense;
		
		double[] DividendRates = new double [3];
		DividendRates[0] = 0.5;
		DividendRates[1] = 0.3;
		DividendRates[2] = 0.2;
		

		System.out.println("Value of Supply:" + ValueofSupply);
		System.out.println("VAT:" + VAT);
		System.out.println("Total:" + Total);
		System.out.println("Expense:" + Expense);
		System.out.println("Income:" + Income);
//		System.out.println("Dividend 1:" + Dividend1);
//		System.out.println("Dividend 2:" + Dividend2);
//		System.out.println("Dividend 3:" + Dividend3);
//		

		
		int i = 0;
		while(i<(DividendRates.length)) {
			System.out.println("Dividend" + (i+1) + ":" + (Income*DividendRates[i]));
			i = i + 1;
		}

		
	}


}


