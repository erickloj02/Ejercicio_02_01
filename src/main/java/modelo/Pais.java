/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author PC-1
 */
public class Pais {
    
    private int codigo;
    private String nombre;
    private int poblacion;
    private Provincia unaProvincia;

    public int obtenerPoblacion(){
        var retorno =50000000;
        return retorno;
    }
 
    public Pais(int codigo, String nombre, int poblacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public Provincia getUnaProvincia() {
        return unaProvincia;
    }

    public void setUnaProvincia(Provincia unaProvincia) {
        this.unaProvincia = unaProvincia;
    }

    @Override
    public String toString() {
        return "Pais{" + "codigo=" + codigo + ", nombre=" + nombre + 
                ", poblacion=" + poblacion + ", unaProvincia=" + unaProvincia + '}';
    }


}
