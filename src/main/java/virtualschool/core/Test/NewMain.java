package virtualschool.core.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import virtualschool.core.entity.Location;
import virtualschool.core.service.LocationService;

/**
 *
 * @author nzoda
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocationService.getAllLocation().forEach((Location location) -> {
            System.out.println(location);
        });
    }
    
}
