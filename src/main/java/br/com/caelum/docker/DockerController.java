package br.com.caelum.docker;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DockerController {

	@RequestMapping(method = RequestMethod.GET,path="/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(method = RequestMethod.GET,path="/geraArquivos")
	public String geraArquivos() throws IOException {
		String fileData = "\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\"";
		FileOutputStream fos = new FileOutputStream("/output-container/Arquivo1.txt");
		fos.write(fileData.getBytes());
		fos.flush();
		fos = new FileOutputStream("/output-container/Arquivo2.txt");
		fos.write(fileData.getBytes());
		fos.flush();
		fos.close();
		return "gera";
	}
}
