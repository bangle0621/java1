
public class AccountingApp2 {



	public static void main(String[] args) {
	
		double valueofSupply =  Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueofSupply*vatRate;
		double total = valueofSupply + vat;
		double expense = valueofSupply*expenseRate;
		double income = valueofSupply-expense;
		
		double Dividend1;
		double Dividend2;
		double Dividend3;
		
		if(income>10000.0) {
		Dividend1 = income*0.5;
		Dividend2 = income*0.3;
		Dividend3 = income*0.2;
		} else {
		Dividend1 = income*1;
		Dividend2 = income*0;
		Dividend3 = income*0;
		}
		
		System.out.println("Value of supply : " +valueofSupply );
		System.out.println("VAT : " +vat);
		System.out.println("Total : " +total);
		System.out.println("Expense : " +expense);
		System.out.println("Income: " + income);
		System.out.println("Dividend 1: " + Dividend1);
		System.out.println("Dividend 2: " + Dividend2);
		System.out.println("Dividend 3: " + Dividend3);
		
	}

}
