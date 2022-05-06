/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaisServicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Pais;

/**
 *
 * @author PC-1
 */
public class PaisServicio implements IPaisServicio{
    
    public final List<Pais> paisList = new ArrayList<>();
    
    @Override
    public Pais crear(Pais p) {
        this.paisList.add(p);
        return p;
    }

    @Override
    public Pais modificar(int c, Pais p) {
        this.paisList.set(this.buscarPosicion(c), p);
        return p;
    }

    @Override
    public Pais eliminar(int c) {
        var pais=this.paisList.get(this.buscarPosicion(c));
        this.paisList.remove(this.buscarPosicion(c));
        return pais;
    }

    @Override
    public List<Pais> listar() {
        return this.paisList;
    }

    @Override
    public int buscarPosicion(int c) {
        var posicion=-1;
        var i=0;
        for(var auxPais:this.paisList){
            if(auxPais.getCodigo()==c){
                posicion=i;
                break;
            }
            i++;
        }
        return posicion;
    }
}
