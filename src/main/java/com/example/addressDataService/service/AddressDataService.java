package com.example.addressDataService.service;

/*import com.example.addressDataService.dao.AddressDao;*/

import com.example.addressDataService.model.Address;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AddressDataService {
    static List<Address> addList = new ArrayList<>();

/*    @Autowired
    AddressDao addressDao;*/

    //Initialize collection statically
    static {
        Address add = new Address();

        add.setPostcode("EC23CD");
        add.setType("HOME");
        add.setId(1);
        addList.add(add);
        Address add2 = new Address();

        add2.setPostcode("EC11QR");
        add2.setType("OFFICE");
        add2.setId(2);
        addList.add(add2);
    }

    public Address getAddressDetailsByPostcode(String postcode) {
        for (Address add : addList) {
            if (postcode != null && add.getPostcode().equalsIgnoreCase(postcode.replaceAll("\\s+",""))) {
                Address ad = new Address();
                ad.setType(add.getType());
                ad.setPostcode(add.getPostcode());
                return ad;
            }
        }
        return null;
    }
}
