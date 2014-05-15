package ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName="BanqueWS")
public class BanqueService 
{
	
	@WebMethod(operationName="convertionEruroDH")
	public double conversion(@WebParam(name="montant")double montant)
	{
		return montant*11.3;
	}
	
	@WebMethod
	public String test()
	{
		return "test";
	}
	
	@WebMethod
	public Compte consulterCompte(@WebParam(name="code")int code)
	{
		return new Compte(1,Math.random()*800);
	}

	@WebMethod
	public List<Compte> listComptes()
	{
		List<Compte>cptes=new ArrayList<Compte>();
		cptes.add(new Compte(2,Math.random()*300));
		cptes.add(new Compte(3,Math.random()*400));
		cptes.add(new Compte(4,Math.random()*500));
		cptes.add(new Compte(5,Math.random()*600));
		return cptes;		
	}
	
}
