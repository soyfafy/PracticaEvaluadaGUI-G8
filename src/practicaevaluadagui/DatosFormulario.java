
package practicaevaluadagui;

/**
 *
 * @author Grupo8-Cliente/Servidor Concurrente
 */
public class DatosFormulario {
    String codigoP;
    String nombreP;
    int precioP;

    public DatosFormulario() {
    }

    public DatosFormulario(String codigoP, String nombreP, int precioP) {
        this.codigoP = codigoP;
        this.nombreP = nombreP;
        this.precioP = precioP;
    }

    public String getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(String codigoP) {
        this.codigoP = codigoP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public int getPrecioP() {
        return precioP;
    }

    public void setPrecioP(int precioP) {
        this.precioP = precioP;
    }

    @Override
    public String toString() {
        return "Los datos ingresados al Formulario son: " + "codigo:" + codigoP + ", Nombre:" + nombreP + ", Precio:" + precioP + '}';
    }
    
    
    
    
    
    
    
}
