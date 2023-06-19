package com.example.demo.controllers;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UsuarioDao;
import com.example.demo.models.Usuario;
@RestController
public class UsuarioController {
	@Autowired
	private UsuarioDao usuarioDao;
	
	@RequestMapping(value="lista")
		
		public List<Usuario> msotrarLista() {
			List<Usuario> lista = new ArrayList<>();
			Usuario usuario1 = new Usuario();
			usuario1.setId(3L);
			usuario1.setNombre("Jose");
			usuario1.setApellido("Perez");
			usuario1.setEmail("prejose@gmail.com");
			usuario1.setTelefono("26135675");
			
			Usuario usuario2 = new Usuario();
			
			usuario2.setId(4L);
			usuario2.setNombre("Julieta");
			usuario2.setApellido("Flores");
			usuario2.setEmail("pepe@gmail.com");
			usuario2.setTelefono("26121213");
			
			lista.add(usuario1);
			lista.add(usuario2);
			
			
			return lista;
			
			
		}
	
	@RequestMapping(value="api/usuario")
	public List<Usuario> mostrarUsuarioBd(){
		List<Usuario> user = usuarioDao.obtenerUsuario();
		return user;
	}
	
	
	
	
	
	
}
