/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PaisServicio;

import java.util.List;
import modelo.Pais;

/**
 *
 * @author PC-1
 */
public interface IPaisServicio {
    
        public Pais crear(Pais p);
        public Pais modificar(int c, Pais p);
        public Pais eliminar(int c);
        public List<Pais> listar();
        public int buscarPosicion(int c);
    }
