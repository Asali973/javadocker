package backend.utilisateur.projetIsika.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import backend.utilisateur.projetIsika.Entity.User;



@Controller
public class NameController {
	
	
	@GetMapping("/")
	public String index(Model model) {
		User user = new User();

		model.addAttribute("user", user);

		return "index";
	}

	@PostMapping(value = "/saisirNom")
	public String saisirNom (User user, Model model) {
		String reponse = "Bonjour " + user.getName() +  " ... Vous êtes bien matinal ...";
		model.addAttribute("reponse", reponse);
		return "pageReponse";
	}
	
}
