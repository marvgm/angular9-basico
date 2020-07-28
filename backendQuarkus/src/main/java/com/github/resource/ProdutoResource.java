package com.github.resource;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.github.domain.Produto;
import com.github.dto.CadastrarProdutosDTO;

@Path("produtos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoResource {
	
	@GET
	public List<Produto> buscarTodosProdutos(){
		return Produto.listAll();
	}
	
	@POST
	@Transactional
	public void buscarTodosProdutos(CadastrarProdutosDTO dto) {
		Produto produto = new Produto();
		produto.nome = dto.nome;
		produto.valor = dto.valor;
		produto.persist();
	}
	
	@PUT
	@Path("{id}")
	@Transactional
	public void buscarTodosProdutos(@PathParam("id") Long id, CadastrarProdutosDTO dto) {
		Optional<Produto> produtoCad = Produto.findByIdOptional(id);

		if (produtoCad.isPresent()) {
			Produto produto = produtoCad.get();
			produto.nome = dto.nome;
			produto.valor = dto.valor;
			produto.persist();
		} else {
			throw new NotFoundException();
		}
	}
	
	@DELETE
	@Path("{id}")
	@Transactional
	public void buscarTodosProdutos(@PathParam("id") Long id) {
		Optional<Produto> produtoCad = Produto.findByIdOptional(id);

		produtoCad.ifPresentOrElse(Produto::delete, () ->  {
			throw new NotFoundException();
		});
	}

}
