package abc.docker.docker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Abubakar.Saifullah on 18-Nov-17.
 */

@RestController
public class DockerController {

    private static final Logger LOG = LoggerFactory.getLogger(DockerController.class);

    @GetMapping("/GetHelloWord")
    public String sayHello(@RequestParam(value = "name") String name) {
        String response = "Hello " + name + "!";

       System.out.println("======response: " + response);

       return response;
    }

    @GetMapping("/GetHelloWord2")
    public String sayHello() {
        String response = "Hello!";

        System.out.println("======response: " + response);

        return response;
    }

    @RequestMapping("/insertData")
    public String insert(@RequestParam(value = "name") String name
            ,@RequestParam(value = "email") String email
            ,@RequestParam(value = "date") String date) {

        System.out.println("===================insertData======================");
        System.out.println("=========================================name: " + name);
        System.out.println("=========================================email: " + email);
        System.out.println("=========================================date: " + date);
        Date date1=null;

        try {

            date1=new SimpleDateFormat("dd/MM/yyyy").parse(date);
            System.out.println("=========================================date1: " + date1);
        }catch(Exception e) {
            System.out.println("===============================exception: " + e);
        }

        return "Data has been successfully saved!";
    }

}
