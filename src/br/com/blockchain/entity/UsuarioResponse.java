/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blockchain.entity;

import java.io.Serializable;

/**
 *
 * @author Dayana
 */
public class UsuarioResponse implements Serializable{
    
    private Long codigo;
    private String email;
    
    private ClienteResponse clienteResponse;

    /**
     * @return the codigo
     */
    public Long getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the clienteResponse
     */
    public ClienteResponse getClienteResponse() {
        return clienteResponse;
    }

    /**
     * @param clienteResponse the clienteResponse to set
     */
    public void setClienteResponse(ClienteResponse clienteResponse) {
        this.clienteResponse = clienteResponse;
    }
    
   
}
