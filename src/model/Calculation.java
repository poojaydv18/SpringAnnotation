package model;

public class Calculation {

	private int n1;
	private int n2;
	private int ans;
	
	public Calculation() {
		super();
	}
	
	public Calculation(int n1, int n2, int ans) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.ans = ans;
	}

	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	public int getAns() {
		return ans;
	}

	public void setAns(int ans) {
		this.ans = ans;
	}

	public void cal()
	{
		int ans=n1+n1;
		System.out.println(ans);
	}
}
