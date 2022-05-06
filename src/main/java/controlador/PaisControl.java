/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import PaisServicio.PaisServicio;
import modelo.Pais;
import modelo.Provincia;

/**
 *
 * @author PC-1
 */
public class PaisControl {
    
    public PaisServicio paisServicio = new PaisServicio();
   
    public Pais crear(int c , String n,  int p, int cP, String nP){
        var provincia = new Provincia(cP, nP);
        var pais = new Pais(c,n,uP, Provincia);
        this.PaisServicio.crear(pais);
        return pais;
    }
    
    public Pais eliminar(int c) {
        return this.paisServicio.eliminar(c);
    }
    
    public Pais modificar(int c, Pais p) {
        return this.paisServicio.modificar(c,p);
    }
   
    public List<Pais> listar()
    {
        return this.paisServicio.listar();
    }

    public void crear(int i, String titanic, String ecuador, String b0HC, int i0, String sparrow) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
