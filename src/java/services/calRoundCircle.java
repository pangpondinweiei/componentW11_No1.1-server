/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "calRoundCircle")
public class calRoundCircle {
    @WebMethod(operationName = "calRound")
    public double calRound(@WebParam(name = "r") double r) {
        return 2 * 3.14 * r;
    }
}
