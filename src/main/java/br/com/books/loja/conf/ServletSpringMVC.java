package br.com.books.loja.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	/*Nele,
será retornada uma oumais classes responsáveis por indicar quais outras classes
devem ser lidas durante o carregamento da aplicação web*/
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{AppWebConfiguration.class};
	}

	@Override
	/*Aqui é onde você
diz qual é o padrão de endereço que vai ser delegado para o Servlet do Spring
MVC*/
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
