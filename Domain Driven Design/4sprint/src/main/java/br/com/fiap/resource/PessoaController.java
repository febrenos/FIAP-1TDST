package br.com.fiap.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.bo.PessoaBO;
import br.com.fiap.bo.PessoaService;
import br.com.fiap.to.PessoaTO;

@Path("/pessoa")
public class PessoaController {

	PessoaService ps = new PessoaBO();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<PessoaTO> buscar() {
		return ps.buscar();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public PessoaTO buscar(@PathParam("id") Long id) {
		return ps.buscar(id);

	}
}
