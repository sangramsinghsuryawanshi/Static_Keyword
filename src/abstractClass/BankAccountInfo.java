package abstractClass;
abstract class BankAccount
{
	abstract void deposite();
	abstract void withdrwal();
}
class SavingAccount extends BankAccount
{
	int dammount=20000;
	void deposite()
	{
		System.out.println("Abstract class dammount method from SavingAccount: "+dammount);
	}
	void withdrwal()
	{
		int wamount=3000;
		this.dammount-=wamount;
		System.out.println("Abstract class withdrwal method from SavingAccount: "+wamount);
		System.out.println("Abstract class withdrwal method from SavingAccount remaning amount is : "+dammount);
	}
}
class CurrentAccount extends BankAccount
{
	int dammount=10000;
	void deposite()
	{
		System.out.println("Abstract class dammount method from CurrentAccount: "+dammount);
	}
	void withdrwal()
	{
		int wamount=1000;
		this.dammount-=wamount;
		System.out.println("Abstract class withdrwal method from CurrentAccount: "+wamount);
		System.out.println("Abstract class withdrwal method from CurrentAccount remaning amount is : "+dammount);
	}
}
public class BankAccountInfo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BankAccount c = new SavingAccount();
		c.deposite();
		c.withdrwal();
		
		BankAccount t = new CurrentAccount();
		t.deposite();
		t.withdrwal();
	}

}
