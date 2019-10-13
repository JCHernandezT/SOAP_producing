package com.example.soap.producing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProducingApplication {
	
	/*
	 * Example of producing a SOAP service, run as "mvn spring-boot:run".
	 * https://spring.io/guides/gs/producing-web-service/
	 * Use SoapUi to make a request:
	 * 
	 * http://localhost:8091/ws/countries.wsdl
	 * 
	 * <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
	 *				  xmlns:gs="http://spring.io/guides/gs-producing-web-service">
	 *	   <soapenv:Header/>
	 *	   <soapenv:Body>
	 *	      <gs:getCountryRequest>
	 *	         <gs:name>Spain</gs:name>
	 *	      </gs:getCountryRequest>
	 *	   </soapenv:Body>
	 *	</soapenv:Envelope>
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(ProducingApplication.class, args);
	}

}
