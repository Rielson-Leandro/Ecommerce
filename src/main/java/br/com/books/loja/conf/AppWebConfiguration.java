/*O objetivo principal dessa classe é expor para a
Servlet do Spring MVC quais são as classes que devem ser lidas e carregadas*/
package br.com.books.loja.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.books.loja.controllers.HomeController;

@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class})/*Indica quais pacotes
devem ser lidos*/
public class AppWebConfiguration {
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

}
