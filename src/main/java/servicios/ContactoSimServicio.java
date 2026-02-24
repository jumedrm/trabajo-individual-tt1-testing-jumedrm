package servicios;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import interfaces.InterfazContactoSim;
import modelo.DatosSimulation;
import modelo.DatosSolicitud;
import modelo.Entidad;

@Service
public class ContactoSimServicio implements InterfazContactoSim {

    @Override
    public int solicitarSimulation(DatosSolicitud sol) {
        // lo dejo vacío y pongo un retorno sin más
        return -1;
    }

    @Override
    public DatosSimulation descargarDatos(int ticket) {
        return null;
    }

    @Override
    public List<Entidad> getEntities() {
        return new ArrayList<>();
    }

    @Override
    public boolean isValidEntityId() {
        return false;
    }
}