package prestamo.Modelo;
// Generated Apr 16, 2014 12:39:12 PM by Hibernate Tools 3.6.0



/**
 * Direccion generated by hbm2java
 */
public class Direccion  implements java.io.Serializable {


     private int id;
     private String calle;
     private Integer piso;
     private Integer numero;
     private String departamento;

    public Direccion() {
    }

	
    public Direccion(int id) {
        this.id = id;
    }
    public Direccion(int id, String calle, Integer piso, Integer numero, String departamento) {
       this.id = id;
       this.calle = calle;
       this.piso = piso;
       this.numero = numero;
       this.departamento = departamento;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getCalle() {
        return this.calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public Integer getPiso() {
        return this.piso;
    }
    
    public void setPiso(Integer piso) {
        this.piso = piso;
    }
    public Integer getNumero() {
        return this.numero;
    }
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }




}


