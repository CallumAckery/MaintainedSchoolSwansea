package maintedschoolswansea;

import jakarta.jws.WebMethod;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.WebService;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface schoolinterface
{
    @WebMethod
    getschooldata getschoolNumber(String schoolNumber);
    
    @WebMethod
    getschooldata getschoolPostcode(String postCode);
    
    @WebMethod
    getschooldata getladCode(String laCode);
    
    @WebMethod
    getschooldata getphoneNumber(String phoneNumber);
    
    @WebMethod
    getschooldata getsector(String postCode);
    
}