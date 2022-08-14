package br.com.cadastroclientes_.infotec.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.cadastroclientes_.infotec.model.Cliente;
import br.com.cadastroclientes_.infotec.repository.ClienteRepository;


/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
public class GreetingsController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
    /**
     *
     * @param name the name to greet
     * @return greeting text
     */
	 @RequestMapping(value = "/mostrarnome/{name}", method = RequestMethod.GET)
	    @ResponseStatus(HttpStatus.OK)
	    public String greetingText(@PathVariable String name) {
	        return "Hello " + name + "!";
	    }
	    
	    @RequestMapping(value = "/olamundo/{nome}", method = RequestMethod.GET)
	    @ResponseStatus(HttpStatus.OK)
	    public String retornaOlaMundo(@PathVariable String nome) {
	    	

	    	Cliente cliente = new Cliente();
	    	cliente.setNome(nome);
	    	clienteRepository.save(cliente);/*Grava no banco de dados*/
	    	
	    	return "Olá mundo " + nome;
	    	
	    }
	    @GetMapping(value = "listatodos")/*Nosso primeiro método de API*/
	    @ResponseBody/*Retorna os dados para o corpo da resposta*/
	    public ResponseEntity<List<Cliente>> listaCliente(){
	    	
	    	List<Cliente> cliente = clienteRepository.findAll();/*Executa a consulta no banco de dados*/
	    	
	    	return new ResponseEntity<List<Cliente>>(cliente, HttpStatus.OK);/*Retorna a lista em JSON*/ 
	    }
	    
	    
	    @PostMapping(value = "salvar")/*Mapeia a URL*/
	    @ResponseBody/*Descrição da resposta*/
	    public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente){/*Recebe os dados para salvar*/
	      
	    	Cliente client  = clienteRepository.save(cliente);
	      return new ResponseEntity<Cliente>(cliente, HttpStatus.CREATED);    	
	    	
	    }
	    
	    @DeleteMapping(value = "delete")/*Mapeia a URL*/
	    @ResponseBody/*Descrição da resposta*/
	    public ResponseEntity<String> delete(@RequestParam  Long idcliente){/*Recebe os dados para salvar*/
	     
	      clienteRepository.deleteById(idcliente);
	      return new ResponseEntity<String>("Cliente deletado com sucesso", HttpStatus.OK);
	    	
	    }    
	    @GetMapping(value = "buscarClienteid")/*Mapeia a URL*/
	    @ResponseBody/*Descrição da resposta*/
	    public ResponseEntity<Cliente> buscarclienteid(@RequestParam (name = "idcliente") Long idcliente){/*Recebe os dados para consultar*/
	     
	    	Cliente cliente = clienteRepository.findById(idcliente).get();
	      return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
	    	
	    }
	    @PutMapping(value = "atualizar")/*Mapeia a URL*/
	    @ResponseBody/*Descrição da resposta*/
	    public ResponseEntity<?> atualizar(@RequestBody Cliente cliente){/*Recebe os dados para salvar*/
	    	
	    	if (cliente.getId() == null) {
	    		return new ResponseEntity<String>("Id não informado para atualização. "
	    				+ "Informe o Id para continuar...", HttpStatus.OK);
	    	}
	    	
	    	Cliente client = clienteRepository.saveAndFlush(cliente);
	      return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
	       	
	    }  
	    @GetMapping(value = "buscarPorNome")/*Mapeia a URL*/
	    @ResponseBody/*Descrição da resposta*/
	    public ResponseEntity<List<Cliente>> buscaPorNome(@RequestParam (name = "name") String name){/*Recebe os dados para consultar*/
	     
	     List<Cliente> cliente = clienteRepository.buscarPorNome(name.trim().toUpperCase());
	      return new ResponseEntity<List<Cliente>>(cliente, HttpStatus.OK);
	    	
	    }
	}
