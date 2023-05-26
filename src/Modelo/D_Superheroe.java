/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Modelo.Superheroe;
import java.sql.CallableStatement;
public class D_Superheroe extends conexion {
    public int Guardar(Superheroe p){
        int respuesta=0;
        try {
            
            CallableStatement cmd = getConnection() .prepareCall("(CALL NUE_HEROE(?,?,?))");
            cmd.setInt(1,p.getId_super());
            cmd.setString(2,p.getNom_super());
            cmd.setInt(3,p.getSalud());
            
            respuesta = cmd.executeUpdate();
        } catch (Exception e){
        }
        return respuesta;
    }
}
