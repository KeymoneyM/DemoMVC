package martin01.com;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller

public class Controller {
	
	@RequestMapping("/add")
	public void add() {
		
		System.out.println("Kimani is Smart");
	}
	
	

}
