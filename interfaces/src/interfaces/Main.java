package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ICustomerDal[] ─▒cCustomerDal = {new OracleCustomerDal(),new MySqlCustomerDal()};
		
		for (ICustomerDal iCustomerDal : ─▒cCustomerDal) {
			iCustomerDal.Add();
		}
		
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		
		customerManager.add();
		
		
	}

}
