/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa05;

import java.util.Iterator;
import org.hibernate.Session;
import java.util.List;

/**
 *
 * @author mxaxe
 */
public class Programa05 {

    public static void main(String[] args) {
       // Session session = HibernateUtil.getSession();
       DAOEmpleado dao = new DAOEmpleado();
       Empleado empleado = new Empleado();
       //empleado.setClave(4);
       //empleado.setNombre("sagnax");
       //empleado.setDireccion("calle 1");
       //empleado.setTelefono("77777");
       
       //create
       //dao.create(empleado);
       
       //delete
       //dao.delete(1L);
       
       //update
       
       empleado.setNombre("fha");
       empleado.setDireccion("Calle 1");
       empleado.setTelefono("212712121");
       dao.update(empleado, 2L);

        //findAll
//        List<Empleado> lista= dao.findAll();
//        Iterator <Empleado> i = lista.iterator();
//        while(i.hasNext()){
//            empleado=i.next();
//            System.out.println(" Clave: "+empleado.getClave()+"\n Nombre: "+empleado.getNombre()+"\n Dirección: "+empleado.getDireccion()+"\n Telefono: "+empleado.getTelefono() + "\n <------------------------------>");
//        }

        //findbyID
//        empleado=dao.findbyID(3L);
//        System.out.println("Empleado encontrado con la clave "+empleado.getClave()+":\n Nombre: "+empleado.getNombre()+"\n Dirección: "+empleado.getDireccion()+"\n Telefono: "+empleado.getTelefono() + "\n");
        
        System.out.println("Hello World!");
    }
}
