package br.com.caelum.docker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DockerController {

	@RequestMapping(method = RequestMethod.GET,path="/")
	public String index() {
		return "index";
	}
}
