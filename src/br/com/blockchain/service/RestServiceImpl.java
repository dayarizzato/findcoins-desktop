/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blockchain.service;

import br.com.blockchain.util.Constantes;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 *
 * @author Dayana
 */
public class RestServiceImpl {
    public ClientResponse post(final String url, final Object object) {
        Client client = Client.create();
        WebResource resource = client.resource(Constantes.LOCALHOST.concat(url));
        return resource.type("application/json")
                .accept("application/json")
                .post(ClientResponse.class, object);
    }
    
    public ClientResponse get(final String url) {
        Client client = Client.create();
        WebResource resource = client.resource(Constantes.LOCALHOST.concat(url));
        return resource.type("application/json")
                .accept("application/json")
                .get(ClientResponse.class);
    }
    
    public ClientResponse put(final String url, final Object object) {
        Client client = Client.create();
        WebResource resource = client.resource(Constantes.LOCALHOST.concat(url));
        return resource.type("application/json")
                .accept("application/json")
                .put(ClientResponse.class, object);
    }
}
