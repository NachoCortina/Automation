package pruebas;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.commonSetupAE;
import paginas.AE_Register;
import database.Database;
import database.UsuarioDataBase;

public class AE_RegisterTest extends commonSetupAE {
    AE_Register register;
    
    

    @Test(priority = 1,description = "Access to register/login section --> Fill txt and register")
    public void register_start() throws Exception{
        
        UsuarioDataBase usuarioDB = Database.conexiondb();        
        
        String email = Math.random() + "@Test.com";
        register = new AE_Register(driver);
        register.registerPage(usuarioDB.getName(), email);
        register.completeRegister("Nachito","hola", "14", 
        "February", "1998", "Cortina", 
        "Calle siempre viva 123", "Canada", 
        "Montevideo", "Aguada", "11800",
        "099641458");
        Assert.assertEquals(register.getValidNoteCompleteRegister(),"ACCOUNT CREATED!");

    }

    
}
