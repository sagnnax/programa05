/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa05;

import java.util.List;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author mxaxe
 */
public class DAOEmpleado implements IDAOGeneral<Empleado, Long>{

    @Override
    public Empleado create(Empleado p) {
        Session  session = HibernateUtil.getSession();
        Transaction t=session.beginTransaction();
        session.save(p);
        Logger.getLogger(DAOEmpleado.class.getName()).log(java.util.logging.Level.INFO, "No se realizo");
        t.commit();
        session.close();
        return p;
    }
    

    @Override
    public boolean delete(Long id) {
        Session  session = HibernateUtil.getSession();
        Transaction t=session.beginTransaction();
        Empleado emp = new Empleado();
        Empleado empleado = findbyID(id);
        if (empleado ==null)
            return false;
        else{
            session.delete(empleado);
            return true;
        }
        
        
//        emp.setClave(id);
//        session.delete(emp);
//        t.commit();
//        session.close();
//        return true;
    }

    @Override
    public Empleado update(Empleado p, Long id) {
        Session  session = HibernateUtil.getSession();
        Transaction t=session.beginTransaction();
        
        Empleado empleado = findbyID(id);
        if (empleado!=null)
            session.update(empleado);
        t.commit();
        session.close();
        return empleado;
        }
        
        
//        session.update(p);
//        t.commit();
//        session.close();
//        return true;
//    }

    @Override
    public List<Empleado> findAll() {
        Session session = HibernateUtil.getSession();
        Transaction t =session.beginTransaction();
        List<Empleado>listEmpleado;
       // listEmpleado = session.createCriteria(Empleado.class).list();
        listEmpleado  =  session.createQuery("from ejemplo").list(); //con query en hql
        t.commit();
        session.close();
        return listEmpleado;
    }

    @Override
    public Empleado findbyID(Long id) {
        Session session = HibernateUtil.getSession();
        Transaction t =session.beginTransaction();
        Empleado emp = (Empleado)session.get(Empleado.class, id);
        t.commit();
        session.close();
        return emp;
    }
    
    
    
}
