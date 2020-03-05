package com.example.addressDataService.controller;

import com.example.addressDataService.model.Address;
import com.example.addressDataService.service.AddressDataService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressDataServiceController {

    @Autowired
    AddressDataService addressDataService;

    @ApiOperation(value = "Retrieve address details by postcode", notes = "Retrieve address details by postcode")
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid input supplied"),
            @ApiResponse(code = 404, message = "Postcode not found"),
            @ApiResponse(code = 200, message = "Successful response send"),
            @ApiResponse(code = 500, message = "Server error")})
    @RequestMapping(value = "/api/v1/address/postcodes/{postcode}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody Address getAddressDetailsByPostcode(@PathVariable("postcode") String postcode) {
        Address res = addressDataService.getAddressDetailsByPostcode(postcode);
        return res;
    }


}
