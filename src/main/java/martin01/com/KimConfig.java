package martin01.com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"martin01.com"})
public class KimConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver() { 
		
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		 vr.setPrefix("/WEB-INF/");
		 vr.setSuffix(".jsp");
		
		
		return vr;
	}

}
