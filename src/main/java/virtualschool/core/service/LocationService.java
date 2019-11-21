/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualschool.core.service;

import java.util.List;
import virtualschool.core.entity.Location;
import virtualschool.core.repository.LocationDAO;

/**
 *
 * @author nzoda
 */
public class LocationService {
    public static List<Location> getAllLocation(){
        return LocationDAO.getAllLocation();
    }
}
