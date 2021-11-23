/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "calAreaCiecle")
public class calAreaCiecle {
    @WebMethod(operationName = "calArea")
    public double calArea(@WebParam(name = "r") double r) {
        //TODO write your implementation code here:
        return 3.14 * (r * r);
    }
}
