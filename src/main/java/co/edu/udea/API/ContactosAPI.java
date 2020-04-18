package co.edu.udea.API;
import co.edu.udea.dto.Contacto;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactosAPI {

    @RequestMapping(value ="/contactos",method = RequestMethod.GET)
    public Contacto getById(){
        return new Contacto(10L,"Weimar","Quintero","3045917068","weimar.quintero@udea.edu.co");
    }
}
