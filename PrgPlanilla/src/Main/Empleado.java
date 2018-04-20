/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Francisco
 */
public abstract class Empleado {
    public String codigo;
    public String nombre;
    public String apellido;
    public double deduccion;
    public double salHora;
    public int horaTrab;

    public Empleado(String codigo, String nombre, String apellido, double deduccion, double salHora, int horaTrab) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.deduccion = deduccion;
        this.salHora = salHora;
        this.horaTrab = horaTrab;
    }

    public Empleado() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getDeduccion() {
        return deduccion;
    }

    public void setDeduccion(double deduccion) {
        this.deduccion = deduccion;
    }

    public double getSalHora() {
        return salHora;
    }

    public void setSalHora(double salHora) {
        this.salHora = salHora;
    }

    public int getHoraTrab() {
        return horaTrab;
    }

    public void setHoraTrab(int horaTrab) {
        this.horaTrab = horaTrab;
    }
    
    
}
