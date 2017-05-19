package nl.sm422.fontysfatoe;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;

/**
 * @author Oscar de Leeuw
 */
@SpringBootApplication
public class Main {

    public static void main(String... args) {
        SpringApplication.run(Main.class);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.interceptors(Arrays.asList(new Fatoe())).build();
    }


    @Bean
    public CommandLineRunner run(RestTemplate template) throws Exception {
        return args -> {
            Teacher[] teacher = template.getForObject("https://api.fhict.nl/people/search/oosterkamp", Teacher[].class);
            System.out.println(teacher);
        };
    }

    public class Fatoe implements ClientHttpRequestInterceptor {

        private final static String AUTH_CODE = "";

        @Override
        public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
            request.getHeaders().add(HttpHeaders.ACCEPT, "application/json");
            request.getHeaders().add(HttpHeaders.AUTHORIZATION, AUTH_CODE);
            return execution.execute(request, body);
        }
    }
}


