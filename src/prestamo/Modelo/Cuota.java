package prestamo.Modelo;
// Generated Apr 16, 2014 12:39:12 PM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;

/**
 * Cuota generated by hbm2java
 */
public class Cuota  implements java.io.Serializable {


     private int id;
     private Integer numero;
     private BigDecimal monto;
     private Date fechaVencimiento;

    public Cuota() {
    }

	
    public Cuota(int id) {
        this.id = id;
    }
    public Cuota(int id, Integer numero, BigDecimal monto, Date fechaVencimiento) {
       this.id = id;
       this.numero = numero;
       this.monto = monto;
       this.fechaVencimiento = fechaVencimiento;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Integer getNumero() {
        return this.numero;
    }
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public BigDecimal getMonto() {
        return this.monto;
    }
    
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }
    public Date getFechaVencimiento() {
        return this.fechaVencimiento;
    }
    
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }




}


