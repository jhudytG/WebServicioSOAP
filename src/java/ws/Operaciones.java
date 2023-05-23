/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author jhudy
 */
@WebService(serviceName = "Operaciones")
public class Operaciones {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "euroAdolar")
    public Double euroAdolar(@WebParam(name = "euros") double euros) {
        //TODO write your implementation code here:
        return euros * 1.15;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public boolean login(@WebParam(name = "usuario") String user, @WebParam(name = "clave") String pass) {
        //Credenciales de Acceso}
        boolean validar = false;
        String usu = "panq";
        String password = "123";
        if (usu.equals(user) && password.equals(pass)) {
            validar = true;
        }
        return validar;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operacionesBasicas")
    public float operacionesBasicas(@WebParam(name = "num1") float num1, @WebParam(name = "num2") float num2, @WebParam(name = "operacion") String operacion) {
        //TODO write your implementation code here:
        float resultado = 0;
        if (operacion.equalsIgnoreCase("Suma")) {
            resultado = num1 + num2;
        } else {
            if (operacion.equalsIgnoreCase("Resta")) {
                resultado = num1 - num2;
            } else {
                if (operacion.equalsIgnoreCase("Multiplicacion")) {
                    resultado = num1 - num2;
                } else {
                    if (operacion.equalsIgnoreCase("Division")) {
                        resultado = num1 - num2;
                    }
                }
            }
        }
        return resultado;
    }

    /**
     * Web service operation
     *
     */
    @WebMethod(operationName = "areadetriangulo")
    public float areadeTriangulo(@WebParam(name = "base") float base, @WebParam(name = "altura") float altura) {
        //TODO write your implementation code here:
        float areatring = ((base * altura) / 2);

        return areatring;
    }

    /**
     * Web service operation
     *
     * @return
     */
    @WebMethod(operationName = "velocidad")
    public float velocidad(@WebParam(name = "distancia") float distancia, @WebParam(name = "tiempo") float tiempo) {
        //TODO write your implementation code here:
        float v = (distancia / tiempo);      
        return v;
    }

    /**
     * Web service operation
     *
     *
     * @return
     */
    @WebMethod(operationName = "leyNewton")
    public float leyNewton(@WebParam(name = "masa") float masa, @WebParam(name = "aceleracion") float aceleracion) {
        //TODO write your implementation code here:
        float fuerza = masa * aceleracion;
        return fuerza;
    }
}
