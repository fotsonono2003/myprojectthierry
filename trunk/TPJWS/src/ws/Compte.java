package ws;

public class Compte {
	private int code;
	private double solde;
	
	
	public Compte() {
	}
	public Compte(int code, double solde) {
		super();
		this.code = code;
		this.solde = solde;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	

}