package net.esilva.helloboot;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) // defines a random port to server
public class HelloBootControllerIT {

    // gets which port it has been assigned
    @LocalServerPort
    private int port;

    private URL base;

    // sub-class of RestTemplace, suitable to perform calls to rest endpoints
    @Autowired
    private TestRestTemplate template;

    // sets up basic elements to be used by the server
    @Before
    public void setUp() throws Exception {
        this.base = new URL("http://localhost:" + port + "/hello");
    }

    @Test
    public void getHello() throws Exception {
        ResponseEntity<String> response = template.getForEntity(base.toString(),
                String.class);
        assertThat(response.getBody(), equalTo("Hello, I am Boot, Spring Boot!"));
    }
}

