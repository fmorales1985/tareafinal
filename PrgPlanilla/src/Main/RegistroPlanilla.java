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
public class RegistroPlanilla extends Empleado{
    public int horaExtra;
    public double pagoExtra;
    public double salBruto;
    public double ihss;
    public double salNeto;

    public RegistroPlanilla(String codigo, String nombre, String apellido, double deduccion, double salHora, int horaTrab) {
        super(codigo, nombre, apellido, deduccion, salHora, horaTrab);
    }
    
    public RegistroPlanilla(){}
    
    public void calcularPago(){
        this.horaExtra = 0;
        if(super.getHoraTrab()>44){
         horaExtra = super.getHoraTrab() - 44;
        }
        this.pagoExtra = (super.getSalHora()*1.50)*horaExtra;
        this.salBruto = (super.getSalHora()*44)+pagoExtra;
        this.ihss = 0;
        double salMes = salBruto * 4;
        if(salMes<8882.30){
            this.ihss = salBruto*0.25;
        }
        if(salMes<7717.50){
            this.ihss = this.ihss + salBruto*0.25;
        }
        
        this.salNeto = salBruto - ihss - super.getDeduccion();
    }

    public int getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(int horaExtra) {
        this.horaExtra = horaExtra;
    }

    public double getPagoExtra() {
        return pagoExtra;
    }

    public void setPagoExtra(double pagoExtra) {
        this.pagoExtra = pagoExtra;
    }

    public double getSalBruto() {
        return salBruto;
    }

    public void setSalBruto(double salBruto) {
        this.salBruto = salBruto;
    }

    public double getIhss() {
        return ihss;
    }

    public void setIhss(double ihss) {
        this.ihss = ihss;
    }

    public double getSalNeto() {
        return salNeto;
    }

    public void setSalNeto(double salNeto) {
        this.salNeto = salNeto;
    }
    
}
