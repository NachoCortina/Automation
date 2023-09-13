package pruebas;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.commonSetup;
import paginas.paginaRegister;

public class RegisterTest extends commonSetup{
	  paginaRegister register;
	
	  @Test
	  public void register_valid() throws Exception {
			
		  
			register= new paginaRegister(driver);
			register.registerPage();
	    	register.submitRegister("Juan","Perez","test1@gmail.com","123","123");
	        Assert.assertEquals(register.getvalidNote(),"Note: Your user name is test1@gmail.com."
	        		+ "");
	    }

}
