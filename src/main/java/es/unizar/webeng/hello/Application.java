package es.unizar.webeng.hello;

/*
* SpringApplication contains a group of classes that can be used to bootstrap and
* launch a Spring application from the main method in Java.
*
* SpringBootApplication is used to indicate a configuration class that can declare
* several @Bean methods and triggers. It is equivalent to declaring @Configuration
* @EnableAutoConfiguration and @ComponentScan manually.
*
* SpringApplicationBuilder is a simpler builder for SpringApplication and ApplicationContext
* with an API.
*
* SpringBootServletInitializer binds an application that starts a Spring Boot with the servlet
* and filter mappings.
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/*
 * The @SpringBootApplication annotation configures the web application, adding
 * automatically all the configurations of Spring and JEE, which normally had to
 * be done manually. Optatives: the @SpringBootApplication annotation is equivalent
 * to using @Configuration, @EnableAutoConfiguration and @ComponentScan with their
 * default attributes.
 *
 * The @ComponentScan annotation tells Spring to look for other components, configurations,
 * and services in the the hello package, allowing it to find the HelloController.
 *
 * The @Configuration annotation tags the class as a source of bean definitions for the 
 * application context.
 *
 * The @EnableAutoConfiguration annotation says to Spring Boot to start adding beans based
 * on classpath settings, other beans, and various property settings.
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {

	/* 
	 * Initializes the server/application using the imported Spring classes. It has two parameters:
	 * The first parameter is the Object of the class itself
	 * The second parameter contains any argument that the Spring application might need. 
	 * Nonetheless a SpringApplication instance can also be created without passing the .class object
	 */
        SpringApplication.run(Application.class, args);
    }
    
    @Override
   /**
	* Overwrite configure method in order to customize 
	* the configuration of this application.
	* Sources or config classes can be added. 
	*
	* @param application 
	* @return original application with Application class added in sources
	*/
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}
