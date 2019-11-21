/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualschool.core.repository;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import virtualschool.core.entity.Location;
import virtualschool.core.tools.HibernateUtil;

/**
 *
 * @author nzoda
 */
public class LocationDAO {

    public static Session session = HibernateUtil.getSessionFactory().openSession();

    public static Long addLocation(Location location) {
        try {
            session.beginTransaction();
            Long insertId = (Long) session.save(location);
            session.getTransaction().commit();
            return insertId;
        } catch (HibernateException ex) {
            return null;
        } finally {
            session.close();
        }
    }

    public static List<Location> getAllLocation() {
        try {
            Query query = session.createQuery("FROM Location");
            return query.list();
        } catch (HibernateException ex) {
            return null;
        } finally {
            session.close();
        }
    }

}
