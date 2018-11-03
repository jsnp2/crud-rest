package com.cliente.crudrest.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cliente.crudrest.models.Cliente;
import com.cliente.crudrest.repository.ClienteRepository;

@RestController
@RequestMapping(value="/api")
public class ClienteResource {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping("/pesAll")
	public List<Cliente> listaClientes(){
		return clienteRepository.findAll();
	}
	
	@PostMapping("/pesIndi")
	public Cliente listaClienteUnico(@RequestBody @Valid Cliente cliente){
		return clienteRepository.findById(cliente.getId());
	}
	
	@PostMapping("/salvar")
	public Cliente salvar(@RequestBody @Valid Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@DeleteMapping("/del")
	public void deletaCliente(@RequestBody @Valid Cliente cliente) {
		clienteRepository.delete(cliente);
	}
	
	@PutMapping("/edit")
	public Cliente atualizaCliente(@RequestBody @Valid Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	 

}
