/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GX505DT
 */
public class ColaSimple {
    protected char[] cola = new char[10];
    protected int ini = -1;
    protected int fin = -1;
    protected char valorEliminado;
    
    public boolean insertar(char valor){
        if(fin == cola.length-1){
            return false;
        }
        fin ++;
        cola[fin] = valor;
        if(fin == 0 && ini == -1){
            ini++;
        }
        
        return true;
    }
    
    public boolean eliminar(){
        if(ini==-1 && fin==-1){
            return false;
        }
        valorEliminado = cola[ini];
        if(ini==fin && ini!=-1){
            ini=-1;
            fin=-1;
            return true;
        }
        ini++;
        
        return true;
    }
    
    public char valorEliminado(){
        return valorEliminado;
    }
    
    public int valorINI(){
        return ini;
    }
    
    public int valorFIN(){
        return fin;
    }
    
    public char[] contenidoCola(){
        return cola;
    }
}
